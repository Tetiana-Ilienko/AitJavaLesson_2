package Lesson_43_TreeMap;

import java.util.*;

// TreeMap
public class Main {

    /*
    TreeMap - это реализация интерфейса java.util.Map в Java, которая представляет собой структуру данных,
    известную как упорядоченное дерево, или красно-черное дерево.
    Основное свойство TreeMap заключается в том, что он хранит пары "ключ-значение", где каждый ключ может быть
    ассоциирован только с одним значением.

    Основные характеристики TreeMap:

    Упорядоченность: Ключи в TreeMap автоматически упорядочиваются по их натуральному порядку или согласно заданному
    компаратору. Это означает, что элементы можно извлекать из TreeMap в упорядоченной последовательности.

     Не допускает дубликаты ключей: TreeMap не может содержать несколько одинаковых ключей. Если вы попытаетесь
     вставить значение с ключом, который уже существует, новое значение перезапишет существующее.

    Красно-черное дерево: TreeMap реализован как красно-черное дерево, структура данных, которая обеспечивает
    балансировку дерева и гарантирует логарифмическую сложность операций вставки, удаления и поиска.(TreeMap  медленнее
    чем HashMap
    )

     Быстрый доступ к элементам: TreeMap обеспечивает быстрый доступ к элементам по ключу благодаря внутренней
     структуре дерева.
     */
    public static void main(String[] args) {
        Map<Integer,String> ourTreeMap = new TreeMap<>();
        ourTreeMap.put(23,"bbb");
        ourTreeMap.put(2,"aaa");
        ourTreeMap.put(1,"dd");
        ourTreeMap.put(100,"aaaaaaaaa");
        ourTreeMap.put(118,"aaaaBBBrrr");

        System.out.println(ourTreeMap); // {1=dd, 2=aaa, 23=bbb, 100=aaaaaaaaa, 118=aaaaBBBrrr}


        // один из способов обхода Map с помощью Iterator
        Set<Map.Entry<Integer,String>> set = ourTreeMap.entrySet();// создаем сет
        // получаем набор ключ-значение.entrySet()
        Iterator<Map.Entry<Integer,String>> it = set.iterator();//
        // получаем итератор(тип - итератор для пар значений Мапы) для нашего сета пар

        while (it.hasNext()){ // перебор в цикле , просто перебераем пары
            Map.Entry<Integer,String> me = it.next(); // получаем пару и записываем ее в перменную
            System.out.print(me.getKey() + ": "); // получаем ключ
            System.out.println(me.getValue()); // получаем значение

        }

        //  в TreeMap  можно поменять порядок сортировки, передав в ее конструктор соответствующий компаратор
        // если мы хотим, чтоб выводилось в обратном порядке б используем Collection.reverseOder()
        Map<String,String> mapReverse = new TreeMap<>(Collections.reverseOrder());
        mapReverse.put("K1", "Jack");
        mapReverse.put("K2", "John");
        mapReverse.put("K3", "Ann");
        mapReverse.put("K4", "Bill");
        mapReverse.put("K5", "Jill");

        System.out.println(mapReverse); // {K5=Jill, K4=Bill, K3=Ann, K2=John, K1=Jack}
















    }





}
