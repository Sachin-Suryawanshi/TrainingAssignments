package day2Practice;

public class ConstructOvr {
	int a;
	String name;
	public ConstructOvr()
	{
		System.out.println("Inside default Constructor");
	}
	public ConstructOvr(int a)
	{
		this();
		this.a=a;
		System.out.println("Inside Single args");
	}
	public ConstructOvr(String name,int a)
	{
		this(a);
		this.name=name;
		System.out.println("Inside 2nd args");
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.a);
	}
	public static void main(String args[])
	{
		ConstructOvr co=new ConstructOvr("Sachin",100000);
		co.display();
		
		
	}

}
