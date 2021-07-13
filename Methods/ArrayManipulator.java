package com.company;

import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int[] array = new int[data.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(data[i]);
        }
        String input = scanner.nextLine();
        while(!"end".equals(input)){

            String[] tokens=input.split(" ");

        String command = tokens[0];



        switch (command) {
            case "exchange": {
                int index = Integer.parseInt(tokens[1]);
                if (index < 0 || index >= array.length) {
                    System.out.println("Invalid index");
                } else {
                    exchangePlaces(array, index);

                }

            }
            break;

            case "max": {
                String evenOrOdd = tokens[1];

                if (evenOrOdd.equals("odd")) {
                    maxOddElement(array);
                } else if (evenOrOdd.equals("even")) {

                    maxEvenElement(array);
                }


            }
            break;
            case "min": {
                String evenOrOdd = tokens[1];
                if (evenOrOdd.equals("odd")) {
                    minOddElement(array);
                } else if (evenOrOdd.equals("even")) {
                    minEvenElement(array);
                }

            }
            break;

            case "first": {
                int count = Integer.parseInt(tokens[1]);

                String evenOrOdd = tokens[2];
                if (evenOrOdd.equals("even")) {
                    firstCountEvenElements(array, count);
                } else if (evenOrOdd.equals("odd")) {
                    firstCountOddElements(array, count);
                }

            }
            break;


            case "last": {
                int count = Integer.parseInt(tokens[1]);

                String evenOrOdd = tokens[2];
                if (evenOrOdd.equals("even")) {
                    lastCountEvenElements(array, count);
                } else if (evenOrOdd.equals("odd")) {
                    lastCountOddElements(array, count);
                }
                }
            break;


        }

            input=scanner.nextLine();

    }
        printArray(array);

    }


    private static void lastCountOddElements(int[] array, int count) {
        int[] result = new int[0];
        if(count>array.length){
            System.out.println("Invalid count");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i]) % 2 != 0) {
                result = addResult(result, array[i]);
            }
            if (result.length == count) {
                break;
            }

        }
        array = reverseArray(array);
        printArray(result);
    }

    private static void lastCountEvenElements(int[] array, int count) {
        int[] result = new int[0];
        if(count>array.length){
            System.out.println("Invalid count");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i]) % 2 == 0) {
                result = addResult(result, array[i]);
            }
            if (result.length == count) {
                break;
            }

        }
        array = reverseArray(array);
        printArray(result);

    }

    private static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - i - 1];


        }
        return reverseArray;
    }

    private static void firstCountOddElements(int[] array, int count) {
        int[] result = new int[0];
        if(count>array.length){
            System.out.println("Invalid count");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i]) % 2 != 0) {
                result = addResult(result, array[i]);
                if (result.length == count) {
                    break;
                }

            }
        }
        printArray(result);
    }

    private static void firstCountEvenElements(int[] array, int count) {

        int[] result = new int[0];
        if(count>array.length){
            System.out.println("Invalid count");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i]) % 2 == 0) {
                result = addResult(result, array[i]);
                if (result.length == count) {
                    break;
                }

            }
        }
        printArray(result);

    }

    private static void printArray(int[] result) {

        System.out.print("[");
        for (int i = 0; i <result.length; i++) {
            if (i == 0) {

                System.out.print(result[i]);
            } else {
                System.out.print(", " + result[i]);
            }
        }
        System.out.print("]");
        System.out.println();

    }


    private static void minEvenElement(int[] array) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= minElement) {
                minElement = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    private static void minOddElement(int[] array) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 && array[i] <= minElement) {
                minElement = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void maxEvenElement(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= maxElement) {
                maxElement = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void maxOddElement(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 && array[i] >= maxElement) {
                maxElement = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void exchangePlaces(int[] array, int index) {
        for (int i = 0; i < array.length - 1 - index; i++) {
            int tmp = array[array.length - 1];
            for (int j = 0; j < array.length - 1; j++) {

                array[array.length - 1 - j] = array[array.length - 2 - j];
            }
            array[0] = tmp;
        }

    }


    private static int[] addResult(int[] oldResult, int element) {
        int[] newArray = new int[oldResult.length + 1];
        for (int i = 0; i < oldResult.length; i++) {
            newArray[i] = oldResult[i];

        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }


}
