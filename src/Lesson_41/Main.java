package Lesson_41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static List<String> dublikatesName(List<String> list){
        Set<String> uniqueNames = new HashSet<>(); // создаем новый  сет для уникальных имен
        List<String> duplicates = new ArrayList<>(); // создаем новый ллист для имен дубликатов

        for (String name: list) { // создаем цикл, перебирающий  входящий лист
            // Пытаемся добавить имя в множество уникальных имен.
            // Если оно уже было в множестве, то add вернет false.
            if (!uniqueNames.add(name)){ // !false = true - чтобы зайти в цикл-нужно, чтоб вернулось true
                // (так работает if)

                if (!duplicates.contains(name)) { // Если имя уже было в множестве, проверяем, было ли оно добавлено
                    duplicates.add(name);        // в список дубликатов. Если нет, то добавляем его
                }
            }
        }

        return duplicates;

    }
    public static void main(String[] args) {

        /*
        Написать метод, который принимает лист имен, в котором имена могут повторяться и возвращает лист
        повторяющихся элементов
        [Jack, Mary, John, John, Ann, Mary] -> John, Mary
         */


        List<String> stringList = new ArrayList<>();
        stringList.add("Jack");
        stringList.add("Mary");
        stringList.add("John");
        stringList.add("John");
        stringList.add("John");
        stringList.add("Ann");
        stringList.add("Mary");
        stringList.add("Mary");

        System.out.println(stringList);

        System.out.println(dublikatesName(stringList));




    }
}
