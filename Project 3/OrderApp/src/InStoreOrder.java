public class InStoreOrder extends Order
{
	//member variables
	private String storeLocation;

	//constructor
	public InStoreOrder(Customer customer, Item item, int quantity, String storeLocation)
	{
		super(customer, item, quantity);
		this.storeLocation = storeLocation;
	}

	//accessor
	public String getStoreLocation()
	{
		return storeLocation;
	}

	//mutator
	public void setStoreLocation(String storeLocation)
	{
		this.storeLocation = storeLocation;
	}
}