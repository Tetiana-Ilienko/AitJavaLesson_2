package HomeWork_36;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Задача 1
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист,
содержащий элементы Yes или No, где значения на i-м месте зависит от того,
равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать

Задача 2
Написать метод, принимающий лист целых чисел и целое число и возвращающий лист без элементов
больших этого числа.
Протестировать.
     */

    public static List<String> compareLists(List<Integer> list1, List<Integer> list2 ){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))){
                result.add("Yes");
            } else {
                result.add("No");
            }

        }

       return result;
    }

    public static List<Integer> returnListWithAutNumber(List<Integer> list, int number){
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < number){
                resultList.add(list.get(i));

            }

        }

        return resultList;
    }


    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(5);
        arrayList1.add(2);
        arrayList1.add(70);
        arrayList1.add(11);
        arrayList1.add(8);
        System.out.println(arrayList1);

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(88);
        arrayList2.add(11);
        arrayList2.add(8);
        arrayList2.add(8);

        System.out.println(arrayList2);

        System.out.println(compareLists(arrayList1, arrayList2));

        System.out.println(returnListWithAutNumber(arrayList2,9 ));


    }
}
