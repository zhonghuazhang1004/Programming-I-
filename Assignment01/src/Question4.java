import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 20/09/2024 00:04:52
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first integer: ");
        int number1 = scanner.nextInt();
        int number3 = number1 * 3;

        System.out.println("please enter second integer: ");
        int number2 = scanner.nextInt();
        int number4 = number2 * 2;

        int multiple =  number3/number4;

        if (number3 % number4 == 0){
            System.out.println("first number tripled is a multiple of the second number doubled---" + " multiple:"+ multiple);
        }
        else {
            System.out.println(" ---NO--- ");
        }

    }
}
