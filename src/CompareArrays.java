
public class CompareArrays {
	public static void main(String args[])
	{
		int a[]= {3,2,3};
		int b[]= {3,3,2};
		int count=0;
		for(int c:a)
		{
			for(int d:b)
			{
				if(c==d)
				{
					count++;
					break;
				}
			}
		}
		if(count==a.length && count==b.length)
		{
			System.out.println("Arrays are same");
		}
		else
		{
			System.out.println("Not same");
		}
	}

}
