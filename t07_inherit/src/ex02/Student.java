package ex02;

// subclass || extend class
public class Student extends ex02.Person {
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student() {
        //super();

    }
    private double grade;

    public String msg() {
        return name + ", " + age + ", " + grade;
    }
}
