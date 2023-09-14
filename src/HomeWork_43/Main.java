package HomeWork_43;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
      Дан массив строк ( не пустой). Написать метод,принимающий этот массив и возвращающий мапу Map<String,Boolean>
      где каждая строка является ключом, а значением является true если строка в массиве встечается больше одного
      раза и false если только один раз.
      Примеры:
      [a,b,a,c,b]- a:true b:true c:false
      [a,b,c]- a:false b:false c:false
      [c,c,c]- c:true
       */

    /*
    1. Создаем Мар
    2. В цикле преебераем массив и каждое значение записываем в Мар как ключ.
    3. Если такого ключа еще нет - в значение в мапе пищем false - иначе - иначе значение раписываем true
         */


    public static Map<String,Boolean> trueFalseMap (String[] strings){
        Map<String,Boolean> resultMap= new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            if (resultMap.containsKey(string)){
                resultMap.put(string, true);

            }else {
                resultMap.put(string, false);

            }

        }
        return resultMap;
    }
    public static void main(String[] args) {
      String[] arrays = {"Jack", "Bill","Ann", "Jack","john","Ann"};

        System.out.println(trueFalseMap(arrays));


    }
}
