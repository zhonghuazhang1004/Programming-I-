import java.security.PublicKey;

/**
 * @author zzhongh
 * @version 1.0
 * @date 07/11/2024 22:52:54
 */
public class CalcSyllables {


    /* Count all syllables in each word. Each group of adjacent vowels (a, e, i, o, u, y) counts as one
syllable (for example, the "ea" in "real" contributes one syllable, but the "e..a" in "regal" counts
as two syllables). However, an "e" at the end of a word doesn't count as a syllable. Also, each
word has at least 1 syllable, even if the previous rules give a count of 0.

     */
    public static int countSyllablesInWord(String word) {
        int syllablesCount = 0;

        boolean preWasVowel = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            //current char is vowel
            if (isVowel(c)) {
                //current char is vowel and previous char is not vowel
                if (!preWasVowel) {
                    syllablesCount++;
                }
                preWasVowel = true;
            } else {
                preWasVowel = false;
            }

            if (i == word.length() - 1 && isVowel(c) && i > 0 && !isVowel(word.charAt(i - 1))) {
                syllablesCount--;
            }

        }
        // Ensure each word has at least 1 syllable
        if (syllablesCount < 1) {
            syllablesCount = 1;
        }
        return syllablesCount;
    }

    public static boolean isVowel(char c) {
        char vowel[] = {'a', 'e', 'i', 'o', 'u'};
        c = Character.toLowerCase(c);//Converts characters to lower case
        for (int i = 0; i < vowel.length; i++) {
            if (c == vowel[i]) {
                return true;
            }
        }
        return false;

    }

    public static int countSyllablesTotal(String text) {
        String[] words = text.split("\\s+");
        int totalSyllables = 0;

        for (int i = 0; i < words.length; i++) {
            totalSyllables += countSyllablesInWord(words[i]);


        }
        return totalSyllables;
    }


}
