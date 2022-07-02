package bowen.ex01;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Theme mode = Theme.DAY_MODE;
        System.out.println(mode);
        System.out.println(mode.getClass());
        System.out.println(mode.ordinal());
        // ...
        if (mode==Theme.DARK_MODE) {

        }
    }

}
