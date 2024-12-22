/**
 * @author zzhongh
 * @version 1.0
 * @date 23/10/2024 22:23:07
 */
public class WheeledVehicle extends Vehicle {


    public WheeledVehicle(String name, int value, int seats) {
        super(name, value, seats);
    }

    int wheels;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public WheeledVehicle(String name, int value, int seats, int wheels) {
        super(name, value, seats);
        this.wheels = wheels;
    }

    @Override
    public void print(){
        System.out.println("WheeledVehicle : name " + name + ", value $" +
                value + ", with " + seats + " seats and " + wheels + " wheels");
    }
}
