import java.util.Scanner;
public class Que33CalculateAvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			Scanner sc=new Scanner(System.in);)
		{
			double sub1=sc.nextDouble();
			double sub2=sc.nextDouble();
			double sub3=sc.nextDouble();
			double avg=(sub1+sub2+sub3)/3;
			System.out.println(avg);
			
		}

	}

}
