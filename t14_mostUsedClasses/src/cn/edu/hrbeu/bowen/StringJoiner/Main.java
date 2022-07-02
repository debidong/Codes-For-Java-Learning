package cn.edu.hrbeu.bowen.StringJoiner;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {12, 34, 56, 78};
        StringJoiner sj = new StringJoiner(",");
        for(int x: arr)
            sj.add(Integer.toString(x));
        System.out.println(sj);
    }
}
