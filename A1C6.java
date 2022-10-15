public class A1C6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find Compound Interest. (Variations)
		double p=1000;
		double r=0.05;
		double n=12;
		double t=1;
		
		//double CI=p*(1+(r/n))^(n*t);
		
		System.out.println(p*(Math.pow((1+(r/n)),(n*t))));
		
	
		
	}

}
