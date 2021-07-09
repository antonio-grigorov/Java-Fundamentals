package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemontDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        List<String> items = Arrays.stream(values.split(" "))
                .collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            numbers.add(Integer.parseInt(items.get(i)));
        }


        int indexToRemove = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (numbers.size() > 0) {

            if (indexToRemove < 0) {
                int indexInNumber1 = numbers.get(0);
                sum += indexInNumber1;
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));
                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) <= indexInNumber1) {
                        numbers.set(i, numbers.get(i) + indexInNumber1);
                    } else if (numbers.get(i) > indexInNumber1) {
                        numbers.set(i, numbers.get(i) - indexInNumber1);
                    }
                }

            }
            else if (indexToRemove >= numbers.size()) {

                int indexInNumber2 = numbers.get(numbers.size() - 1);
                sum += indexInNumber2;
                numbers.remove(numbers.size() - 1);
                if(numbers.size()>0){
                numbers.add(numbers.get(0));
                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) <= indexInNumber2) {
                        numbers.set(i, numbers.get(i) + indexInNumber2);
                    } else if (numbers.get(i) > indexInNumber2) {
                        numbers.set(i, numbers.get(i) - indexInNumber2);
                    }
                }}
                else { break;}


            }
            else {
                int indexInNumber3 = numbers.get(indexToRemove);
                sum += indexInNumber3;
                numbers.remove(indexToRemove);
                if (numbers.size() > 0) {
                    for (int i = 0; i < numbers.size(); i++) {

                        if (numbers.get(i) <= indexInNumber3) {
                            numbers.set(i, numbers.get(i) + indexInNumber3);
                        } else if (numbers.get(i) > indexInNumber3) {
                            numbers.set(i, numbers.get(i) - indexInNumber3);
                        }
                    }
                } else {
                    break;
                }


            }


            indexToRemove = Integer.parseInt(scanner.nextLine());


        }

//        for (int a : numbers) {
//            System.out.print(a + " ");
//        }
        System.out.println(sum);

    }
}
