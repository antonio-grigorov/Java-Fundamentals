package TextProcessing;

import java.util.Scanner;

public class html {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String article=scanner.nextLine();
        String content=scanner.nextLine();
        String comment=scanner.nextLine();
        if(article.equals(content) || content.equals(comment) || article.equals(comment)){
            return;
        }
        System.out.println(("<h1>"));
        System.out.println(String.format("    %s",article));
        System.out.println(("</h1>"));
        System.out.println("<article>");
        System.out.println(String.format("    %s",content));
        System.out.println("</article>");
        while(!"end of comments".equals(comment)){

            System.out.println("<div>");
            System.out.println(String.format("    %s",comment));
            System.out.println("</div>");

            comment=scanner.nextLine();
        }




    }
}
