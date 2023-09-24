package Lesson_49;

import java.util.List;

public class TaskMain {

    /*
    Написать метод, принимающий упорядоченный лист положительных целых чисел и целое число N и проверяющий есть ли
    в этом листе такие 2 числа, что их произведение равно N. Метод в этом случае возвращает true иначе false
    {2,5,18,70}, 36 -> true
    {2,5,18,70}, 40 -> false

    {37, 38,48,23}, 36 -> false

    Решить задачу двумя способами:
    1. без вложенных циклов и без использования коллекций
    2. С использованием ArrayDeque

     */
    public boolean multiply (List<Integer> list, int n){
        if(list.get(0) > n){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) * list.get(i)==n){
                    return true;
                }
            }
        }
        return false;

    }

    public boolean multiply1 (List<Integer> list, int n){
        if(list.get(0) > n)
            return false;

        for(int i = 0; i < list.size(); i++){
            if(n % list.get(i) == 0 && list.contains(n/ list.get(i))){// если остаток от деления int n на соответствующий
                // элемент =0 и лист содержит второй множитель (n/ list.get(i)))
                // значит есть оба числа
                return true;
            }
        }
        return false;
    }


}
