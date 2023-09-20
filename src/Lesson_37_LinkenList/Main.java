package Lesson_37_LinkenList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    /*
    LinkedList

Обобщенный класс LinkedList представляет структуру данных в виде связанного списка.
--------------------------------------

Вот некоторые из методов LinkedList oтличающиеся от ArrayList:

addFirst() / (offerFirst() -  относиться к очереди): добавляет элемент в начало списка

addLast() / offerLast(): добавляет элемент в конец списка

removeFirst() / pollFirst(): удаляет первый элемент из начала списка

removeLast() / pollLast(): удаляет последний элемент из конца списка

getFirst() / peekFirst(): получает первый элемент

getLast() / peekLast(): получает последний элемент
     */

    public static void main(String[] args) {

    /*
    LINKENLIST
    конструкторы:
    LinkedList()  - пустой список
    LinkedList( Collection collection) -  список со всеми элементами коллекции

     */

        LinkedList<Integer> list  = new LinkedList<>();
        List<String> list1 = new LinkedList<>();
//        ----------------------------------------------
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");
        System.out.println(names);//[Jack, John, Bill]
        names.addFirst("Anne");
        System.out.println(names);// [Anne, Jack, John, Bill]
        System.out.println(names.removeLast());// Bill
        System.out.println(names); // [Anne, Jack, John]


    }
}
