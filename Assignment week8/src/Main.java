import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date ${DATE} ${HOUR}:${MINUTE}:${SECOND}
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type (or paste) some text: ");
        String userText = scanner.nextLine();

        int words = CalWord.countWords(userText);
        int sentences = CalSentences.countSentences(userText);
        int syllables = CalcSyllables.countSyllablesTotal(userText);



        System.out.printf("Words:" + words + " Sentences: " + sentences + " Syllables: " + syllables);


        //index calculation

        double index = 206.835 - 84.6 * ((double)syllables/(double)words) - 1.015 * ((double)words/(double)sentences);
        String result = String.format("%.6f", index);


        System.out.println("\nFlesch Readability Index = " + result);








    }


}
