package HomeWork_45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
    Написать метод, принимающий не пустой лист целых чисел , в котором все числа кроме одного имеют пару и
    возвращающий это непарное число. При решении использовать мапу
    Примеры:
     1,3,1 -> 3
     3,3,3 -> 3
     1,1,15,1,1 -> 15
     1,8,8,8,8,8,1,2,2 -> 8
     */

    public static int unpairedNumber(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int res =0;

        for (int i : list) {
            map.merge(i, 1, (oldValue, newValue) -> oldValue + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) % 2 !=0)
                res = key;
        }
        return res;

    }

    public static int unpairedNumber1(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int l : list) {
           if (map.containsKey(l)){
               int oldValue = map.get(l);
               map.put(l,oldValue+1);
           } else {
               map.put(l,1);
           }
        }
        for (int key : map.keySet()) {
            if (map.get(key) % 2 !=0)
               res = key;
        }
        return res;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1);

        System.out.println(unpairedNumber1(list));
        System.out.println(unpairedNumber(list));


    }


}
