package HomeWork_32;

import HomeWork_28.Shape;

public class ShapeSquare {

    public  double summaOfSquareShape(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.isSquare();
        }
        return result;
    }

}
