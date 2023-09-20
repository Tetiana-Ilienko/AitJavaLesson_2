package Practice_47;

import java.util.*;

public class TaskMain {
    /*
    Есть два списка с буквами. Определить, является ли один список циклической версией другого.
    Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb} результат будет true,
    а для {dd, ee, ff} и {dd, ff, ee} - false.
     */

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        list1.add("dd");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("dd");
        list2.add("bb");
        list2.add("aa");
        list2.add("cc");

        System.out.println(isCyclic(list1, list2));


    }

    public static boolean isCyclic (ArrayList<String> list1, ArrayList<String> list2 ){
        if (list1.size()!=list2.size()){ // проверяем одинаковые ли размеры
            return false;
        }
        Deque<String> deque1 = new LinkedList<>(list1); // превращаем лист в очередь
        Deque<String> deque2 = new LinkedList<>(list2);

        for (int i = 0; i < list1.size()-1; i++) {

            deque1.addFirst(deque1.removeLast()); // делаем сдвиг->удаляем последний (метод removeLast() возвращает
            // элемент, удаляя его ) и его же добавляем первым в очередь (addFirst)
            if(deque1.equals(deque2)) { // сравниваем
                return true;
            } // если не равны, переходим к следующему элементу цикла

        }
            return false;

    }
}
