package ex03;

// this package shows how polymorphic works

public class Student {
    protected double regularGrade;
    protected double finalExamGrade;

    public Student(double regularGrade, double finalExamGrade) {
        this.regularGrade = regularGrade;
        this.finalExamGrade = finalExamGrade;
    }

    public double totalMarks() {
        return regularGrade + finalExamGrade;
    }

    // the following method override toString from the superclass Object
    @Override
    public String toString() {
        return
                "regular: " + regularGrade + " final: " + finalExamGrade + " total: " + totalMarks();
        // totalMarks() of each subclass, not superclass, are called, when an instance of subclass call this method
    }
}

// "final" is used to announce that a method cannot be overridden,
// or the value of a variety cannot be changed,
// or a class cannot be inherited
