package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("end")) {
            String[] inputCommandInArray = inputCommand.split(" ");
            String command = inputCommandInArray[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(inputCommandInArray[1]);
                    if (list1.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String typeOfNumber = inputCommandInArray[1];
                    if (typeOfNumber.equals("even")) {
                        for (int i = 0; i < list1.size(); i++) {
                            if (list1.get(i) % 2 == 0) {
                                System.out.print(list1.get(i) + " ");
                            }

                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < list1.size(); i++) {
                            if (list1.get(i) % 2 == 1) {
                                System.out.print(list1.get(i) + " ");
                            }
                        }

                        System.out.println();
                    }
                    break;
                case"Get":
                    int sum=0;
                    if(inputCommandInArray[1].equals("sum")){
                        for (int i = 0; i <list1.size() ; i++) {
                            sum+=list1.get(i);

                        }

                    }
                    System.out.println(sum);
                    break;
                case"Filter":
                    int compareNumber=Integer.parseInt(inputCommandInArray[2]);
                    if(inputCommandInArray[1].equals(">=")){
                        for (int i = 0; i <list1.size() ; i++) {
                            if(list1.get(i)>=compareNumber){
                                System.out.print(list1.get(i)+" ");
                            }
                        }
                        System.out.println();}
                        if(inputCommandInArray[1].equals("<=")){
                            for (int i = 0; i <list1.size() ; i++) {
                                if(list1.get(i)<=compareNumber){
                                    System.out.print(list1.get(i)+" ");
                                }
                            }
                            System.out.println();
                    }
                    if(inputCommandInArray[1].equals("<")){
                        for (int i = 0; i <list1.size() ; i++) {
                            if(list1.get(i)<compareNumber){
                                System.out.print(list1.get(i)+" ");
                            }
                        }
                        System.out.println();
                    }
                    if(inputCommandInArray[1].equals(">")){
                        for (int i = 0; i <list1.size() ; i++) {
                            if(list1.get(i)>compareNumber){
                                System.out.print(list1.get(i)+" ");
                            }
                        }
                        System.out.println();
                    }
                        break;




            }
            inputCommand = scanner.nextLine();
        }
    }
}
