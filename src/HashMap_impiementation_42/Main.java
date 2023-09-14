package HashMap_impiementation_42;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"aa");
        newMap.put(2,"cc");
        newMap.put(1,"bb");

        System.out.println(newMap.size()); // 3
        System.out.println(newMap.get(1)); // bb
        System.out.println(newMap.get(2)); // cc
        System.out.println(newMap.get(3)); // aa

        System.out.println(newMap.remove(1)); // true
        System.out.println(newMap.contains(9)); // false
        System.out.println(newMap.contains(1)); // false

        System.out.println(newMap.get(1)); // null
        System.out.println(newMap.get(3)); // aa

        Map<Integer,Integer> map = new HashMap<>(); // null
        map.put(2,34);
        System.out.println(map.get(1)); // null
    }
}
