/**
 * @author zzhongh
 * @version 1.0
 * @date 09/11/2024 22:44:58
 */
import java.util.Scanner;

public class text {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一段文本：");
        String text = input.nextLine();

        int words = countWords(text);
        int syllables = countSyllables(text);
        int sentences = countSentences(text);

        double fleschIndex = calculateFleschIndex(words, syllables, sentences);

        System.out.println("单词数: " + words);
        System.out.println("音节数: " + syllables);
        System.out.println("句子数: " + sentences);
        System.out.println("Flesch Readability Index: " + fleschIndex);
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countSyllables(String text) {
        int syllables = 0;
        String[] words = text.split("\\s+");

        for (String word : words) {
            int wordSyllables = 0;
            boolean prevCharWasVowel = false;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                boolean isVowel = isVowel(c);

                if (isVowel) {
                    if (!prevCharWasVowel) {
                        wordSyllables++;
                    }
                    prevCharWasVowel = true;
                } else {
                    prevCharWasVowel = false;
                }
            }

            // Check if the last character is 'e'
            if (word.endsWith("e")) {
                wordSyllables--;
            }

            // Ensure each word has at least one syllable
            wordSyllables = Math.max(wordSyllables, 1);

            syllables += wordSyllables;
        }

        return syllables;
    }

    private static int countSentences(String text) {
        String[] sentences = text.split("[.!?;:]+");
        return sentences.length;
    }

    private static boolean isVowel(char c) {
        return "aeiouyAEIOUY".indexOf(c) != -1;
    }

    private static double calculateFleschIndex(int words, int syllables, int sentences) {
        double score = 206.835 - 1.015 * (double) words / sentences - 84.6 * (double) syllables / words;
        return score;
    }
}

