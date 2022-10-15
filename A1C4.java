
public class A1C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to swap two variables (with and without third variable)
		/*int num1=10;
		int num2=20;
		System.out.println("Before Swap:"+num1+"  "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swap:"+num1+"  "+num2);
		*/
		
		int num1=10;
		int num2=20;
		System.out.println("Before Swap:"+num1+"  "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swap :"+num1+"  "+num2);
		 
		

	}

}
