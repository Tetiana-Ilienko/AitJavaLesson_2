package HomeWork_28;

/*
Создать интерфейс Shape,содержащиq методы для подсчета площади и периметра фигуры и классы прямоугольник и круг,
 реализующие этот интерфейс.

В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов, т.е. если площадь прямоугольника = 100, круга = 50,
то общая площадь 150
 */


public class MainShape {
   /* public static void summaOfSquareShape(Rectangle rectangle, Circle circle) {
        double summaOf = rectangle.getSr() + circle.getSc();
        System.out.printf("Summa of rectangle and circle is : %.2f", summaOf);
        System.out.println();

    }

    public static void summaOfSquareShape(Rectangle[] rectangles, Circle[] circles) {
        double summaOf = 0;
        for (int i = 0; i < rectangles.length; i++) {
            summaOf = rectangles[i].getSr() + circles[i].getSc();
            System.out.printf("Summa of rectangle and circle is : %.2f", summaOf);
            System.out.println();
        }

    */


    //  более оптимизированный метод. Можно использовать, если методы в интерфейсе возвращают значение
    public static double summaOfSquareShape(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.isSquare();
        }
        return result;
    }


    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(2.5, 3);
        Rectangle rectangle3 = new Rectangle(15, 8);
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(7);



        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3};
        Circle[] circles = {circle1, circle2, circle3};


        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.isPerimeter());
            System.out.println(rectangle.isSquare());
            System.out.println("*********************");
        }
        System.out.println("\n");

        for (Circle circle : circles) {
            System.out.println(circle.isPerimeter());
            System.out.println(circle.isSquare());
            System.out.println("*********************");
        }

//*************************************************************************
        System.out.println("++++++++++++++++++++++++++++");
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(2);

        System.out.println(rectangle.isPerimeter());
        System.out.println(rectangle.isSquare());

        System.out.println(circle.isPerimeter());
        System.out.println(circle.isSquare());

        Shape[] shapes = {rectangle1,circle1};

        System.out.println("Summ: " + summaOfSquareShape(shapes));

    }
}
