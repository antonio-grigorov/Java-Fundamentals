package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> inputList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();
        String[] inputCommandArray = inputCommand.split("\\s+");
        String commandToDo = inputCommandArray[0];

        while (!inputCommand.equals("3:1")) {
            inputCommandArray = inputCommand.split("\\s+");
            commandToDo = inputCommandArray[0];
            switch (commandToDo) {

                case "merge":

                    int startIndex = Integer.parseInt(inputCommandArray[1]);
                    int endIndex = Integer.parseInt(inputCommandArray[2]);
                    int leftBound = Math.max(startIndex, 0);
                    int rightBound = Math.min(endIndex, inputList.size() - 1);

                    for (int i = leftBound + 1; i <= rightBound; i++) {
                        inputList.set(startIndex, inputList.get(startIndex) + inputList.get(i));
                    }
                    for (int j = 0; j < rightBound - leftBound; j++) {
                        inputList.remove((leftBound + 1));
                    }
                    break;
                case "divide":
                    int indexToDivide = Integer.parseInt(inputCommandArray[1]);
                    int partitions = Integer.parseInt(inputCommandArray[2]);
                    List<String> dividedString= new ArrayList<>();
                    String currentElementToDivide=inputList.get(indexToDivide);
                    int subStringLength=currentElementToDivide.length()/partitions;
                    int count=0;
                    String separatedElement="";
                    int counterAdded=0;

                    for (int i = 0; i <partitions-1 ; i++) {
                        for (int j = 0; j <subStringLength ; j++) {
                            separatedElement+=currentElementToDivide.charAt(count);
                            count++;
                        }
                        dividedString.add(separatedElement);
                        separatedElement="";
                    }
                    for (int i = (partitions-1)*subStringLength; i <=currentElementToDivide.length()-1 ; i++) {
                        separatedElement+=currentElementToDivide.charAt(i);

                    }
                    dividedString.add(separatedElement);
                    for (int i = dividedString.size()-1; i >=0 ; i--) {
                        inputList.add(indexToDivide,dividedString.get(i));

                    }
                    int indexToRemove = indexToDivide+partitions;
                    inputList.remove(indexToRemove);

            }

            inputCommand = scanner.nextLine();

        }


        for (String element : inputList) {
            System.out.print(element + " ");

        }

    }
}
