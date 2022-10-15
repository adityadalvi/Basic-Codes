import java.util.Scanner;
public class Que32CompoundInterest {
	
	// amt=p*(1+r/n)^(n*t)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			Scanner sc=new Scanner(System.in))
		{
			double p=sc.nextDouble();
			double r=sc.nextDouble();
			double n=sc.nextDouble();
			double t=sc.nextDouble();
			double firstpart=1+r/n;
			double secpart=n*t;
			double amt=p*Math.pow(firstpart, secpart);
			System.out.println(amt);
		}

	}

}
