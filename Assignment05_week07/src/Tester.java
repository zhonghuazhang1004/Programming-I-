/**
 * @author zzhongh
 * @version 1.0
 * @date 23/10/2024 22:28:34
 */
public class Tester {
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[5];
        v[0] = new Vehicle("Rowboat", 500, 4);
        v[1] = new WheeledVehicle("Skateboard", 100, 0, 4);
        v[2] = new MotorisedWheeledVehicle("Car", 10000, 5, 4, 1200);
        v[3] = new FlyingVehicle("Balloon", 5000, 2, 0);
        v[4] = new MotorisedFlyingVehicle("Airplane", 500000, 20, 2, 6000);

        for (int i = 0; i < v.length; i++) {
            System.out.printf("Number %d is a ", i);
            v[i].print();

        }
    }
}
