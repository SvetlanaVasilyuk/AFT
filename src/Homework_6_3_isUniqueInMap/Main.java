package Homework_6_3_isUniqueInMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static boolean isUnique(Map<String, String> map) {
        if (map.isEmpty()) {
            return true;
        } else {
            Map<String, Integer> map2 = new HashMap<String, Integer>();
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> pair = iterator.next();
                if (!map2.containsKey(pair.getValue())) {
                    map2.put(pair.getValue(), 1);
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        System.out.println(isUnique(map));
        map.put("Иванов", "Илья");
        map.put("Петров", "Василий");
        map.put("Козлов", "Илья");
        map.put("Сидоров", "Николай");
        map.put("Васильев", "Илья");
        System.out.println(isUnique(map));
    }
}
