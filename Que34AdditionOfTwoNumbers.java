import java.util.Scanner;
public class Que34AdditionOfTwoNumbers 
{
	public static void main(String[] args)
	{
		try(
		Scanner sc=new Scanner(System.in)){
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		myCode(num1, num2);
		}
	}
	public static void myCode(int num1, int num2) {
		int num3=num1+num2;
		System.out.println("Addition of two numbers:"+num3);
	}
}

	
