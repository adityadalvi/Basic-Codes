public class Que1AreaOfCircle
{
	public static void main(String[] args)
	{
		int rad=100;
		double pi=3.142;
		System.out.println("Area of Circle: "+"\n"+(pi*rad*rad)+" cm*cm");
		myCode(rad,pi);
		
	}
	
	//Type 2
	public static void myCode(int rad, double pi)
	{
		double area=pi*rad*rad;
		System.out.println("Area of circle:"+area+" cm*cm");
	}
	
	//Type3
	/*private static void myCode(int rad, double pi)
	{
		System.out.println("Area of Circle: "+"\n"+(pi*rad*rad)+" cm*cm");
	}*/
}