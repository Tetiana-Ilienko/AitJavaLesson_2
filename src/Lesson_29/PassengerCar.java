package Lesson_29;

public class PassengerCar extends Car{


    public PassengerCar(String model, String manufacture, int year, String colour) {
        super(model, manufacture, year, colour);
    }

    @Override
    public void move() {
        System.out.println(super.getModel() + " can move");

    }

    @Override
    public void stop() {
        System.out.println(super.getModel() + " can stop");

    }

    @Override
    public String toString() {
        return "PassengerCar{} "  + super.toString();
    }
}
