package HomeWork_49;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {

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

    public boolean multiply(List<Integer> list, int n) {
        if (list.get(0) > n) {
            return false;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int result = list.get(left) * list.get(right);
            if (result == n) {
                return true;
            } else if (result > n) {
                right--;
            } else {
                left++;
            }
        }

        return false;


    }

    public boolean multiplyDeque(List<Integer> list, int n) {
        if (list.get(0) > n) {
            return false;
        }
        ArrayDeque<Integer> deque = new ArrayDeque<>(list);

        while (deque.size() != 0) {
            int result = deque.peekFirst() * deque.peekLast();
            if (result == n) {
                return true;
            } else if (result > n) {
                deque.removeLast();
            } else {
                deque.removeFirst();
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Main m = new Main();

        List<Integer> list = new ArrayList<>();

        list.addAll(List.of(2, 5, 18, 70));
        System.out.println(m.multiplyDeque(list, 72));

    }
}
