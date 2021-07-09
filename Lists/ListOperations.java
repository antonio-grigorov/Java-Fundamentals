package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] inputCommand = scanner.nextLine().split("\\s+");
        String command = inputCommand[0];

        while(!inputCommand[0].equals("End")){
            command = inputCommand[0];
        switch (command) {
            case "Add":
                int numberToAdd=Integer.parseInt(inputCommand[1]);
                numbers.add(numberToAdd);
                break;
            case "Insert":
                int index=Integer.parseInt(inputCommand[2]);
                if(index>=0 && index<numbers.size()){
                numbers.add(index, Integer.parseInt(inputCommand[1]));}
                else {
                    System.out.println("Invalid index");}
                break;
            case "Remove":
                int indexToRemove=Integer.parseInt((inputCommand[1]));
                if(indexToRemove>=0 && indexToRemove<numbers.size()){
                numbers.remove(indexToRemove);}
                else {
                    System.out.println("Invalid index");}
                break;
            case"Shift":
                if((inputCommand[1]).equals("left")){
                    for (int i = 0; i < (Integer.parseInt(inputCommand[2])); i++) {
                        int tmp = numbers.get(0);
                        for (int j = 0; j < numbers.size()-1 ; j++) {

                            numbers.set(j, numbers.get(j + 1));

                        }
                        numbers.set(numbers.size() - 1, tmp);
                    }
            }
                if((inputCommand[1]).equals("right")){
                    for (int i = 0; i < (Integer.parseInt(inputCommand[2])); i++) {
                        int tmp = numbers.get(numbers.size()-1);

                        for (int j = 0; j <numbers.size()-1 ; j++) {
                            int indexToReplace=numbers.size()-1-j;
                            int numberToReplace=numbers.get(numbers.size()-2-j);
                            numbers.set(indexToReplace,numberToReplace );

                        }
                        numbers.set(0, tmp);
                    }
                }
                break;

        }

            inputCommand = scanner.nextLine().split("\\s+");
    }

        for(int number:numbers){
            System.out.print(number+" ");
        }
}}
