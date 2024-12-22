/**
 * @author zzhongh
 * @version 1.0
 * @date 10/11/2024 00:37:52
 */
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Split the input by spaces, tabs, or any whitespace, and count words
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("Word count: " + wordCount);

        scanner.close();
    }
}

