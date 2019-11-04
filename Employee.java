public abstract class Employee
{
	//access variables
	private int empId;
	private String empName;
	private int contactInfo;

	//constructor
	public Employee(int empId, String empName, int contactInfo)
	{
		this.empId = empId;
		this.empName = empName;
		this.contactInfo = contactInfo;
	}

	//accessors
	public int getEmpId()
	{
		return empId;
	}

	public String getEmpName()
	{
		return empName;
	}

	public int getContactInfo()
	{
		return contactInfo;
	}

	//mutators
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public void setContactInfo(int contactInfo)
	{
		this.contactInfo = contactInfo;
	}

	//abstract method
	public abstract double calculatePay();

}