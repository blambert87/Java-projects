public class OnlineOrder extends Order
{
	//constructor
	public OnlineOrder(Customer customer, Item item, int quantity)
	{
		super(customer, item, quantity);

	}

	//method
	public double computePrice()
	{
		return super.computePrice() + 4;
	}

}