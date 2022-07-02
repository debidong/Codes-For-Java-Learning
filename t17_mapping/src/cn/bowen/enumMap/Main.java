package cn.bowen.enumMap;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<DayOfWeek, String> map = new EnumMap<DayOfWeek, String>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "周一");
        //...
    }
}
