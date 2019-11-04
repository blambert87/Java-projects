public class FullTimeEmployee extends Employee
{
	private double basePay;

	public FullTimeEmployee(int empId, String empName, int contactInfo, double basePay)
	{
		super(empId, empName, contactInfo);
		this.basePay = basePay;
	}

	public double getBasePay()
	{
		return basePay;
	}

	public void setBasePay(double basePay)
	{
		this.basePay = basePay;
	}

	public double calculatePay()
	{
		return basePay;
	}

}