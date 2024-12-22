import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 10/10/2024 23:14:57
 */
public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int newBalance;

        System.out.println("Enter account number:");
        int accountNumber = input.nextInt();
        input.nextLine();
//      input account number

        System.out.println("Enter balance at the beginning of the month: ");
        int startBalance = input.nextInt();
        input.nextLine();
//      balance at the beginning of the month

        System.out.println("Enter total of all items charges by the customers this month: ");
        int totalCharges = input.nextInt();
        input.nextLine();
//      total of all items charges by the customers this month

        System.out.println("Enter total of all credits applied to the customer’s account this month: ");
        int allCredits = input.nextInt();
        input.nextLine();
//      total of all items charges by the customers this month

        System.out.println("Enter allowed credit limit.: ");
        int allowedCredit = input.nextInt();
        input.nextLine();
//      total of all items charges by the customers this month


        Account account1 = new Account(accountNumber, startBalance, totalCharges, allCredits, allowedCredit);
//

//        newBalance = startBalance - totalCharges - allCredits;
//
//        if (newBalance >= allowedCredit){
//            System.out.println("Account :" + account1.getAccountNumber() + "---new balance:" + newBalance);
//        }
//        else {
//            System.out.println("Credit limit exceeded");
//        }

        if (balance(startBalance,totalCharges,allCredits,allowedCredit) != -1){
            System.out.println("Account :" + account1.getAccountNumber() + "--- new balance: " + balance(startBalance,totalCharges,allCredits,allowedCredit));
        }
        else {
            System.out.println("Credit limit exceeded");

        }

    }


    public static int  balance(int startBalance, int totalCharges, int allCredits, int allowedCredit){

        if (startBalance - totalCharges - allCredits >= allowedCredit)
            return startBalance - totalCharges - allCredits;
        else
            return -1 ;


    }
}
