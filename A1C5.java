
public class A1C5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to convert days into years, weeks and days.{Hint:Input-373 daysOutput-1Year,1Weak,1day}(Variations)
		int num=400;
		int year=num/365;
		System.out.println("year:"+year);
		int temp=num%365;
		int mon=temp/30;
		System.out.println("Month:"+mon);
		int temp2=temp%30;
		int weeks=temp2/7;
		System.out.println("Weeks:"+weeks);
		int days=temp2%7;
		System.out.println("days:"+days);
		
	}

}
