package Lesson_32;

public class Calculator {
    public static void main(String[] args) {
//        Чтобы вызвать не статический метод. Сначала мы создаем объект для вызова методаю
        Calculator calculator = new Calculator();
        calculator.multiply(2, 3);
        calculator.multiply(0, 5);

        System.out.println(compareNumbers(5, 3));
        System.out.println(compareNumbers(3, 0));


    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static double findAria(double radius) {
        return Math.PI * radius * radius;
    }

    public static boolean compareNumbers(int a, int b) {
        return a > b;
    }

    //    ---------------------------------------------------------


    public int findMax(int[] ints) {
        if (ints.length == 0) return -1;
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }

        }
        return max;
    }


}
