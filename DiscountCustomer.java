public class DiscountCustomer extends Customer
{
	//member variables
	private double discountRate;

	//constructor
	public DiscountCustomer(String custName, int custID, double discountRate)
	{
		super(custName, custID);
		this.discountRate = discountRate;
	}

	//accessors
	public double getDiscountRate()
	{
		return discountRate;
	}

	//mutator
	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
}