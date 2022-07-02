package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String info = getInfo("data.csv");
    }

    private static String getInfo(String fileName) {
        try{
            InputStream is = new FileInputStream(fileName);
            Scanner scanner = new Scanner(is);
            String info = scanner.nextLine();
            scanner.close();
            return info;
        } catch (FileNotFoundException e) {
            System.out.println("Fatal Error: Can not find the data file.");
        } finally {
            return null;
        }
    }
}
