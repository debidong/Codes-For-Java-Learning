package ex03;

public class StudentOfCS extends ex03.Student {

    public StudentOfCS(double regularGrade, double finalExamGrade) {
        super(regularGrade, finalExamGrade);
    }

    @Override
    public double totalMarks() {
        return 0.5 * regularGrade + 0.5 * finalExamGrade;
    }

}
