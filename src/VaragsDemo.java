
public class VaragsDemo {
	public double add(double...a)
	{
		double sum=0;
		for(double x:a)
		{
			sum+=x;
		}
		return sum;
	}

}
