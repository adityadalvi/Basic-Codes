import java.util.Scanner;
public class Que23PayElectricityBills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// if units=0-100(1.2/unit)   units=101-200(2/unit) units=201-300(3/units)
		System.out.println("Enter No. Of Units:");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int unit=scan.nextInt();
		myCode1(unit);
		
	}
	public static void myCode1(int unit) {
		double bill=0;
		if (unit>=0 && unit<=100) 
		{
			bill=1*unit;
			System.out.println(bill);
		}
		else if(unit>=101 && unit<=200) 
		{
			bill=(100*1)+(unit-100)*2;
			System.out.println(bill);
		}
		else {
			bill=(100*1)+(100*2)+(unit-200)*3;
			System.out.println(bill);
		}
		
	}

}
