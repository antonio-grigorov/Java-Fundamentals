package TextProcessing;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Pics\\Rila2008.jpg";
        String filename = path.substring(8, 16);
        System.out.println(filename);
    }
}
