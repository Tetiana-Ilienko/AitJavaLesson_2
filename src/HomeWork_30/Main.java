package HomeWork_30;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1
Используя принципы отбрасывания констант и оставления только максимально быстро растущего
элемента найти асимптотики для следующих функций:

f(n) = 9n +73  --> f(n) = n;
f(n) = 235     --> f(n) = 1;
f(n) = n^2 + 7n +123 --> f(n) = n^2;
f(n) = n^3 +2000n +8765 n^ --> f(n) = n^3;
f(n) = n + sqrt(n)  --> f(n) = n;
         */

        String str1 = "Hello";
        String str2 = "olleH";
        String str3 = "Hello";
        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram(str1, str3));


    }
    /*
    Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)

 */
    public static boolean isAnagram(String str1, String str2){
        if (str1.length()!= str2.length()){
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);

//        ---------------  2 вариант
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i]!=chars2[i]){
                return false;
            }
            return true;
//        -----------------------
        }


    }



    public static boolean isPolligram(String str1, String str2) { // если поллиграмма
        StringBuilder sb1 = new StringBuilder(str1);
        String str = new String(sb1.reverse());
        if (str2.equals(str)) { // можно взять метод сравнивания строк без учета регистра
            return true;
        }
        return false;
    }
}
