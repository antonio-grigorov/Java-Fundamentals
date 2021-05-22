package TextProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int remain=0;
        StringBuilder finalResult=new StringBuilder();
//        while(StringBuilder(firstNumber.indexOf(0)==0));

        while(firstNumber>0){

            int result=(firstNumber%10)*secondNumber;
            if(result<10){
                finalResult.append(result+remain);
                remain=0;
            }
            if(result>10){
                finalResult.append(result%10+remain);
                remain=result/10;

            }


            firstNumber/=10;
        }
        if(remain!=0){
            finalResult.append(remain);
        }

        System.out.println(finalResult.reverse());


    }
}
