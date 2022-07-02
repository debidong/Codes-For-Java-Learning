package cn.bowen.hashMap;

import java.util.HashMap;
import java.util.Map;


// hashMap无序
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 88);
        map.put("Bob", 77);
        map.put("Clark", 78);

        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}


