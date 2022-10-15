public class Que20TotalSurfaceAreaOfCylinder 
{

	public static void main(String[] args) 
	{
		int rad=10;
		int height=30;
		System.out.println((2*3.142*rad*height)+(3.142*rad*rad));
		new1(rad,height);
	}
	
	public static void new1(int rad, int height)
	{
		double surfaceArea=(2*3.142*rad*height)+(3.142*rad*rad);
		System.out.println(surfaceArea);
	}
	/*
	public static void new1(int rad, int height)
	{
		System.out.println((2*3.142*rad*height)+(3.142*rad*rad));
	}*/


}
