package ex02;

// parent class || super class
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {

    }

    // protected: only can be visited by sub-classes
    protected String name;
    protected int age;
}
