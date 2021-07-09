package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int minLength=Math.min(list1.size(),list2.size());

        for (int i = 0; i < minLength; i++) {
            System.out.print(list1.get(i) + " " + list2.get(i) + " ");

        }
        printRemainingElements(list1,minLength);
        printRemainingElements(list2,minLength);



    }

    private static void printRemainingElements(List<Integer> list, int startIndex) {
        for (int i = startIndex; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");

        }
    }
}
