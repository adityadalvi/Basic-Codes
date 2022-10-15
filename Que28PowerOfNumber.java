import java.util.Scanner;
public class Que28PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
		Scanner sc=new Scanner(System.in)) 
		{
			System.out.print("Enter number:");
			int num=sc.nextInt();
			System.out.print("Enter power");
			int power=sc.nextInt();
			System.out.println(Math.pow(num, power));
		}

	}

}
