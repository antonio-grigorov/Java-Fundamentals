package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input=scanner.nextLine();
        int indexOfSlash=input.lastIndexOf('\\');
        int indexofPoint=input.lastIndexOf('.');
        String fileName=input.substring(indexOfSlash+1,indexofPoint);
        String fileExtension=input.substring(indexofPoint+1);

        System.out.println(String.format("File name: %s",fileName));
        System.out.println(String.format("File extension: %s",fileExtension));


    }
}
