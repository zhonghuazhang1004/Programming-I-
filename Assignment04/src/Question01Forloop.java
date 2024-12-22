import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 17/10/2024 22:56:52
 */
public class Question01Forloop {
    public static void main(String[] args) {
        /*
        START
            For loop, condition: studentCounter <= 10
            -create a scanner to obtain each student's result from command window:
            - if result == 1, pass + 1,  if result == 0, failure + 1
            - after entering student result, studentCounter + 1
            -when studentCounter == 10, exit the loop

            Print result:
            -print all passes and failures
            -if passes > 8, print Bonus to instructor!
        END
        * */
        Scanner scanner = new Scanner(System.in);
        // create a scanner
        int passes = 0;
        int failures = 0;

        //initializing variables

        for (int studentCounter = 1; studentCounter <= 10; studentCounter++) {
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = scanner.nextInt();
            if (result == 1) {
                passes += 1;
            }
            if (result == 0) {
                failures += 1;
            }
        }
        System.out.printf("Passed: %d%nFailed: %d%n",passes,failures);

        if (passes > 8){
            System.out.println("Bonus to instructor!");
        }
        else {
            System.out.println("No Bonus");
        }

    }
}
