package HomeWork_44;

public class Car implements Comparable<Car>{

    public String name;
    public String model;
    public int price;

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }




    @Override
    public int compareTo(Car car) {// надо определить порядок сортировки, который задан в условии
        int flag = this.model.compareTo(car.model); //  сравниваем модели
        if (flag==0){ //  если модели одинаковые
            flag = Integer.compare(this.price, car.price); // сравниваем по цене
        }
        return flag;
    }
}
