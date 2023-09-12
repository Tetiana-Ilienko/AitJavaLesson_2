package HomeWork_40;

import java.util.*;

public class Main {

    /*
      С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов
     */

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Jack");
        stringList.add("Mary");
        stringList.add("John");
        stringList.add("John");
        stringList.add("Ann");
        stringList.add("Mary");
        stringList.add("Mary");



        System.out.println(stringList); // [Jack, Mary, John, John, Ann, Mary]

        System.out.println(listOfNames(stringList)); // [Jack, Mary, John, Ann] //  возвращает в том же порядке,
        // в котором были добавлены имена


    }

    public static List<String> listOfNames(List<String> obj){
        Set<String> linkedNameSet = new LinkedHashSet<>(obj);
        ArrayList<String> strings = new ArrayList<>(linkedNameSet);
        return strings;

    }

//    public static Set<String> listOfNames(List<String> obj){ // этот вариант вернет имена в другой последовательности
//        Set<String> nameSet = new HashSet<>(obj); //  [Ann, John, Jack, Mary]
//        return nameSet;
//
//    }


}
