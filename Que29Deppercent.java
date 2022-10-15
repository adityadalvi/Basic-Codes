
public class Que29Deppercent {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		long amt=100000;
		long n=3;
		long deppercent=10;
		long temp=amt;
		for (int i = 0; i <n; i++) 
		{
			temp=(100-10)*temp/100;
		}
		System.out.println(temp);
	}

}
