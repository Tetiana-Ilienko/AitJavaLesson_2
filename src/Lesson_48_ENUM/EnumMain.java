package Lesson_48_ENUM;

public class EnumMain {
    /*
    Enum (перечисление) в Java - это особый тип данных, который представляет набор констант (значений),
    которые могут быть использованы в программе. Перечисления в Java создаются с использованием ключевого слова enum

    Перечисления часто используются для определения набора возможных значений, которые могут использоваться в программе.
    Они могут быть полезными, когда у вас есть ограниченный набор вариантов, например, дни недели, месяцы, цвета и т. д.

    Перечисления (Enums) в Java предоставляют несколько встроенных методов и функциональности для удобной работы с ними.
    Вот некоторые из них:

    values(): Этот метод возвращает массив, содержащий все константы перечисления в порядке их объявления.

           Day[] days = Day.values(); // Возвращает массив [MONDAY, TUESDAY, WEDNESDAY, ...]

    valueOf(String name): Этот метод позволяет получить константу перечисления по её имени в виде строки.
    Обратите внимание, что имя должно точно соответствовать имени константы, и это чувствительно к регистру.

           Day monday = Day.valueOf("MONDAY"); // Возвращает константу MONDAY

    name(): Метод name() возвращает имя константы в виде строки.

           Day today = Day.MONDAY;
           String name = today.name(); // Возвращает "MONDAY"

    ordinal(): Метод ordinal() возвращает порядковый номер (индекс) константы в объявлении перечисления.
    Обратите внимание, что индексация начинается с нуля.

          Day today = Day.MONDAY;
          int index = today.ordinal(); // Возвращает 0 для MONDAY

     */

    public static void main(String[] args) {

        Directions dir = Directions.NORTH;
        System.out.println(dir.getLetter());// N
        String letterWest = Directions.WEST.getLetter();
        System.out.println(letterWest); // W
        //   Directions north = Directions.NORTH;
        //   System.out.println(north);
        //   System.out.println(Directions.EAST);

        for (Directions dir23 : Directions.values()) {
            //    System.out.println(dir);
        }

        //   Directions direction = Directions.WEST;

        //    if (direction ==Directions.EAST){
        //         System.out.println("go east");
        //    }
//           getDirection(Directions.EAST);
        //    getDirection(Directions.WEST);
        //    getDirection(Directions.NORTH);
        //    getDirection(Directions.SOUTH);

        String east = "east";
        Directions eastFromString = Directions.valueOf(east.toUpperCase()); // если константы с таким
        //  значением нет, генерируется exception
        getDirection(eastFromString);
    }

    public static void getDirection(Directions direction) {
        switch (direction) {
            case SOUTH:
                System.out.println("go south");
                break;
            case EAST:
                System.out.println("go east");
                break;
            case WEST:
                System.out.println("go west");
                break;
            case NORTH:
                System.out.println("go north");
                break;
        }
    }
}

