import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 05/10/2024 23:19:49
 */
public class Test {
    public static void main(String[] args) {
        Account account1 = new Account("Zhonghua Zhang", 100.01);

        // display initial balance of account 1
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdraw amount for account1: "); // prompt
        double withDrwaAmount = input.nextDouble(); // obtain user input

        System.out.printf("%nremoving %.2f from account1 balance%n%n",
                withDrwaAmount);


        account1.withDraw(withDrwaAmount);
        // minus withdraw amount from balance


        // display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
    }
}
