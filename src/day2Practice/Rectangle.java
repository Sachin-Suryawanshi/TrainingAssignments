package day2Practice;

public class Rectangle {
	int length;
	int breadth;
	public Rectangle()
	{
		this.length=20;
		this.breadth=30;
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double area()
	{
		return breadth*length;
	}
	public double permeter()
	{
		return breadth+length;
	}

}
