import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 17/10/2024 23:53:08
 */
public class FindtheLargestNumber_whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create a scanner to obtain units of each saleperson from command window

        int counter = 1;
        int largest = 0;
        int number;
        // initialing variables
        //while loop
        while (counter <= 10){
            System.out.println("Enter SalePerson: " + counter + "'s units: ");
            int currentNumber = input.nextInt();
            // obtain current units
            number = currentNumber;
            if (number > largest){
                largest = number;
            }
            // compare current units and largest units, save latest largest unit in variable [largest]
            counter += 1;
            //increment studentCounter so loop eventually terminates
        }

        System.out.printf("the largest units is %d", largest);


    }
}
