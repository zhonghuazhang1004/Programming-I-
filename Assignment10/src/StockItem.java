import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StockItem {
	private String name;
	private int stockLevel;
	private float costPrice, salePrice;

	public float getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StockItem(String name, int initialStockLevel, float costPrice, float salePrice) {
		this.name = name;
		this.stockLevel = initialStockLevel;
		this.costPrice = costPrice;
		this.salePrice = salePrice;
	}
	
	public void Serialize(FileWriter fw) {
		try {
			fw.write(name);
			fw.write("\n");
			fw.write( Integer.toString(stockLevel) );
			fw.write("\n");
			fw.write( Float.toString(costPrice) );
			fw.write("\n");
			fw.write( Float.toString(salePrice) );
			fw.write("\n");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static StockItem Deserialize(Scanner fileInput) {
		String n = fileInput.nextLine();
		int stock = Integer.parseInt( fileInput.nextLine() );
		float cost = Float.parseFloat( fileInput.nextLine() );
		float sale = Float.parseFloat( fileInput.nextLine() );
		
		return new StockItem(n, stock, cost, sale);
	}
	
	public void ChangeStockLevel(int change) {
		stockLevel += change;
	}
	
	public void Print(int idx) {
		System.out.printf("\n%d> Name: %25s, Stock: %4d, Cost: %5.2f, Sale: %5.2f", 
				idx, name, stockLevel, costPrice, salePrice); 
	}

}
