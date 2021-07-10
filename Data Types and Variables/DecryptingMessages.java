package com.company;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key=Integer.parseInt(scanner.nextLine());
        int n=Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <n ; i++) {
            String input=scanner.nextLine();
            char c = input.charAt(0);

            char output=(char) (c+key);
            System.out.print(output);

        }
    }
}
