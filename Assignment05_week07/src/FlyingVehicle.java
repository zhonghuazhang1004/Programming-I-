/**
 * @author zzhongh
 * @version 1.0
 * @date 23/10/2024 22:26:38
 */
public class FlyingVehicle extends Vehicle{
    public FlyingVehicle(String name, int value, int seats) {
        super(name, value, seats);

    }
    int wings;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public FlyingVehicle(String name, int value, int seats, int wings) {
        super(name, value, seats);
        this.wings = wings;
    }
    @Override
    public void print(){
        System.out.println("FlyingVehicle : name " + name + ", value $" +
                value + ", with " + seats + " seats and " + wings + " wings");
    }
}
