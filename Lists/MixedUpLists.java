package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> finalList = new ArrayList<>();

        boolean list1IsBigger = false;
        if (list1.size() > list2.size()) {
            list1IsBigger = true;
        }
        int startNumber = list2.get(list2.size() - 2);
        int endNumber = list2.get(list2.size() - 1);
        if (list1IsBigger) {
            startNumber = list1.get(list1.size() - 2);
            endNumber = list1.get(list1.size() - 1);
        }

        while (list1.size() > 0 && list2.size() > 0) {
            finalList.add(list1.get(0));
            list1.remove(0);

            finalList.add(list2.get(list2.size() - 1));
            list2.remove(list2.size() - 1);
        }

        int startIndex=finalList.indexOf(startNumber);
        int endIndex=finalList.indexOf(endNumber);

        for (int i = startIndex+1; i <endIndex ; i++) {
            System.out.printf(finalList.get(i)+" ");

        }







    }


}

