package Lesson_41;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Platforms {

     /*
        Написать метод, находящий минимальное количество платформ, требуемых на ж\д станции,
        чтобы принять количество поездов по расписанию.
        есть время прибытия и отправления поездов.

        List arrival    [1:00, 1:40, 1:50, 2:00, 2:15, 4:00]
        List departure  [1:10, 3:00, 2:20, 2:30, 3:15, 6:00]
        отсортировываем массив
        List departure  [1:10, 2:20, 2:30, 3:00, 3:15, 6:00]

        time   arr/dep      platforms
        1:00     arr            1       // если поезд прибывает, кол-во платформ увеличивается
        1:10     dep            0       // если - убывает - количество платформ уменьшается
        1:40     arr            1
        1:50     arr            2
        2:00     arr            3
        2:15     arr            4
        2:20     dep            3
        2:30     dep            2
        3:00     dep            1
        3:15     dep            0
        4:00     arr            1
        6:00     dep            0


         */
     public static void main(String[] args) {
         List<Integer> arr = Arrays.asList(100, 140, 150, 200, 215, 400);
         List<Integer> dep = Arrays.asList(110, 300, 220, 230, 315, 600);

         System.out.println(findMinPlatformsNumber(arr, dep)); // 4


     }

    public static int findMinPlatformsNumber(List<Integer> arr, List<Integer> dep){
        Collections.sort(arr); // так как лист наследует интерфейс Collections - сортируем лист прибытия
        Collections.sort(dep); // сортируем лист убытия

        int neededPlatforms = 0; // объявляем переменные, сколько платформ нужно
        int maxPlatforms = 0; //

        int i = 0; // счетчик для листа прибытия
        int j = 0; // счетчик для листа отправления

        while (i < arr.size() && j < dep.size()){ //
            if (arr.get(i) < dep.get(j)){ //   сравниваем элементы двух листов, если раньше прибыл, чем убыл
                neededPlatforms++; // нужно добавить платформу
                i++;               // переход к следующему времени списка прибытия (arr)
                if(neededPlatforms > maxPlatforms){ // если небходимое кол-во платформ больше
                    maxPlatforms = neededPlatforms;} // то максимальному колучеству присваиваем необходимое
            }
            else {//если время прибытия больше, чем время отбытия, знпчит поезд ушел и у нас освободилать платформа
                neededPlatforms--;// уменьшаем кол-во необходимых платформ
                j++; // увеличиваем  счетчик листа отправления
            }
        }
        return maxPlatforms;
    }
}
