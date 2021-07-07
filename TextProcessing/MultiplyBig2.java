package TextProcessing;

import java.util.Scanner;

public class MultiplyBig2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        String first=scanner.nextLine();
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int remain=0;
        StringBuilder finalResult=new StringBuilder();
        while(first.charAt(0)=='0'){
            first=first.substring(1);

        }


        if(secondNumber==0){
            System.out.println(0);
            return;
        }
        for (int i = first.length()-1; i>=0 ; i--) {

            int currentNumber=Integer.parseInt(String.valueOf(first.charAt(i)));

            int result=currentNumber*secondNumber+remain;
            if(result<10){
                finalResult.append(result);
                remain=0;
            }
            if(result>=10){
                finalResult.append(result%10);
                remain=result/10;

            }


        }
        if(remain!=0){
            finalResult.append(remain);
        }

        System.out.println(finalResult.reverse());


    }
}
