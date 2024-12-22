/**
 * @author zzhongh
 * @version 1.0
 * @date 09/11/2024 22:40:14
 */
public class CalReadabilityIndex {
    public static double calculateReadabilityIndex(String text)
    {
        int words = CalWord.countWords(text);
        int sentences = CalSentences.countSentences(text);
        int syllables = CalcSyllables.countSyllablesTotal(text);

        double index = 206.835 - 84.6 * ((double)syllables/(double)words) - 1.015 * ((double)words/(double)sentences);
        return index;
    }
}
