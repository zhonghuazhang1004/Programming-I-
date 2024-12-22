import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 09/10/2024 23:35:27
 */
public class question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = scanner.nextInt();
        System.out.println("enter y: ");
        int y = scanner.nextInt();

        if (x < 10){
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        }
        System.out.println("$$$$$");

        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        }
        else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }


    }

}
