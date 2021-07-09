package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String text = scanner.nextLine();
        List<String> inputList = Arrays.stream(text.split("")).collect(Collectors.toList());
        String output = "";


        while (numbers.size() > 0) {

            int currentInteger = numbers.get(0);
            int currentSum = 0;
            while (currentInteger > 0) {
                currentSum += currentInteger % 10;
                currentInteger /= 10;

            }
            while (currentSum >= inputList.size()) {
                currentSum = currentSum - inputList.size();
            }
            output += inputList.get(currentSum);
            inputList.remove(currentSum);
            numbers.remove(0);


        }
        System.out.println(output);

    }
}
