package HomeWork_28;

public class Rectangle implements Shape {

   private double length;
    double height;


    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }


    @Override
    public double isPerimeter() {
        return 2*(length + height);
    }

       @Override
    public double isSquare(){
        return  length * height;

    }
}
