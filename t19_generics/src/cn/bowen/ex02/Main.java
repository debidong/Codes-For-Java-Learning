package cn.bowen.ex02;

// used generics


public class Main {
    public static void main(String[] args) {
        MyList<String> ls = new MyList();
        ls.add("Hello");
        ls.add("World");
        System.out.println(ls);
    }
}
