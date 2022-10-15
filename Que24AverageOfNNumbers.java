import java.util.Scanner;
public class Que24AverageOfNNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		double avg=0;
		for (int i=0; i<=n; i++) {
			sum=sum+i;
		}
		avg=sum/n;
		System.out.println("Total:"+sum+"\n"+"Average:"+avg);
		
	}

}
