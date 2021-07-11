package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldLength=Integer.parseInt(scanner.nextLine());
        int[] field=new int[fieldLength];
        int[] ladybugInput=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        for (int i = 0; i <fieldLength ; i++) {
            for (int j = 0; j <ladybugInput.length ; j++) {
                if(i==ladybugInput[j]){
                    field[i]=1;
                }
            }
        }
        while(true){
            String inputcommand=scanner.nextLine();
            if(inputcommand.equals("end")){
                break;
            }
            String[] commandArr=inputcommand.split(" ");
            int ladyBugOnField=Integer.parseInt(commandArr[0]);
            String direction=commandArr[1];
            int flyLength=Integer.parseInt(commandArr[2]);

            if(direction.equals("right")) {
                if(field[ladyBugOnField+fieldLength]<field[fieldLength-1]){
                    field[ladyBugOnField]=0;
                    field[ladyBugOnField+fieldLength]=1;

                }
                if(field[ladyBugOnField+fieldLength+1]<field[fieldLength-1])
                if(field[ladyBugOnField+fieldLength]==1){
                    field[ladyBugOnField]=0;
                    field[ladyBugOnField+fieldLength+1]=1;
                }


            }
        }


//        for (int j = 0; j <fieldLength; j++) {
//            System.out.print(field[j]+" ");
//
//        }
    }
}
