package HomeWork_48_DayOfWeek;

import java.util.Scanner;

public class DayOfWeekResolver {

    private static Scanner scanner = new Scanner(System.in); // создаем скане как поле класса,
    // чтобы он был доступен во всех методах


    public void start() { // публичный метод, который запускает работу всех методов
       do {
          DayOfWeek dayOfWeek = readDayOfWeek(); //  вызываем первый метод, который принимает строку от пользователя
           // и присваеваем переменной
           System.out.println("Das ist " + isDayOff(dayOfWeek)); // вызываем метод, который переобразует полученную строку
           // ввода пользователя с экрана в ENUM и на return он обращается к третьему методу (return isDayOff(dayOfWeek)),
           //который проверяет, является ли день выходным
           System.out.println("Do you want to check another day ? enter yes or any other word if not");
       } while (scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Thank you for using our service!");
        scanner.close();// закрываем сканер


    }


    private DayOfWeek readDayOfWeek(){// метод,который считывает пользовательский ввод и перобраует строку в константу Enum
        DayOfWeek enumDay = null;
        boolean flag;
        do {
            flag= false;

            System.out.println("Enter day of the week");
            String day = scanner.nextLine();

            try {
                enumDay = DayOfWeek.valueOf(day.toUpperCase());

            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid day of week");
                flag= true;

            }

      /*
     1.  есть переменная day,  содержащая строку, представляющую день недели, например,
      "monday" (в нижнем регистре).
     2. С помощью метода toUpperCase() вызывается перевод всех символов строки day в верхний регистр.
      Это делается, чтобы обеспечить надежное сравнение строк, так как перечисление DayOfWeek обычно использует
      значения в верхнем регистре (например, MONDAY, TUESDAY, и так далее).
     3. Далее, метод valueOf() вызывается для перечисления DayOfWeek, чтобы получить соответствующий элемент
     перечисления на основе строки. Например, если day содержит "MONDAY" (или "monday" после преобразования в
     верхний регистр), то DayOfWeek.valueOf(day.toUpperCase()) вернет DayOfWeek.MONDAY.
     4. Результат этого выражения присваивается переменной enumDay, которая будет содержать
     соответствующий элемент перечисления DayOfWeek.
       */
        } while (flag);

        return enumDay; // метод возвращает boolean, значение метода, который определяет является ли
        // enumDay выходным

    }

    private boolean isDayOff(DayOfWeek day) {
        switch (day) {
            case SAMSTAG:
            case SONNTAG:
                return true;
            default:
                return false;
        }
    }


}
