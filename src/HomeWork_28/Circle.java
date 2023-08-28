package HomeWork_28;

public class Circle implements Shape {
    private double radius;
    double PI = Math.PI;
    private double pc;
    private double sc;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getSc() {
        return sc;
    }

    @Override
    public void isPerimeter() {
       pc = 2*PI*radius;
        System.out.printf("Perimeter of the circle is : %.2f", pc);
        System.out.println();

    }

    @Override
    public void isSquare() {
        sc= PI*radius*radius;
        System.out.printf("Square of the circle is: %.2f", sc);
        System.out.println();
    }
}
