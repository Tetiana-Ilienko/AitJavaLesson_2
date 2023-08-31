package HomeWork_32;

import HomeWork_28.Circle;
import HomeWork_28.Rectangle;
import HomeWork_28.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeSquareTest {

    private ShapeSquare shapeSquare = new ShapeSquare();




    @Test
    void nullShape_test() {
        Shape[] shapes = {};
        assertEquals(0,shapeSquare.summaOfSquareShape(shapes));
    }

    @Test void oneShape_test(){
        Shape[] shapes = {new Rectangle(2,3)};
        assertEquals(6,shapeSquare.summaOfSquareShape(shapes));
    }

    @Test void twoShape_test(){
        Shape[] shapes = {new Rectangle(2,3), new Circle(2)};
        assertEquals(18.566370614359172,shapeSquare.summaOfSquareShape(shapes));
    }


}