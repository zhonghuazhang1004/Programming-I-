import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 20/09/2024 00:29:23
 */
public class Question5 {
    public static void main(String[] args) {
        /**
         * number of stones used to build it---2.3 million large blocks
         * the average weight of each stone---weighing 6 million tonnes in total.On average, most blocks weigh around 2.5 tons
         * the number of years it took to build---Built 2600 BC,[3] over a period of about 27 years
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Estimated number of stones used: ");// 2,300,000
        int stone = scanner.nextInt();
        // allow user to enter the amount of stones used , should be 2300000

        System.out.println("Please enter the average weight of each stone: ");// 2.5 tons
        double averWeight = scanner.nextDouble();
        // allow user to enter  average weight of each stone, should be 2.5

        System.out.println("Please enter number of years it took to build: ");//27
        int year = scanner.nextInt();
        // allow user to enter built years

        double totalWeight = stone * averWeight;

        // Calculate estimates

        double weightByYear = totalWeight / year;
        System.out.println("Great Pyramid of Giza built " + weightByYear + " tons every year");

        double weightByDay = totalWeight / (year * 365);
        System.out.println("Great Pyramid of Giza built " + weightByDay + " tons every day");

        double weightByHour = totalWeight / (year * 365 * 24);
        System.out.println("Great Pyramid of Giza built " + weightByHour + " tons every hour");

        double weightByMin = totalWeight / (year * 365 * 24 * 60);
        System.out.println("Great Pyramid of Giza built " + weightByMin + " tons every minute");
    }
}
