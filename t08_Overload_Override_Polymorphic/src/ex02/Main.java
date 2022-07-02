package ex02;

// This package shows how override works

public class Main {
    public static void main(String[] args) {
        Person p = new Student();
        p.foobar(); // polymorphic happens
    }
}

class Person {
    public void foobar() {
        System.out.println("Person");
    }
}

class Student extends Person {
    //@Override
    public void foobar() {
        System.out.println("Student");
    }
}
