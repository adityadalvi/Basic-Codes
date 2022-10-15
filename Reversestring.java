import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String rem="";
		int len=name.length();
		for(int i=len-1;i>=0;i--)
		{
			rem=rem+name.charAt(i);
		}
		System.out.println(rem);
		

	}

}
