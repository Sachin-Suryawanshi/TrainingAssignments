
public class Factorial {
	public static void main(String args[])
	{
		double num=50;
		double fact=1;
		while(num>0)
		{
			fact*=num;
			num--;
		}
		System.out.println(fact);
	}

}
