import java.util.Scanner;
public class Que27CommisionPercentage 
{

	public static void main(String[] args)
	{
		try (	
		Scanner sc = new Scanner(System.in)){
			System.out.println("Enter value of total sale:");
			double sale=sc.nextDouble();
			System.out.println("Enter commision percentage:");
			double per=sc.nextDouble();
			double commision=sale*(per/100);
			System.out.println(commision);
		}
		

	}

}
