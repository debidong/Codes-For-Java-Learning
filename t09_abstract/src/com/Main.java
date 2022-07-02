// This program shows how abstract class and JAR package works
package com;

public class Main {
    public static void main(String[] args) {
        Person[] p = {new Student(), new Teacher()};
        for(Person person: p) {
            person.foobar();
        }
    }
}


// an abstract class can have non-abstract method
abstract class Person {
    public abstract void foobar();
}

class Student extends Person {
    @Override
    public void foobar() {
        System.out.println("S");
    }
}

class Teacher extends Person {
    @Override
    public void foobar() {
        System.out.println("T");
    }
}