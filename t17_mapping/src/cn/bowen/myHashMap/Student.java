package cn.bowen.myHashMap;

public class Student {
    private String name;
    private int stuID;
    private double grade;

    public Student(String name, int stuID, double grade) {
        this.name = name;
        this.stuID = stuID;
        this.grade = grade;
    }

    // must do: override hashCode() and equals()
    @Override
    public int hashCode() {
        int hash = 0;
        hash += name.hashCode(); hash *= 57;
        hash += stuID; hash *= 57;
        hash += Double.doubleToLongBits(grade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        Student stu = (Student) obj;
        return stu.name.equals(this.name) && stu.stuID == this.stuID && stu.grade == this.grade;
    }
}
