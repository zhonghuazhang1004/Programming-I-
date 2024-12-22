import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 18/10/2024 22:28:56
 */
public class FindtheLargestNumber_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create a scanner to obtain units of each saleperson from command window

        int largest = 0;

        // initialing variables
        // for loop
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter SalePerson: " + counter + "'s units: ");

            int number = input.nextInt();
            if (number > largest) {
                largest = number;
            }



        }
        System.out.printf("the largest units is %d", largest);


    }
}
