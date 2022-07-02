package cn.bowen.treeMap;

import java.util.Map;
import java.util.TreeMap;


// treeMap有序
public class Main {
    public static void main(String[] args) {
        Map<Student, Integer> students = new TreeMap<>(new StudentByName());
        students.put(new Student("Alice", 88), 1);
        students.put(new Student("Bob", 77), 2);
        students.put(new Student("Clark", 66), 3);
        for(var entry: students.entrySet()) {
            System.out.println(entry.getKey());
        }

        Map<Student, Integer> _students = new TreeMap<>(new StudentByScore());
        _students.put(new Student("Alice", 88), 1);
        _students.put(new Student("Bob", 66), 2);
        _students.put(new Student("Clark", 77), 3);
        for(var entry: _students.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}