package cn.bowen.treeMap;

import java.util.Comparator;

public class StudentByScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getScore() > o2.getScore()) {
            return -1;
        } else if(o1.getScore() < o2.getScore()){
            return 1;
        } else {
            return 0;
        }
    }
}
