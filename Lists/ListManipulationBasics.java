package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String inputCommand=scanner.nextLine();
        while(!inputCommand.equals("end")) {
        String[] inputCommandInArray=inputCommand.split(" ");
            String command=inputCommandInArray[0];
            int element=Integer.parseInt(inputCommandInArray[1]);

            switch (command){
                case "Add":
                    list1.add(element);
                    break;
                case"Remove":
                    list1.remove(Integer.valueOf(element));
                    break;
                case"RemoveAt":
                    list1.remove(element);
                    break;
                case"Insert":
                    int number=Integer.parseInt(inputCommandInArray[2]);
                    list1.add(number,element);
                    break;
            }

        inputCommand=scanner.nextLine();
        }
        System.out.println(list1.toString().replaceAll("[\\[\\],]",""));

        }

    }

