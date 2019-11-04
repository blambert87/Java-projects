public class PartTimeEmployee extends Employee
{
	private double hoursWorked;
	private double payRate;

	public PartTimeEmployee(int empId, String empName, int contactInfo, double hoursWorked, double payRate)
	{
		super(empId, empName, contactInfo);
		this.hoursWorked = hoursWorked;
		this.payRate = payRate;
	}

	public double getHoursWorked()
	{
		return hoursWorked;
	}

	public double getPayRate()
	{
		return payRate;
	}

	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}

	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}

	public double calculatePay()
	{
		double pay;

		if(hoursWorked > 40)
			pay = (payRate * 40) + (payRate * 1.5 * (hoursWorked - 40));
		else
			pay = hoursWorked * payRate;

		return pay;
	}

}
