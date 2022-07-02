package ex03;

public class StudentOfMF extends ex03.Student{
    public StudentOfMF(double regularGrade, double finalExamGrade) {
        super(regularGrade, finalExamGrade);
    }

    @Override
    public double totalMarks() {
        return 0.3 * regularGrade + 0.7 * finalExamGrade;
    }
}
