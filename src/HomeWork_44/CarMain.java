package HomeWork_44;

import java.util.*;

public class CarMain {

    /*
    Есть класс автомобиль, в котором есть три поля: Марка, Модель, Цена. Написать метод, который принимает
    лист автомобилей, а возвращает TreeMap,  ключами которого являются марки автомобилей, а значениями TreeSet
    автомобилей, в котором автомобили расположены в лексикографическом порядке относительно модели,
    причем дешевые вперед если модели одинаковые.
    public Map<String, Set<Auto>> autoByMake( List<Auto> autos)


    BMW
    make BMW
    model BMWModel1
    price 100 000

    make BMW
    model BMWModel2
    price 150 000

    BMW = [ {make = BMW, model = BMWModel1, price 100000},{make = BMW, model = BMWModel2, price 100000}]

    Map<

     */
    public Map<String, Set<Car>> carByMake(List<Car> autos){
        // МЫ обходим лист, смотрим - есть ли такой ключ
        // если есть - добавляем элемент в Set
        //  если его нет - заводим новый
        Map<String,Set<Car>> carByName = new TreeMap<>();
        for (Car car: autos){ //  идет по листу
            if (carByName.containsKey(car.name)){ // если там есть такое авто
                Set<Car> value = carByName.get(car.name);// вызвать значение по этому ключу, которое храниться в сете
                // который является значением мапы
                value.add(car);// добавляем туда новую записть
                carByName.put(car.name, value);//  записываем обратно все в мапу

            } else { //  если такого ключа нет
                Set<Car> value = new TreeSet<>();
                value.add(car);
                carByName.put(car.getName(), value);
            }

        }
        return carByName;

    }

    public static void main(String[] args) {

        Car car1 = new Car("Volvo","c60",10);
        Car car2 = new Car("Mercedes","amers",40000);
        Car car3 = new Car("Volvo","a60",5000);
        Car car4 = new Car("Volvo","a60",1000);
        Car car5 = new Car("Mercedes","bmers",39000);
        Car car6 = new Car("Mercedes","bmers",1000000);
        Car car7= new Car("BMW","X5",100000);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        CarMain carMain = new CarMain(); // чтобы вызвать не статический метод cоздаем объект класса
        /*
        вызов метода через объект класса (carMain.carByMake(cars)) предполагает, что метод carByMake()
        не является статическим. Методы, объявленные как статические, вызываются напрямую через класс,
        без создания объекта. Если метод carByMake() является статическим, он вызывается следующим образом:
        CarMain.carByMake(cars), без создания объекта carMain.
         */

        System.out.println(carMain.carByMake(cars));

        /*
        {BMW=[Car{name='BMW', model='X5', price=100000}],
        Mercedes=[Car{name='Mercedes', model='amers', price=40000}, Car{name='Mercedes', model='bmers', price=39000},
              Car{name='Mercedes', model='bmers', price=1000000}],
        Volvo=[Car{name='Volvo', model='a60', price=1000}, Car{name='Volvo', model='a60', price=5000},
        Car{name='Volvo', model='c60', price=10}]}
         */


    }
}
