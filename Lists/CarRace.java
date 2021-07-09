package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        double firstRacerTime = 0;
        double secondRacerTime = 0;
        int numbersSize = numbers.size() / 2;

        for (int i = 0; i < numbersSize; i++) {
            if (numbers.get(0) == 0) {
                firstRacerTime *= 0.8;
            } else {
                firstRacerTime += numbers.get(0);
            }

            if (numbers.get(numbers.size() - 1) == 0) {
                secondRacerTime *= 0.8;
            } else {
                secondRacerTime += numbers.get(numbers.size()-1);
            }
            numbers.remove(0);
            numbers.remove(numbers.size()-1);


        }
        if(firstRacerTime<secondRacerTime){
            System.out.printf("The winner is left with total time: %.1f", firstRacerTime);
        }
        else {
            System.out.printf("The winner is right with total time: %.1f", secondRacerTime);

    }
}}
