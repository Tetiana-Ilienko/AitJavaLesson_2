package HomeWork_31;

public class MainTask {
    public static void main(String[] args) {
        /*
        Написать метод, который принимает строку и паттерн(строка) и возвращает количество вхождений паттерна в строку
    Пример: ( "Hello World", "l") -> 3
         */

        String str = "Hello World";
        String str1 = "This is convenient: it helps to separate different data and prevent situations where" +
                " the wrong thing is passed to an entity";

        System.out.println(pattern(str, 'l'));
        System.out.println(pattern(str1, 'e'));
        System.out.println(pattern(str, "l"));
        System.out.println(pattern(str1, "re"));


    }

    public static int pattern(String str, String strP) {
        int count = 0;
        int index = str.indexOf(strP, 0); // возвращает индекс первого вхождения в строку ( ---> 2)
        while (index != -1) { // ( 2!= -1) выполняем цикл
            count++;         // = 0+1
            index = str.indexOf(strP, index + str.length()); // вызываем метод от индекса (2 +1),
            // если совпадений не найдено
            // вернется -1. Цикл остановитьсяю
        }

        return count;// возвращаем счетчик
    }

    // ************ вариант для символов *****************
    public static int pattern(String str, char chr) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char ch : chars) {
            if (ch == chr) {
                count++;
            }
        }
        return count;

    }

    // ************ вариант 2   *****************
    public static int isPattern(String str, String pattern) {
        int count = 0;
        int lastIndex = str.lastIndexOf(pattern);// идем с конца
        for (int i = 0; i < str.length(); i++) { // вошли в цикл
            if (lastIndex != -1) {
                count++;                         // увеличили счетчик
                lastIndex = str.lastIndexOf(pattern, lastIndex - pattern.length()); // отступаем на длину
                // паттерна, пока не вернется -1
            }

        }
        return count;


    }


}
