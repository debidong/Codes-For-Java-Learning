package ex02;

public class Student {
    private String stuID;
    private String name;

    public Student(String stuID, String name) {
        this.stuID = stuID;
        this.name = name;
    }

    public Student(String stuID) {
        this.stuID = stuID;
        this.name = "default";
    }

    // 比较满足自反性、对称性、传递性
    // 需要覆写的原因是因为比较Object型实例的实现方法是判断其是否引用相同的对象
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student s = (Student) obj;
            if(this.stuID == null && s.stuID == null) {
                return true;
            } else if(this.stuID != null) {
                return this.stuID.equals(s.stuID);
            } else {
                return false;
            }
        }

        return false;
    }
}
