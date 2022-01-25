package mytests;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int n=123,rem=0,sum=0;
		int t=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
