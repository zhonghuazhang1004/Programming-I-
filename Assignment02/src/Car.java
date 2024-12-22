import java.security.PublicKey;

/**
 * @author zzhongh
 * @version 1.0
 * @date 06/10/2024 00:52:07
 */
public class Car {
    String model;
    int year;
    double price;


    public void discount(double discount){

        price = price * (1 - discount/100);

    }

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0.0) {
            this.price = price;
        } else {
            System.out.println("Car:" + this.model + "---invalid car price");
        }

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
