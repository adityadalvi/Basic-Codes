import java.util.Scanner;
public class Que22Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int total=1;
		for (int i =1; i <=num1; i++) 
		{
			total=total*i;
			
		}
		System.out.println(total);
	}

}
