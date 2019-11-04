
public class Item
{
	//member variables
	private int itemId;
	private String itemName;
	private int quantityInStore;
	private double price;

	//constructor
	public Item(int itemId, String itemName, int quantityInStore, double price)
	{
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantityInStore = quantityInStore;
		this.price = price;
	}

	//accessors
	public int getItemId()
	{
		return itemId;
	}

	public String getItemName()
	{
		return itemName;
	}

	public int getQuantityInStore()
	{
		return quantityInStore;
	}

	public double getPrice()
	{
		return price;
	}
}
