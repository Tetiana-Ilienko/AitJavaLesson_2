package Lesson_45_MergeMethod;

import java.util.HashMap;
import java.util.Map;

public class DominantElement {
    public static void main(String[] args) {
        DominantElement dominantElement = new DominantElement();
        int[] array = {7,7,6,6,7};
        System.out.println(dominantElement.findDominant(array));
        System.out.println(dominantElement.findDominantMerge(array));
    }

    /*
    Пусть есть массив целых положительных чисел. Нужно написать метод, находящий элемент( если он есть),
    который встречается  в массиве больше > length/2 ( доминантный). В противном случае вернуть  -1
    [7,7,6,6,7] - 7
    [4,5,5,4,4,5] - -1
    [3,3] -3
     */
    //  решение старым способом
    public int findDominant(int[] ints) {
        Map<Integer, Integer> occurencesBynumber = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            if (occurencesBynumber.containsKey(ints[i])) {
                occurencesBynumber.put(ints[i], occurencesBynumber.get(ints[i]) + 1);
            } else {
                occurencesBynumber.put(ints[i], 1);
            }
        }
        for (int key : occurencesBynumber.keySet()) { // по мапе мы пройти не можем, так как она не итеребел, можем пройти
            // по ключам occurencesBynumber.keySet()
            if (occurencesBynumber.get(key) > ints.length / 2) return key;
        }
        return -1;
    }

    //  ********  решение с помощью метода merge ***********
    public int findDominantMerge(int[] ints) {
        Map<Integer, Integer> occurencesByNumber = new HashMap<>();

        for (int i : ints) {
            int res = occurencesByNumber.merge(i, 1, (oldValue, newValue) -> oldValue + 1);
            //  если такого ключа нет - положим 1
            // в случае если ключ есть - к старому значению прибавляем 1
            if (res > ints.length / 2) {
                return i;
            }
        }
        return -1;
    }
}
