package cn.edu.hrbeu.bowen.StringBuilder;


// this class shows how StringBuilder works
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(23); // append 意为附加
        sb.append(45);
        sb.insert(1,"abc");
        System.out.println(sb.toString());


        String fName = "Yang";
        String name = "Bowen";
        sb.append(fName).append(name);
        System.out.println(sb.toString());
    }
}
