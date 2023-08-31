package HomeWork_28;

public class Circle implements Shape {
    private double radius;
    double  PI = Math.PI;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double isPerimeter() {
       return 2*PI*radius;
    }

    @Override
    public double isSquare() {
        return PI*radius*radius;
    }
}
