package HomeWork_28;

public class Rectangle implements Shape {

   private double length;
    double height;
    double pr;
    double sr;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getSr() {
        return sr;
    }

    @Override
    public void isPerimeter() {
        pr = 2 * (length + height);
        System.out.println("Perimeter of the rectangle is: " + pr);


    }

    @Override
    public void isSquare() {
        sr = length * height;
        System.out.println("Square of the rectangle is: " + sr);

    }
}
