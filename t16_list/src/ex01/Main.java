package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("world");
        list.add(0,"hello");
        for(String s: list) {
            System.out.println(s);
        }
    }

//    public static void main(String[] args) {
//        List<> list = new ArrayList<>();
//        list.add("world");
//        list.add(0,"hello");
//        for(Object o: list) {
//            System.out.println(o);
//        }
//    }
}
