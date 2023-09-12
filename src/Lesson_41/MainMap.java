package Lesson_41;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// Map
public class MainMap {
    /*
    Интерфейс MAP

    4 класса:
    Hashtable
    HashMap
    LinkedHashMap
    TreeMap

    Мапа представляет собой набор пар ключ-значение.
    В качестве ключей могут быть разные типы данных.
    Ключи в мапе уникальны. Значения могут повторяться.
     */
    public static void main(String[] args) {

        Map<Integer,String> ourMap = new HashMap<>();
        ourMap.put(1200,"Notebook");
        ourMap.put(130,"Printer");
        ourMap.put(500,"TV");
        ourMap.put(10,"Mouse");

        System.out.println(ourMap);

        ourMap.put(10, "Clock"); //

        System.out.println(ourMap.get(130)); //  по ключу получить значение

        System.out.println(ourMap.size());

        System.out.println(ourMap.containsKey(500)); // Содержит ли Мапа ключ // boolean
        ourMap.containsValue("TV"); // содержит ли мапа значение // boolean

        System.out.println(ourMap.keySet());// обход мапы по ключам // [1200, 130, 500, 10]

        Set<Integer> mapKeySet = ourMap.keySet(); // создаем множество Set
        /*
        В Java, интерфейс Map представляет структуру данных, которая хранит пары "ключ-значение".
        Каждый ключ в карте уникален и используется для доступа к соответствующему значению.
        Метод keySet() вызывается на объекте карты и возвращает множество всех ключей, содержащихся в этой карте.

        Таким образом, после выполнения этой строки кода, mapKeySet будет содержать все ключи, доступные в ourMap.
        Можно  использовать это множество ключей для итерации по ключам или выполнения других операций,
        связанных с ключами карты.
         */


    }
}
