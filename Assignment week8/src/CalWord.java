/**
 * @author zzhongh
 * @version 1.0
 * @date 09/11/2024 01:18:36
 */
public class CalWord {

    public static int countWords(String text) {
        CalcSyllables calcSyllables = new CalcSyllables();
        int words = 0;
        boolean prevCharWasALetter = false;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // apostrophes (and other characters?) should be ignored
            if (c == '\'' || c == '-' )
                continue;

            // everything else is either a letter, or it isn't
            boolean charIsALetter = ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));

            // and a word is defined as a letter following a non-letter
            if (charIsALetter) {
                if (!prevCharWasALetter) {
                    words++;

                    if (word.length() > 0)

                        System.out.println("'" + word.toString() + "'" + " has " + calcSyllables.countSyllablesInWord(word.toString()) + " Syllables");
                    word.setLength(0);
                }

                word.append(c);

            }

            prevCharWasALetter = charIsALetter;
        }

        if (word.length() > 0)

            System.out.println("'" + word.toString() + "'" + " has " + calcSyllables.countSyllablesInWord(word.toString()) + " Syllables");

        return words;


    }
}
