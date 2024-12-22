/**
 * @author zzhongh
 * @version 1.0
 * @date 23/10/2024 22:24:40
 */
public class MotorisedWheeledVehicle extends WheeledVehicle{
    public MotorisedWheeledVehicle(String name, int value, int seats, int wheels) {
        super(name, value, seats, wheels);
    }

    int engineSize;

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public MotorisedWheeledVehicle(String name, int value, int seats, int wheels, int engineSize) {
        super(name, value, seats, wheels);
        this.engineSize = engineSize;
    }
    @Override
    public void print(){
        System.out.println("MotorisedWheeledVehicle : name " + name + ", value $" + value + ", with " + seats + " " +
                "seats and " + wheels + " wheels and " + "engine size " + engineSize );
    }
}
