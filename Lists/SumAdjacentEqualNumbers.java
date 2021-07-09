package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value=scanner.nextLine();
        List<Double> numbers = Arrays.stream(value.split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i <numbers.size()-1 ; i++) {
            if(numbers.get(i).equals(numbers.get(i+1))){
                numbers.remove(i+1);
                numbers.set(i,numbers.get(i)*2);
                i=-1;
            }

        }
        for (Double number:numbers){
            System.out.print(new DecimalFormat("0.#").format(number) +" ");
        }
    }
}
