package Lesson_29;

public abstract class Car implements Movable {
    private String model;
    private String manufacture;
    private int year;
    private String colour;

    public Car(String model, String manufacture, int year, String colour) {
        this.model = model;
        this.manufacture = manufacture;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
