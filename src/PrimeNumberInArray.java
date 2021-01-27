
public class PrimeNumberInArray {
	public static void main(String args[])
	{
		int a[]= {5,6,7,9,10,11};
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int j;
			for(j=2;j<=num;j++)
			{
				if(num%j==0)
				{
					break;
				}
			}
			if(num==j)
			{
				System.out.println(num);
			}
		}
	}

}
