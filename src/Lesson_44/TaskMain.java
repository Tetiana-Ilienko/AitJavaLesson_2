package Lesson_44;

import java.util.*;

public class TaskMain {

    /*
    Пусть есть лист имен, где некоторые имена повторяются. Написать метод, принимающий этот лист и имя и
    возвращающий сколько раз встречается это имя в листе. В решении использовать мапу
    Пример: [John,John, Bill, Ann, Ann] -> 2
     */
    /*
    1. Создаем новую мапу
    2. Переписываем в ее список имен как ключи,  а значение, сколько раз встречается это имя
    3. Если имя повторяется, увеличиваем счетчик
     */

    public static int nameToNumberOccurence(List<String> names, String name) {
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;
        for (String stringName : names) {
            if ( map.containsKey(name)){
                counter++;
            }
            map.put(stringName, 1);        }
        return counter;

    }
    public static int nameToNumberOccurence1(List<String> names, String name) {
        Map<String, Integer> nameByNumber = new HashMap<>(); // создаем новую мапу

        for (String s : names) { // проходим по листу
            if (nameByNumber.containsKey(s)) { // если такое имя уже встречалось
                nameByNumber.put(s, nameByNumber.get(s) + 1); // прибавляем к значению +1
            } else {
                nameByNumber.put(s, 1); // иначе оставляем значение 1 (имя не повторяется)
            }
        }

        //если имени нет в списке может вернуться null - это не очень хорошо
        // чтобы этого не случилось - нужно сделать проверку
        //__________________________________________
        //  if(nameByNumber.containsKey(name))
        //      return nameByNumber.get(name); //
        // return 0;
        //___________________________________________
        // можно сделать короче, через дефолтный опреатор

        return nameByNumber.getOrDefault(name, 0);
        /*
        getOrDefault(name, 0) - это метод, который пытается получить значение по ключу name из nameByNumber.
        Однако, если ключ name не существует в nameByNumber, то метод вернет значение по умолчанию, которое в
        данном случае равно 0.
         */

    }



    public static void main(String[] args) {
        List<String> hashList = new ArrayList<>();
        hashList.add("John");
        hashList.add("John");
        hashList.add("John");
        hashList.add("John");
        hashList.add("John");

        hashList.add("Mary");
        hashList.add("John");
        System.out.println(hashList);

        System.out.println(nameToNumberOccurence(hashList, "John"));
        System.out.println(nameToNumberOccurence1(hashList, "John"));


    }

    /*
    3.Пусть есть лист имен и их анаграмм. Написать метод, принимающий этот лист  и имя, по которому он возвращает список
    всех его анаграмм, включая само имя
    [john, ann, bill, nan, nna, llbi, ohnj],ann -> [ann,nan,nna]
    List<String> findAnagrams( String str, List<String>strings).
    Решение с помощью мапы.

     *//*
     Если нам нужно вернуть список значений, то имеет смысл создавать мапу, где каждому ключу будет
     соответствовать список значений
     */

    List<String> findAnagrams(String str, List<String> strings) {

        Map<String, List<String>> anagrams = new HashMap<>(); // создаем мапу для отсортированных значений

        for (String s : strings) { // нужно идти по листу и сортировать
            String sortedKey = sortAnagram(s);//sortedKey пердаем отсортированный элемент,написанный в приватном методе

            if (anagrams.containsKey(sortedKey)) { // если содержиться такой ключ, имена и анограммы будут одинаковыми
                // так как мы их отсортировали в криватном метде
                // если такой ключ существует, то существует и лист значений
                List<String> value = anagrams.get(sortedKey);//если мы скажем получить зна-ние по отсортированному ключу
                // это и будет лист значений // anagrams.get(sortedKey) - вызывает ArrayList
                value.add(s); // добавляем туда новую строку
                anagrams.put(sortedKey, value);// и ложем все, что получилось обратно как значение по этому ключу
            } else { // если такого ключа нет
                List<String> value = new ArrayList<>();// создаем новый лист
                value.add(s);// добаввляем туда нашу строку
                anagrams.put(sortedKey, value);// помещаем ее с ключом в мапу, в качестве ключа отсортированное имя
                // а в качестве значение - список с одним элементом
            }
        }
        return anagrams.getOrDefault(sortAnagram(str), List.of());// с помощью метода getOrDefault
        // так как нам надо вернуть лист анаграмм, то мы вызываем метод sortAnagram и в нутрь помещаем str, если нет
        // такого имени - возвращаем пустой список
    }

    private String sortAnagram(String str) { // возвращает отсортировонное имя и принимает имя или его аннаграму
        char[] chars = str.toCharArray();// сделали из строки массив чаров
        Arrays.sort(chars);// отсортировали
        return new String(chars); // вернули назат опять строку
    }




}
