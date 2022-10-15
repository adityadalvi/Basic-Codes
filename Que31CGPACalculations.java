import java.util.Scanner;
public class Que31CGPACalculations 
{
	// Write this program with number of subjects is unknown(user input)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			Scanner sc=new Scanner(System.in))
		{
			double sub1=sc.nextInt();
			double sub2=sc.nextInt();
			double sub3=sc.nextInt();
			double sub4=sc.nextInt();
			double sub5=sc.nextInt();
			
			double total=(sub1+sub2+sub3+sub4+sub5)/5;
			double CGPA=total/10;
			System.out.println("CGPA:"+CGPA);
			double per=CGPA*9.5;
			System.out.println("Percentage from CGPA:"+per);
		}

	}

}
