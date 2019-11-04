public abstract class Animal
{
	//member variables
	private String size;
	private int age;
	private String name;

	//accessors
	public String getSize()
	{
		return size;
	}

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	//mutators
	public void setSize(String size)
	{
		this.size = size;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	//abstract methods
	public abstract void speak();
	public abstract void eat();
	public abstract void move();

}