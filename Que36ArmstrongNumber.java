import java.util.Scanner;
public class Que36ArmstrongNumber {
	
	
	// solve this program without hardcoded num1 value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		myCode(num);
	}
	public static void myCode(int num) 
	{
		int count=0;
		double ori=num;
		int num1=num;
		while(num!=0) {
			num=num/10;
			count++;
		}
		double sum=0;
		for (int i = 0; i <count; i++) 
		{
			double rem=num1%10;
			sum=sum+Math.pow(rem,count);
			num1=num1/10;
		}
		
		int sum1=(int) sum;
		System.out.println(sum1);
		
	}

}
