import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 09/10/2024 23:57:49
 */
public class question03 {
    public static void main(String[] args) {

//        Mosis Abhenry, earning 150,000 Euros,
//        Marium Essa, earning 70,000 Euros,
//        Abrahim Rai, earning 30,000 Euros

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter citizen-1 name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter citizen-1 earning:");
        int earning1 = scanner.nextInt();
        scanner.nextLine();
//        get citizen1's information: name & earning


        System.out.println("Enter citizen-2 name:");
        String name2 = scanner.nextLine();
        System.out.println("Enter citizen-2 earning:");
        int earning2 = scanner.nextInt();
        scanner.nextLine();
//        get citizen2's information: name & earning



        System.out.println("Enter citizen-3 name:");
        String name3 = scanner.nextLine();
        System.out.println("Enter citizen-3 earning:");
        int earning3 = scanner.nextInt();
        scanner.nextLine();
//        get citizen3's information: name & earning

        Citizen citizen1 = new Citizen(name1, earning1);
        Citizen citizen2 = new Citizen(name2, earning2);
        Citizen citizen3 = new Citizen(name3, earning3);
//        create 3 account instances

        double tax1 = taxCalculation(citizen1.getEarnings());
        double tax2 = taxCalculation(citizen2.getEarnings());
        double tax3 = taxCalculation(citizen3.getEarnings());


        System.out.printf(" Name: %s Earning: %s Tax:%s%n ",
                citizen1.getName(), citizen1.getEarnings(), tax1);
        System.out.printf("Name: %s Earning: %s Tax:%s%n ",
                citizen2.getName(), citizen2.getEarnings(), tax2);
        System.out.printf("Name: %s Earning: %s Tax:%s%n",
                citizen3.getName(), citizen3.getEarnings(), tax3);
    }

    public static double taxCalculation(double earnings) {

        if (earnings < 30000){
            return earnings * 0.15;
        }
        else {
            return (30000 * 0.15) + ((earnings - 30000) * 0.2);
        }

//        earnings < 30000 ?
//        return earnings * 0.15;
//        return (earnings * 0.15) + ((earnings - 30000) * 0.2);
    }
}
