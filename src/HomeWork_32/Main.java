package HomeWork_32;

import HomeWork_28.Circle;
import HomeWork_28.Rectangle;
import HomeWork_28.Shape;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2,3);
        Shape circle = new Circle(2);

        System.out.println(rectangle.isSquare());
        System.out.println(circle.isSquare());;
        Shape[] shapes = {rectangle,circle};

        ShapeSquare shapeSquare = new ShapeSquare();

        System.out.println(shapeSquare.summaOfSquareShape(shapes));

    }
}
