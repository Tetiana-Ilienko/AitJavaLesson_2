package Lesson_31;
//    Обобщения, Дженерики Generics
public class Person <T>{ //  буква обозначает обобщенный тип
    private String name;
    private T age; // показываем где мы будем использовать этот тип

    public Person(String name, T age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public T getAge() { // потом мы будем менять Т на конкретный тип
        return age;
    }
        }
