public class Customer
{
	//member variables
	private String custName;
	private int custID;

	//constructor
	public Customer(String custName, int custID)
	{
		this.custName = custName;
		this.custID = custID;
	}

	//accessors
	public String getCustName()
	{
		return custName;
	}

	public int getCustID()
	{
		return custID;
	}
	//mutators
	public void setCustName(String custName)
	{
		this.custName = custName;
	}

	public void setCustID(int custID)
	{
		this.custID = custID;
	}

}