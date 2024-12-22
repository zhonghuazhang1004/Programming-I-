

import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 25/10/2024 23:56:06
 */
public class Tester {
    public static void main(String[] args) {
        System.out.println("---First we will see how many rolls it takes to get each possible value..---");
        System.out.println("Target      Rolls Needed");
        DiceRolls diceRolls = new DiceRolls();


        for (int target = 2; target <= 12; target++) {

            int attempts = diceRolls.RollsOfPairsToGet(target);

            System.out.println(target + "           " + attempts);
        }
        System.out.println("---Now we'll see how many rolls on average it took to get each value 10000 times...--- ");
        System.out.println("Target      Average Rolls Needed");
        int trials = 10000;

        for (int target = 2; target <= 12; target++) {

            long totalRolls = 0;
            for (int i = 0; i < trials; i++) {
                totalRolls += diceRolls.RollsOfPairsToGet(target);
            }
            double averageRolls = (double) totalRolls / trials;
            System.out.println(target + "           " + averageRolls);

        }

    }
}
