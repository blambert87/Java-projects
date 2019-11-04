public class TestCheckup
{
	public static void main(String[] args)
	{
		Checkup patient1 = new Checkup(1,110,78,100,40);
		Checkup patient2 = new Checkup(2,105,75,160,40);

		System.out.println("patient one's Cholesterol ratio: " + patient1.computeRatio());
		patient1.explainRatio();

		System.out.println("patient two's Cholesterol ratio: " + patient2.computeRatio());
		patient2.explainRatio();
	}
}