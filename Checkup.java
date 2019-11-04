public class Checkup
{
	private int patientNum = 0;
	private int systolic = 0;
	private int diastolic = 0;
	private int LDL = 0;
	private int HDL = 0;

//constructor
	public Checkup(int patientNum, int systolic, int diastolic, int LDL, int HDL)
	{
		this.patientNum = patientNum;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.LDL = LDL;
		this.HDL = HDL;
	}

	public double computeRatio()
	{
		return LDL / HDL;

	}
	//accessors
	public int getPatientNum()
	{
		return patientNum;
	}

	public int getSystolic()
	{
		return systolic;
	}

	public int getDiastolic()
	{
		return diastolic;
	}

	public int getLDL()
	{
		return LDL;
	}

	public int getHDL()
	{
		return HDL;
	}

	public void explainRatio()
	{
		System.out.println("HDL is good cholesterol. A ratio of 3.5 or lower is good");
	}
}