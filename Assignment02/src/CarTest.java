/**
 * @author zzhongh
 * @version 1.0
 * @date 06/10/2024 01:00:58
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car ("ToyotaCamry", 2020, 30000);
        Car car2 = new Car("HondaCivic", 2019, 25000);
        displayCarInfo(car1);
        displayCarInfo(car2);

        System.out.println("Applying discounts...");

        car1.discount(5);
        System.out.printf("Car1 - New Price: $%.2f%n", car1.getPrice());

        car2.discount(7);
        System.out.printf("Car2 - New Price: $%.2f%n", car2.getPrice());
    }

    public static void displayCarInfo(Car displayCar){
        System.out.printf("Model:%s Year:%s Price:$%.2f%n",
                displayCar.getModel(),displayCar.getYear(),displayCar.getPrice());
    }
}
