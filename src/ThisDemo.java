
public class ThisDemo {
	int id;
	String name;
	double salary;
	public ThisDemo()
	{
		
	}
	public ThisDemo(int id)
	{
		this.id=id;
	}
	public ThisDemo(int id,String name,double salary)
	{
		this(id);
		this.name=name;
		this.salary=salary;
		
	}

}
