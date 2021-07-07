package TextProcessing;
import java.util.Scanner;
public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();

        StringBuilder result=new StringBuilder();
        int power=0;
        for (int i = 0; i <input.length() ; i++) {
                char currentSymbol=input.charAt(i);
            if(currentSymbol=='>'){
                result.append(currentSymbol);
                power+=Integer.parseInt(String.valueOf(input.charAt(i+1)));
                if(power>0){
                    power-=1;
                    i+=1;
                    continue;
                }
            }
            if(power>0){
                power-=1;
                continue;
            }
            result.append(currentSymbol);


        }
        System.out.println(result);









    }
}
