
public class GradeCheck {
	public static void main(String args[])
	{
		int percentage=80;
		if(percentage>70)
		{
			System.out.println("First Class with Distinction");
		}
		else if(percentage>=60 && percentage<70)
		{
			System.out.println("First Class");
		}
		else if(percentage>=50 && percentage<60)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Pass");
		}
	}

}
