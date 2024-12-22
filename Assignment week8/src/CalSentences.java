/**
 * @author zzhongh
 * @version 1.0
 * @date 08/11/2024 22:28:08
 */
public class CalSentences {

    public static int countSentences(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == ':' || c == ';' || c == '?' || c == '!'){
                count++;
            }

        }
        return count;
    }
}
