package TextProcessing;

import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringKeys = scanner.nextLine().split("\\s+");
        int[] keys = new int[stringKeys.length];
        for (int i = 0; i < stringKeys.length; i++) {
            keys[i] = Integer.parseInt(stringKeys[i]);
        }
        StringBuilder recrypt = new StringBuilder();
        String input = scanner.nextLine();
        int key=0;
        int count = 0;
        while (!"find".equals(input)) {
            for (int i = 0; i < input.length(); i++) {
                if (count >= keys.length) {
                    count = 0;
                }
                if (count < keys.length) {
                    key = keys[count];
                }
                char currentSymbol = input.charAt(i);
                char newSymbol = (char) (currentSymbol - key);
                recrypt.append(newSymbol);
                count++;


            }
            int symbolBeforeType = recrypt.toString().indexOf("&");
            int symbolAfterType = recrypt.toString().lastIndexOf("&");
            int symbolBeforePsn = recrypt.toString().lastIndexOf("<");
            int symbolAfterPsn = recrypt.toString().lastIndexOf(">");
            String type = recrypt.toString().substring(symbolBeforeType + 1, symbolAfterType);
            String psn = recrypt.toString().substring(symbolBeforePsn + 1, symbolAfterPsn);

            System.out.println(String.format("Found %s at %s", type, psn));

            recrypt.setLength(0);
            count=0;
            input = scanner.nextLine();

        }
    }
}
