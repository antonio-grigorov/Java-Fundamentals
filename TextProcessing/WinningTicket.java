package TextProcessing;

import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] tokens = input.split("\\s{0,1000},\\s{0,1000}");

//'@', '#', '$' and '^'
        for (int i = 0; i < tokens.length; i++) {
            boolean isValid = false;
            if (tokens[i].length() == 20) {
                isValid = true;
            }
            if (isValid == false) {
                System.out.println("invalid ticket");
                continue;
            } else {
                String leftHalf = tokens[i].substring(0, 10);
                String rightHalf = tokens[i].substring(10, 20);

                int count = 0;
                if(isWinning(leftHalf, count) == 10
                        && isWinning(rightHalf, count) == 10
                        && tokens[i].charAt(5)==tokens[i].charAt(15)){
                    count=isWinning(leftHalf, count);
                    System.out.println(String.format("ticket \"%s\" - %d%s Jackpot!", tokens[i], count,tokens[i].charAt(5)));

                }
                else if (isWinning(leftHalf, count) >= 6
                        && isWinning(rightHalf, count) >= 6 &&
                        tokens[i].charAt(5)==tokens[i].charAt(15)) {
                    count=isWinning(leftHalf, count);
                    System.out.println(String.format("ticket \"%s\" - %d%s", tokens[i], count,tokens[i].charAt(5)));

                }
                else {
                    System.out.println(String.format("ticket \"%s\" - no match", tokens[i]));
                }
            }

        }


    }

    private static int isWinning(String half, int count) {
        count = 1;
        for (int i = 0; i < half.length() - 1; i++) {
            char lastSymbol = half.charAt(i);
            char currentSymbol = half.charAt(i + 1);

            if (currentSymbol == '@' || currentSymbol == '#' || currentSymbol == '$' || currentSymbol == '^') {
                if (currentSymbol == lastSymbol) {
                    count++;

                }
                if(count==6){
                    break;
                }
//                tozi if maha sluchaq jackpot - trqbva da e v else no i count=1 da se izpalnqva pri nevqrna poredica
                else {

                    count=1;
                }

            }
        }
        if (count == 6) {
            return count;
        }


        return count;
    }
}
