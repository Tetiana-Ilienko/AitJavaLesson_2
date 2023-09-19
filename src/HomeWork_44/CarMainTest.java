package HomeWork_44;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarMainTest {
    private CarMain carMain;
    private List<Car> carlist;

    Car car1 = new Car("Volvo", "c60", 10);
    Car car2 = new Car("Mercedes", "amers", 40000);
    Car car3 = new Car("Volvo", "a60", 5000);
    Car car4 = new Car("Volvo", "a60", 1000);
    Car car5 = new Car("Mercedes", "bmers", 39000);
    Car car6 = new Car("Mercedes", "bmers", 1000000);
    Car car7 = new Car("BMW", "X5", 100000);

    @BeforeEach
    public void setUp() {
        carMain = new CarMain();
        carlist = new ArrayList<>();
        
        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);
        carlist.add(car4);
        carlist.add(car5);
        carlist.add(car6);
        carlist.add(car7);


    }


    @Test
    public void test_cars() {
        Set<Car> bmw = new TreeSet<>();
        bmw.add(car7);

        Set<Car> mercedes = new TreeSet<>();
        mercedes.add(car2);
        mercedes.add(car5);
        mercedes.add(car6);

        Set<Car> volvo = new TreeSet<>();
        volvo.add(car4);
        volvo.add(car3);
        volvo.add(car1);

        Map<String, Set<Car>> expected = new TreeMap<>();
        expected.put(car7.getName(), bmw);
        expected.put(car2.getName(), mercedes);
        expected.put(car4.getName(), volvo);

        assertEquals(expected, carMain.carByMake(carlist));

    }

    @Test
    public void test_cars_one() {


        Set<Car> mercedes = new TreeSet<>();
        mercedes.add(car2);
        mercedes.add(car5);
        mercedes.add(car6);


        Map<String, Set<Car>> expected = new TreeMap<>();

        expected.put(car2.getName(), mercedes);
        List<Car> newCar = Arrays.asList(car2,car6, car5);


        assertEquals(expected, carMain.carByMake(newCar));

    }

    @Test
    public void test_cars_empty() {
        Map<String, Set<Car>> expected = new TreeMap<>();

        List<Car> newCar = new ArrayList<>();

        assertEquals(expected, carMain.carByMake(newCar));

    }

}