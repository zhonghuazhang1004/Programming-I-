/**
 * @author zzhongh
 * @version 1.0
 * @date 19/09/2024 23:42:04
 */
public class Question3 {
    public static void main(String[] args) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 8; i++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int i = 0; i < 8; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
