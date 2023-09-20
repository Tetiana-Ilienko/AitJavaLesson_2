package Lesson_47_Exceptions;

import java.util.Scanner;

// Exceptions (исключения)
public class ExceptionsJava {
    /*
    В программировании и компьютерных науках "исключение" (exception) - это событие, которое возникает во время
    выполнения программы и нарушает нормальный поток выполнения. Исключения используются для обработки ошибок, а также
    для управления потоком выполнения программы в специфических ситуациях.

    В языке программирования Java исключения являются объектами, представленными классами из иерархии исключений
    (exception hierarchy). Все исключения в Java наследуются от базового класса Throwable и делятся на ошибки в
    джава-машине(вне нашего контроля)и исключения (то, что можно обработать в программе)

    исключения бывают "встроенные" и написанные пользователем
    Встроенные исключения деляться на две категории:

    Checked Exceptions (Проверяемые исключения): Эти исключения наследуются от класса Exception, но
    не от RuntimeException. Код, который может вызвать такие исключения, должен обязательно либо обработать их с
    помощью блока try-catch, либо объявить, что он выбрасывает такое исключение при помощи ключевого слова throws.
    Примеры: IOException, SQLException.

    Unchecked Exceptions (Непроверяемые исключения): Непроверяемые исключения наследуются от класса RuntimeException.
    Они обычно связаны с ошибками программиста или непредвиденными ситуациями. Код, который вызывает непроверяемое
    исключение, не обязан его обрабатывать. Примеры: NullPointerException, ArrayIndexOutOfBoundsException.

    Error (Ошибки): Ошибки наследуются от класса Error и обычно связаны с критическими проблемами, которые выходят за
    рамки контроля программы. Например, OutOfMemoryError.

    Обработка исключений в Java выполняется с использованием блока try-catch. В блоке try помещается код, который может
    вызвать исключение, а в блоке catch указывается, как обрабатывать исключение.

    try {
    // Код, который может вызвать исключение
    int result = 10 / 0; // Это вызовет ArithmeticException
     } catch (ArithmeticException e) {
    // Обработка исключения
    System.out.println("Деление на ноль!");
    }

     Одному блоку try  может соответствовать несколько блоков catch,  каждый из которых отвечает за обработку своего
     вида исключений.
     Можно также создать  блок catch,  который будет отлавливать все исключения. В этом случае он должен
     ловить Exception e  и стоять последним после всех остальных блоков catch,  ловящих отдельные исключения и относящиеся
     к одному и тому же блоку try


    Помимо блока try-catch, в Java есть другие конструкции для работы с исключениями, такие как finally
   (выполняется всегда, независимо от возникновения исключения) и throw (используется для явного выбрасывания исключений).

    Использование исключений позволяет писать более надежные и устойчивые к ошибкам программы, так как они позволяют
    обрабатывать ошибочные ситуации и принимать решения о том, как вести себя в случае их возникновения.

    Важные определения при работе с исключениями :
        1. try -  код, который может вызвать появление исключения помещается внутрь блока try.
            Блок try  определяет произошло ли исключение и если да, то передает управление программой соотвествующему
            блоку catch или блоку finally

        2. catch - это блок, в котором содержится код для обработки возникшего исключения. Блок catch  выполняется только
            в том случае если произошло исключение и существует в связке с блоком try.

        3. finally - этот блок будет выполняться всегда независимо от того, произошло исключение или нет.

        4. throw - используется для того, чтобы бросить исключение

        5. throws - используется в сигнатуре метода и указывает на то, что метод может бросить исключение



     */

    public static void main(String[] args) {
        int num1,num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scanner.nextInt();

        System.out.println("Enter second number");
        num2 = scanner.nextInt();


//        int divide = num1/num2;
//        System.out.println("num1/num2 = " + divide );
        /*
          Enter first number
          5
          Enter second number
          0
          Exception in thread "main" java.lang.ArithmeticException: / by zero
	             at Lesson_47.ExceptionsJava.main(ExceptionsJava.java:59)
         */

//        чтобы программа не выдавала исключения, в подозрительной части кода пишем следующе

        try {  int divide = num1/num2;
            System.out.println("num1/num2 = " + divide );
        } catch ( ArithmeticException exception){
            System.out.println("Division by 0 not allowed!");
            System.out.println(exception.getMessage());
        }
        System.out.println("After exception occurred");

        /*
        Enter first number
        5
        Enter second number
        0
        Division by 0 not allowed!
        / by zero
        After exception occurred

         */
        // Теперь программа не развалилась и она будет продолжаться


//        ***********************************
        try {
            int[] ints = {1, 0, 4};
            num1 = ints[10];
            num2 = ints[2];
            int divide = num1 / num2;
            System.out.println("num1/num2 = " + divide);
            System.out.println("End of try blockk");
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage()); // num1/num2 = 0

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()); // Index 10 out of bounds for length 3
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        /* если написать  catch (Exception e) - старший по иерархии класс - он будет ловить все ошибки
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Так делать не всегда лучше, так как не понятно, какая ошибка где поймалась
        если все таки писать так, то нужно ставить  эту запись заключающей

         */





    }

}
