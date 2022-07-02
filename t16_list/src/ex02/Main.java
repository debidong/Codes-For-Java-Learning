package ex02;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("2020251128", "Bowen"));
        students.add(new Student("2020251129","He"));
        Student s = new Student("2020251128");
        System.out.println(students.contains(s));
    }
}

