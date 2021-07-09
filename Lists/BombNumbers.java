package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scanner.nextLine().split("\\s+");
        int detonationNumber = Integer.parseInt(input[0]);
        int detonationPower = Integer.parseInt(input[1]);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == detonationNumber) {
                for (int j = 0; j < detonationPower; j++) {
                    if (i + 1 <= numbers.size() - 1) {
                        numbers.remove(i + 1);
                    }
                }
                for (int j = 1; j <= detonationPower; j++) {
                    if(i-j>=0 && i-j<=numbers.size()){

                    numbers.remove(i -j);}

                }

                numbers.remove(Integer.valueOf(detonationNumber));
                i = 0;
            }

        }

        int sum=0;
        for (int number : numbers) {
            sum+=number;
        }
        System.out.println(sum);


    }
}

