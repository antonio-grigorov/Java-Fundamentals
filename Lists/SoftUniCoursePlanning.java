package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCourses = scanner.nextLine();
        List<String> inputList = Arrays.stream(inputCourses.split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        String[] commandArray = command.split(":");

        while (!command.equals("course start")) {
            commandArray = command.split(":");
            String commandToExecute = commandArray[0];

            switch (commandToExecute) {
                case "Add":
                    boolean courseInList=false;
                    String courseToAdd = commandArray[1];
                    for (int i = 0; i < inputList.size(); i++) {
                        if (courseToAdd.equals(inputList.get(i))) {
                            courseInList = true;
                        }

                    }
                    if (!courseInList) {
                        inputList.add(courseToAdd);
                    }
                    break;

                case "Insert":
                    String courseToInsert = commandArray[1];
                    int indexToInsert = Integer.parseInt(commandArray[2]);
                    boolean courseInSchedule = false;
                    for (int i = 0; i < inputList.size(); i++) {
                        if (courseToInsert.equals(inputList.get(i))) {
                            courseInSchedule = true;
                        }

                    }
                    if (!courseInSchedule) {
                        inputList.add(indexToInsert, courseToInsert);
                    }
                    break;
                case "Remove":
                    String courseToRemove = commandArray[1];
                    inputList.remove(courseToRemove);
                    inputList.remove(courseToRemove + "-Exercise");
                    break;
                case "Articles2":
                    String exerciseToInsert = commandArray[1];
                    boolean courseExists = false;
                    int indexAfterCourse = 0;

                    for (int i = 0; i < inputList.size(); i++) {
                        if (exerciseToInsert.equals(inputList.get(i))) {
                            courseExists = true;
                            indexAfterCourse = i + 1;
                        }
                    }
                    if (courseExists) {
                        inputList.add(indexAfterCourse, exerciseToInsert + "-Exercise");
                    } else {
                        inputList.add(exerciseToInsert);
                        inputList.add(exerciseToInsert + "-Exercise");
                    }
                    break;
                case "Swap":
                    String firstToSwap = commandArray[1];
                    String secondToSwap = commandArray[2];
                    String firstEx = commandArray[1] + "-Exercise";
                    String secondEx = commandArray[2] + "-Exercise";
                    int firstIndex = inputList.indexOf(commandArray[1]);
                    int secondIndex = inputList.indexOf(commandArray[2]);

                    String temp = inputList.get(secondIndex);
                    inputList.set(secondIndex, firstToSwap);
                    inputList.set(firstIndex, temp);

                    if(secondIndex+1<inputList.size()){
                        if(firstEx.equals(inputList.get(firstIndex+1)) && secondEx.equals(inputList.get(secondIndex+1))){
                        String tempEx = inputList.get(secondIndex+1);
                        inputList.set(secondIndex+1, firstEx);
                        inputList.set(firstIndex+1, tempEx);
                        }
                        else if(firstEx.equals(inputList.get(firstIndex+1))) {
                            inputList.add(secondIndex+1,firstEx);
                            inputList.remove(firstIndex+1);


                        }
                        else if(secondEx.equals(inputList.get(secondIndex+1))) {
                        inputList.add(firstIndex+1,secondEx);
                        inputList.remove(secondIndex+2);


                        }}




                    break;


                    }




            command = scanner.nextLine();

        }
        for (int i = 0; i < inputList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, inputList.get(i));


        }


    }
}
