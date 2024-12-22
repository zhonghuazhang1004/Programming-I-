/**
 * @author zzhongh
 * @version 1.0
 * @date 23/10/2024 22:13:22
 */
public class Vehicle {
    String name;
    int value;
    int seats;

    public Vehicle(String name, int value, int seats) {
        this.name = name;
        this.value = value;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void print() {
        System.out.println(
                "Vehicle : name " + name + ", value $" + value + ", with " + seats + " seats");
    }
}
