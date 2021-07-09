package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i-=1;
            }

        }
        Collections.reverse(list);
        if (list.size() == 0) {
            System.out.println("empty");
        }
        else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }

        }
    }
}
