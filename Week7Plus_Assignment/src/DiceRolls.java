import java.util.Random;

/**
 * @author zzhongh
 * @version 1.0
 * @date 25/10/2024 23:56:34
 */
public class DiceRolls {
    Random random = new Random();

    public int RollPair() {
        int roll1 = random.nextInt(1, 7);
        int roll2 = random.nextInt(1, 7);

        return roll1 + roll2;
    }
    public int RollsOfPairsToGet(int target) {
        int counter = 0;
        int result;

        do {
            result = RollPair();
            counter += 1;
        }

        while (result != target);

        return counter;
    }
}
