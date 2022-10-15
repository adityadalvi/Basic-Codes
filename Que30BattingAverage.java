import java.util.Scanner;
public class Que30BattingAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
		Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Total Runs:");
			double total_runs=sc.nextInt();
			System.out.println("Enter Total Innings:");
			int innings=sc.nextInt();
			System.out.println("How many times player remain not out:");
			int not_out=sc.nextInt();
			double avg=total_runs/(innings-not_out);
			System.out.println(avg);
		}

	}

}
