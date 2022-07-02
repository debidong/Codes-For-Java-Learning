package ex01;

// this package shows how overload works

public class Main {
    public static void main(String[] args) {
    AClass obj = new AClass();
    System.out.println(obj.foobar(5, 10, 15));
    obj.foobar(5);
    obj.foobar("Hi");
    }
}


class AClass { // only can be accessed in ex01
    public void foobar(int x) {
        System.out.println("foobar (int x): " + x);
    }
    public void foobar(String s) {
        System.out.println("foobar (String s): " + s);
    }

    public int foobar(int x, int y, int z) {
        return x + y + z;
    }
}