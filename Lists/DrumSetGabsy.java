package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSetGabsy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gabySavings=Double.parseDouble(scanner.nextLine());
        List<Integer> drumList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> initialDrumList= new ArrayList<>(drumList);

        String input=scanner.nextLine();

        while(!input.equals("Hit it again, Gabsy!")){
            int hitPower=Integer.parseInt(input);
            for (int i = 0; i <drumList.size() ; i++) {
                drumList.set(i,drumList.get(i)-hitPower);
                if(drumList.get(i)<=0){
                    if(gabySavings>=initialDrumList.get(i)*3) {
                        gabySavings -= initialDrumList.get(i) * 3;
                        drumList.set(i,initialDrumList.get(i));
                    }
                    else { drumList.remove(i);
                    initialDrumList.remove(i);
                    i-=1;

                }

            }}

            input=scanner.nextLine();


        }
        for(int el:drumList){
            System.out.print(el+" ");
        }


        System.out.printf("%nGabsy has %.2flv.", gabySavings);
//        System.out.println();
//        for(int el:initialDrumList){
//            System.out.print(el+" ");
//        }



    }
}
