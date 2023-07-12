import java.util.Scanner;

public class LongDescription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linesOnPage = sc.nextInt();

        int amountOfWords = sc.nextInt();

        int amountOfWordsInLine = sc.nextInt();

        int amountOfLines = 0;

        if(amountOfWords % amountOfWordsInLine == 0){
            amountOfLines = amountOfWords / amountOfWordsInLine;
        } else {
            amountOfLines = amountOfWords / amountOfWordsInLine + 1;
        }

        int result = 0;

        if (amountOfLines % linesOnPage == 0) {
            result = amountOfLines / linesOnPage;
        } else {
            result = amountOfLines / linesOnPage;
            result++;
        }

        System.out.println(result);

        sc.close();
    }
}
