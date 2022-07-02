import ex02.Person;
import ex02.Student;

public class Main {
    public static void main(String[] args) {

        ex02.Person p1 = new Person(); // ok
        //ex02.Person p2 = new Student(); // both ok
        //Student p2 = (Student) p2 // type needs to be changed before being called


        //ex02.Student p3 = new Person(); // not ok


        ex02.Student student = new Student();
        student.setName("Yang");
        student.setAge((20));
        student.setGrade(3.7);

        // test whether an object is an instance of a class
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);

        System.out.println(student.msg());
    }
}
