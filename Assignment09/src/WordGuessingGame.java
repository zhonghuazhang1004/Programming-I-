import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 16/11/2024 01:11:11
 */
public class WordGuessingGame {
    public static void main(String[] args) {

        String SelectWord = RandomSelectWord();


        System.out.println(" WORD : " + SelectWord);


        GuessingGame(SelectWord);


    }

    public static String RandomSelectWord() {
        Dictionary dict = new Dictionary("dictionary.txt");

        int numWords = dict.GetNumWords();
        // pick a random number between 0 and numWords-1
        int randomIndex = (int) (Math.random() * numWords);
        // get the word at the random index, minimum length 5 letters
        String word = dict.GetWordAt(randomIndex);
        while (word.length() < 5) {
            randomIndex = (int) (Math.random() * numWords);
            word = dict.GetWordAt(randomIndex);
        }
        return word;

    }

    public static void GuessingGame(String word) {
        System.out.println("I have picked a secret word. Try to guess its letters!");
        boolean gameOver = false;

        int guessCount = 0;
        int corrcteNumber = 0;
        //display dashboard '---------'
        char[] displayWord = new char[word.length()];
        Arrays.fill(displayWord, '-');
        String displayWordString = new String(displayWord);
        System.out.println(displayWordString);
        StringBuilder displayStringBuilder = new StringBuilder(displayWordString);

//        game start
        while (!gameOver) {


            guessCount++;
            //get guess letter from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess > ");

            String guessLetter = scanner.nextLine();
            //convert input to lowercase
            guessLetter = guessLetter.toLowerCase();

            //check if guess letter is correct
            for (int i = 0; i < word.length(); i++) {


                if (guessLetter.equals(word.substring(i, i + 1))) {
                    //System.out.println("Correct! " + guessLetter + " is in the word at position " + (i + 1));

                    displayStringBuilder.setCharAt(i, guessLetter.charAt(0));

                    corrcteNumber += 1;
//                    System.out.println("correctUmber---" + corrcteNumber);
//                    System.out.println("guessCount---" + guessCount);
//
                }


            }
            System.out.println(displayStringBuilder.toString());
            System.out.println();


            if (corrcteNumber == word.length()) {
                System.out.println(word);
                System.out.println("you got it in " + guessCount + " guesses!");
                gameOver = true;
            }


        }


    }
}
