import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StockMain {
    private static String filename = "stock.txt";
    private static String incomingItems = "shipment.txt";
    private static ArrayList<StockItem> stockItems = new ArrayList<StockItem>();

    public static void main(String[] args) {
        System.out.printf("*** STOCK MANAGEMENT PROGRAM ***");
        Scanner input = new Scanner(System.in);

        if (ReadFile()) {
            System.out.printf("\nRead %d stock items from file %s.", stockItems.size(), filename);

            int choice = 0;
            while (choice != 10) {
                System.out.printf("\n\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
                        "1) List Stock Items",
                        "2) Add Stock",
                        "3) Remove Stock",
                        "4) Save File",
                        "5) Add New Stock Item",
                        "6) Delete a Stock Item",
                        "7) List Low Stock Items",
                        "8) Record Incoming Stock Shipment",
                        "9) Calculate Cost of All Stock",
                        "10) Exit");


                System.out.printf("\nCommand > ");

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        ListStockItems();
                        break;

                    case 2:
                        AddStock();
                        break;

                    case 3:
                        RemoveStock();
                        break;

                    case 4:
                        WriteFile();
                        break;
                    case 5:
                        AddNewStockItem();
                        break;
                    case 6:
                        DeleteStockItem();
                        break;

                    case 7:
                        ListLowStockItems();

                        break;
                    case 8:
                        RecordIncomingStockShipment();
                        break;
                    case 9:
                        CalculateCostofAllStock();
                        break;
                }
            }
        }

        System.out.printf("\nProgram ended.");
    }

    private static void ListStockItems() {
        for (int i = 0; i < stockItems.size(); i++) {
            stockItems.get(i).Print(i);
        }
    }

    private static void AddStock() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nItem number? (0-%d) > ", stockItems.size() - 1);
        int idx = input.nextInt();

        if (idx >= 0 && idx < stockItems.size()) {
            System.out.printf("\nAdd how much? > ");
            int num = input.nextInt();
            stockItems.get(idx).ChangeStockLevel(num);
        }
    }

    private static void RemoveStock() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nItem number? (0-%d) > ", stockItems.size() - 1);
        int idx = input.nextInt();

        if (idx >= 0 && idx < stockItems.size()) {
            System.out.printf("\nRemove how much? > ");
            int num = input.nextInt();
            stockItems.get(idx).ChangeStockLevel(-num);
        }
    }

    private static boolean ReadFile() {
        try (Scanner input = new Scanner(Paths.get(filename))) {
            int numStockItems = Integer.parseInt(input.nextLine());
            for (int i = 0; i < numStockItems; i++) {
                StockItem si = StockItem.Deserialize(input);
                stockItems.add(si);
            }
            input.close();
        } catch (IOException e) {
            System.out.printf("\nCannot load file %s\n", filename);
            return false;
        }

        return true;
    }

    private static void WriteFile() {
        File f = new File(filename);
        if (f.exists())
            f.delete(); // delete it so that we can re-write it

        try {
            if (f.createNewFile()) {
                FileWriter fw = new FileWriter(f);

                // write how many stock items we have
                fw.write(Integer.toString(stockItems.size()));
                fw.write("\n");

                // then serialize each stock item
                for (int i = 0; i < stockItems.size(); i++)
                    stockItems.get(i).Serialize(fw);

                fw.close();
                System.out.printf("\n*** FILE SAVED ***");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void AddNewStockItem() {
        Scanner input = new Scanner(System.in);
        System.out.printf(" Name of New Stock Item > ");
        String name = input.nextLine();

        System.out.print(" Cost Price > ");
        float costPrice = input.nextFloat();
        System.out.printf(" Sale Price > ");
        float salePrice = input.nextFloat();
        StockItem newItem = new StockItem(name, 0, costPrice, salePrice);
        stockItems.add(newItem);
        //print out new item information
        System.out.println( name + " added to StockItems. We now have " + stockItems.size() + " items.");

    }

    private static void DeleteStockItem() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nDelete which Stock Item number? (0-%d) > ", stockItems.size() - 1);
        int idx = input.nextInt();

        System.out.println("The " + stockItems.get(idx).getName() + " has been deleted.");
        if (idx >= 0 && idx < stockItems.size()) {
            stockItems.remove(idx);
        }
        System.out.println("We now have " + stockItems.size() + " items.");
    }

    private static void ListLowStockItems() {
        System.out.printf("We have less than 5 of the following items:");
        for (int i = 0; i < stockItems.size(); i++) {
            int stockLevel = stockItems.get(i).getStockLevel();
            if (stockLevel <= 5) {
                stockItems.get(i).Print(i);
            }
        }
    }

    private static boolean RecordIncomingStockShipment() {
        int recordItemQty = 0;
        try (Scanner input = new Scanner(Paths.get(incomingItems))) {

            while (input.hasNext()) {
                //read name and quantity from file: incomingItems
                String itemName = input.nextLine();
                int itemQuantity = Integer.parseInt(input.nextLine());


                // Find the stock item with the given name
                boolean found = false;
                for (int i = 0; i < stockItems.size(); i++) {
                    if (stockItems.get(i).getName().equals(itemName)) {
                        // Update the stock level of the found item
                        stockItems.get(i).ChangeStockLevel(itemQuantity);
                        recordItemQty++;
                        found = true;
                        break;
                    }
                    //print warning if item not found, just print one time
                    if (i == stockItems.size() - 1) {
                        System.out.println("ERROR! No StockItem found with the name:" + itemName);
                    }
                }
            }
            System.out.println("Recorded " + recordItemQty + " items in shipment file");
            input.close();
        } catch (IOException e) {
            System.out.printf("\nCannot load file %s\n", incomingItems);
            return false;
        }

        return true;


    }

    private static void CalculateCostofAllStock() {
        float totalCost = 0;
        int totalStock = 0;
        for (int i = 0; i < stockItems.size(); i++) {
            totalCost += stockItems.get(i).getStockLevel() * stockItems.get(i).getCostPrice();
            totalStock += stockItems.get(i).getStockLevel();
        }
        //Our total stock is 57 and total cost is 436.00.
        System.out.printf("Our total stock is %d and total cost is %.2f.", totalStock, totalCost);
    }
}


