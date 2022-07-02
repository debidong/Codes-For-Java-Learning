package ex03;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new StudentOfCS(80, 60),
                new StudentOfMF(70, 60)
        };

        for(Student s : students) {
            System.out.println(s.totalMarks());
            System.out.println(s);
        }

    }
}
