package ex02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String info = getInfo("data.csv");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static String getInfo(String fileName) throws FileNotFoundException {
            InputStream is = new FileInputStream(fileName);
            Scanner scanner = new Scanner(is);
            String info = scanner.nextLine();
            scanner.close();
            return info;
    }
}
