public class Order
{
	//member variables
	private Customer customer;
	private Item item;
	private int quantity;




	//constructor
	public Order(Customer customer, Item item, int quantity)
	{
		this.customer = customer;
		this.item = item;
		this.quantity = quantity;
	}

	//accessors
	public Customer getCustomer()
	{
		return customer;
	}

	public Item getItem()
	{
		return item;
	}

	public int getQuantity()
	{
		return quantity;
	}

	//mutators
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public void setItem(Item item)
	{
		this.item = item;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

		//method
	public double computePrice()
	{
		double orderPrice = quantity * item.getPrice();

		if(customer instanceof DiscountCustomer)
		{
			DiscountCustomer temp = (DiscountCustomer)customer;
			orderPrice -= orderPrice * temp.getDiscountRate();
		}

		return orderPrice;
	}

}