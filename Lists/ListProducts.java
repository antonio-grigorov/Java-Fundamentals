package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> parts=new ArrayList<>();

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String input=scanner.nextLine();
            parts.add(input);
            
        }

        Collections.sort(parts);

        for (int i = 0; i <n ; i++) {
            System.out.printf("%d.%s%n",i+1,parts.get(i));

        }
    }
}
