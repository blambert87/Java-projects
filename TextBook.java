public class TextBook implements Publication
{
	private int NumberOfPages;

	public TextBook(int NumberOfPages)
	{
		this.NumberOfPages = NumberOfPages;
	}

	public int getNumberOfPages()
	{
		return NumberOfPages;
	}

	public void setNumberOfPages(int NumberOfPages)
	{
		this.NumberOfPages = NumberOfPages;
	}


	public boolean isPeriodical()
	{
		return false;

	}

	public boolean isBook()
	{
		return true;

	}
}