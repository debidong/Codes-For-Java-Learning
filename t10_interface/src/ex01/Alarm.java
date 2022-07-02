package ex01;

public interface Alarm {
    void ring(); // Modifier 'public' is redundant for interface methods
    default void foo() {
        System.out.println("Now you can put the implements of this function here."); // the usage of the modifier default
    }
}
