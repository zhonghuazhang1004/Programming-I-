/**
 * @author zzhongh
 * @version 1.0
 * @date 23/10/2024 22:27:25
 */
public class MotorisedFlyingVehicle extends FlyingVehicle{
    public MotorisedFlyingVehicle(String name, int value, int seats, int wings) {
        super(name, value, seats, wings);
    }
    int engineSize;

    public MotorisedFlyingVehicle(String name, int value, int seats, int wings, int engineSize) {
        super(name, value, seats, wings);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public void print(){
        System.out.println("MotorisedWheeledVehicle : name " + name + ", value $" + value + ", with " + seats + " " +
                "seats and " + wings + " wings and " + "engine size " + engineSize );
    }
}
