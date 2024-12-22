/**
 * @author zzhongh
 * @version 1.0
 * @date 10/10/2024 00:13:34
 */
public class Citizen {

    String name;
    double earnings;

    public Citizen(String name, double earnings) {
        this.name = name;
        this.earnings = earnings;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
