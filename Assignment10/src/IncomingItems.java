import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author zzhongh
 * @version 1.0
 * @date 20/11/2024 22:48:15
 */
public class IncomingItems {

    private String name;
    private int quantity;

    public IncomingItems() {
    }

    public IncomingItems(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void Serialize(FileWriter fw){
        try {
            fw.write(name);
            fw.write("\n");
            fw.write(Integer.toString(quantity));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static IncomingItems Deserialize(Scanner fileInput){
        String n = fileInput.nextLine();
        int q = Integer.parseInt(fileInput.nextLine());
        return new IncomingItems(n, q);


    }
}
