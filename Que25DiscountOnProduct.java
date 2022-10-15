import java.util.Scanner;
public class Que25DiscountOnProduct 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter price:");
		Scanner sc=new Scanner(System.in);
		double price=sc.nextDouble();
		double discount=sc.nextDouble();
		double amt=price-price*(discount/100);
		System.out.println("Final amt after discount:"+amt);

	}

}
