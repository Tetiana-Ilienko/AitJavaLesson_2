package Lesson_40_Set;

import java.util.Objects;

public class Order {


    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) { //  переопределяем метод  equals() для нашего  класса
//
//        if (this == obj) return true; //  если адреса равны вернуть true
//        if (!(obj instanceof Order)) return false; // является ли объект obj экземпляром (или наследником)
//        класса Order или его подклассом. . Если это условие истинно (то есть, obj не является объектом Order),
//        то выполняется код внутри блока if
//
//        Order order = (Order) obj;
//        return id == order.id && name.equals(order.name); // если оба поля равны, значит метод вернет true
//
//    }


    // идея может сама переопределить метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o; // проводит кастинг (переопределяет класс объекта)
        return id == order.id && Objects.equals(name, order.name); // сравнивает поля, через класс Objects.equals()
    }

    @Override
    public int hashCode() {
       return Objects.hash(id, name); //  автоматическая реализация идеи
        //return id*name.hashCode(); // вариант реализации метода
    }
}
