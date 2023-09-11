package Practice_37;

import java.util.*;

// Set
public class setJava {
    public static void main(String[] args) {


        /*
        Set -  это коллекция, которая не может содержать дубликатов.

        HashSet
        1. использует в основе структуру данных, которая называется HashTable
        2.  не гарантирует порядка, в котором хранятся и возвращаются элементы
        3. Не допускает дубликатов
        4. Можно поместить null (только один раз, т.к. не допускает дубликатов)
         */

        HashSet<String> hashSet = new HashSet<>(); //  конструктор    HashSet  по умолчанию 16 элементов
        Set<String> hSet = new HashSet<>();
        //--------------------------------------------------------------

        // добавление элемента
        hashSet.add(" aa ");
        hashSet.add(" bb ");
        hashSet.add(" cc ");
        hashSet.add(" dd ");

        System.out.println(hashSet.add(" aa ")); // false, так как это дубликат - не добавляет
        System.out.println(hashSet.add(" bb ")); // false

        System.out.println(hashSet); // [ aa ,  bb ,  cc ,  dd ]
        //-------------------------------------------------------------
        //  так как HashSet  это коллекция он Iterable - мы можем его обойти в цикле

        for (String s : hashSet) {
            System.out.print(s + " ");//  aa   bb   cc   dd
            System.out.println();

        }

        //---------------------------------------------------------

        hashSet.remove(" bb "); // удаление объекта
        System.out.println(hashSet);  // [ aa ,  cc ,  dd ]

        // ----------------------------------------------------

        System.out.println(hashSet.size()); // 3  - // размер  hashSet

        System.out.println(hashSet.contains(" aa ")); // содержится ли элемент - возвращает boolean

        System.out.println(hashSet.isEmpty()); // есть ли элементы

        // -------------------------------------------------------
        //  с помощью итератора перебераем элементы HashSet

        Iterator<String> iterator = hashSet.iterator(); // создаем объект
        while (iterator.hasNext()) { // пока есть следующий
            System.out.print(iterator.next()); //  aa  cc  dd
        }
        System.out.println();

        Set<String> namesSet = new HashSet<>(); // новый объект Set класса <String>
        namesSet.add("John");
        namesSet.add("Jack");
        namesSet.add("Ann");
        namesSet.add("Bill");
        System.out.print(namesSet + " "); // [Ann, John, Bill, Jack] // печатает элементы только в понятной
        // самому ему последовательности
        System.out.println();

        //--------------------------------------------------------
        // LinkedHashSet
        // LinkedHashSet -  поддерживает порядок вывода элементов
        Set<String> linkedNameSet = new LinkedHashSet<>();
        linkedNameSet.add("John");
        linkedNameSet.add("Jack");
        linkedNameSet.add("Ann");
        linkedNameSet.add("Bill");
        System.out.print(linkedNameSet + " ");// [John, Jack, Ann, Bill] // выводит в той последоватеьности,
        // в которой добавляли
        System.out.println();

        //------------------------------------------------------

        // TreeSet -  сразу хранит элементы в отсортированном виде

        Set<String> treeNameSet = new TreeSet<>();
        treeNameSet.add("Jack");
        treeNameSet.add("John");
        treeNameSet.add("Ann");
        treeNameSet.add("Bill");
        System.out.print(treeNameSet + " "); // [Ann, Bill, Jack, John]
        System.out.println();

        //-------------------------------------------------------
        // операции, которые можно выполнять с множествами (Set) в Java.

        /*
        Создаются два множества setA и setB с помощью HashSet. HashSet - это реализация множества в Java,
        которая не допускает дубликатов элементов и не гарантирует порядок элементов внутри множества.
         */

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(2);
        setA.add(4);
        System.out.println(setA); // [1, 2, 3, 4]

        Set<Integer> setB = new HashSet<>();
        setB.add(6);
        setB.add(5);
        setB.add(2);
        setB.add(4);
        System.out.println(setB); // [2, 4, 5, 6]

        /*
        Пересечение (Intersection):

        Создается новое множество intersectSet, исходное setA копируется в него.
        Затем с помощью метода `retainAll` из  intersectSet удаляются все элементы, которые не содержатся в `setB`.
        В результате остаются только элементы, которые есть и в `setA`, и в `setB`.
   -    Выводится  intersectSet, который содержит элементы `[2, 4]`,
        так как это элементы, которые есть и в `setA`, и в `setB`.
         */
        Set<Integer> intersectSet = new HashSet<>(setA);
        intersectSet.retainAll(setB);
        System.out.println(intersectSet);// [2, 4]
//------------------------------------------------------------
        /*
        Объединение (Union): -  объединение сетов
        Создается новое множество `unionSet`, и в него копируется `setA`.
        Затем в `unionSet` добавляются все элементы из `setB` с помощью метода `addAll`.
        Таким образом, `unionSet` будет содержать все элементы из обоих множеств.
        Выводится `unionSet`, который содержит элементы `[1, 2, 3, 4, 5, 6]`.
         */

        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println(unionSet);// [1, 2, 3, 4, 5, 6]
//----------------------------------------------------------------
        /*
        Относительная разность (Relative Complement)

        Создается новое множество differenceSet, в которое копируются элементы setA, и оно будет содержать [1, 2, 3, 4].
        Затем из differenceSet удаляются все элементы, которые также есть в setB. В результате останется [1, 3],
        так как это элементы, которые есть в setA, но отсутствуют в setB.
        Таким образом, System.out.println(differenceSet); выведет [1, 3].
         */

        Set<Integer> diferenceSet = new HashSet<>(setA);
        diferenceSet.removeAll(setB);
        System.out.println(diferenceSet);// [1, 3]


    }
}
