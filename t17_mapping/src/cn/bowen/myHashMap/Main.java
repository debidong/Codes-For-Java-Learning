package cn.bowen.myHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Student, Integer> students = new HashMap<>();
        students.put(new Student("Alice", 202001, 88), 1);
        students.put(new Student("Dick", 202003, 100), 2);
        students.put(new Student("Bob", 202002, 65), 3);

        System.out.println(students.get(new Student("Alice", 202001, 88)));
    }
}
