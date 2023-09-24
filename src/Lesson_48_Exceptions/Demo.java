package Lesson_48_Exceptions;

public class Demo {

    public static void main(String[] args) {
        int[] numbers = {4, 8, 13, 32,64, 125, 256, 512};
        int[] dividers = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numbers.length; i++){
            try {
                if (numbers[i] % 2 != 0) throw new NonIntegerException(numbers[i], dividers[i]);
                System.out.println(numbers[i] + "/" + dividers[i] + " = " + numbers[i]/dividers[i]);
            }
            catch (ArithmeticException e){
                System.out.println("Do not divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is out of bounds");
            }
            catch (NonIntegerException e){
                System.out.println(e);
            }
        }

        /*
        4/2 = 2
        Do not divide by zero!
        result of 13 / 4 is not an integer
        32/4 = 8
        Do not divide by zero!
        result of 125 / 8 is not an integer
        Index is out of bounds
        Index is out of bounds
         */
    }
}
