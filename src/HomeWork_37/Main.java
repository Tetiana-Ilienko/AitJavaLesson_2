package HomeWork_37;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Написать метод, принимающий не пустой лист строк и возвращающий строку,
    которая встречается раньше в листе - самую короткую или самую длинную. Все строки в листе разной длины
      1. находим минимальный и максимальную строку
      2. сравниваем индексы - возвращаем меньший
     */

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Als Patientin oder Patient können Sie über das Kontaktformular");
        stringList.add("oder per E-Mail");
        stringList.add("Kontakinformationen finden");
        stringList.add("Telefon:");
        System.out.println(stringList);
        System.out.println(findStringMaxOrMin(stringList)); // работа метода
        // метод нашел самую длинную строку, так как она стоит первая
        stringList.add("Für Untersuchungstermine und andere Anfragen nutzen Sie bitte bevorzugt " +
                "folgende e-mail Adresse:");
        System.out.println(findStringMaxOrMin(stringList)); // Telefon: //  метод нашел самую короткую строку,
        // так как мы добавили еще одну самую дляинную строку


    }

    public static String findStringMaxOrMin(List<String> stringList) {
        String minString = stringList.get(0);
        String maxString = stringList.get(0);
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (minString.length() > stringList.get(i).length()) {
                minString = stringList.get(i);
                indexMin = i;
            } else if (maxString.length() < stringList.get(i).length()) {
                maxString = stringList.get(i);
                indexMax = i;
            }
        }
        if (indexMin < indexMax) {
            return minString;
        } else {
            return maxString;
        }

    }
}