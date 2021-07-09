package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[] arrays=input.split("\\|");
        List<String> list1= new ArrayList<>();

        for (int i = arrays.length-1; i >=0 ; i--) {
            String[] temp=arrays[i].split("\\s+");
            for(String element:temp){
                if(!element.equals("")){
                list1.add(element);}
            }
        }
        System.out.print(String.join(" ", list1));



    }
}
