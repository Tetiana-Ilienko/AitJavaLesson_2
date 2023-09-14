package Lesson_43;

import java.util.Map;

public class PracticMain {


    /*
    Дана Map<String,String> map .  Написать метод, который вернет Мапу, такую, что если в исходной мапе есть ключи
    "а" и "b", то нужно создать новый ключ "ab" и в качестве значения для него должна быть сумма значений ключей
    "a" и "b".
    Если нет, ничего в мапе не менять.

    mapAB {"a": "Hi", "b" : "There"} -> { "a": "Hi", "ab" : "HiThere" , "b" : "There"  }
      */

    /*
      1. Обходим Мапу и находим нужные ключи
      2. Если они оба найдены - добавляем новый элемент, в котором новый ключ - сложение двух ключей,
      новое значение - сумма двух значений (сoncat)
     */

    public static Map<String,String> plusElement(Map<String,String> map, String key1, String key2){
        if (map.containsKey(key1) & map.containsKey(key2)){

            map.put((key1 + key2), (map.get((key1).concat(map.get(key2)))  ));

        }
        return map;

    }

    public static void main(String[] args) {

    }


}
