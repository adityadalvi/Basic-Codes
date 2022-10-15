
public class Que26DistanceBetweenTwoPoints {
	/*To find the distance between two points (x1,y1) and (x2,y2), all that you need to do is use the coordinates of these ordered 
	pairs and apply the formula pictured below.
	formula=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1=4;
		int x2=1;
		int y1=4;
		int y2=1;
		System.out.println("Enter x1 value:"+x1);
		System.out.println("Enter x1 value:"+x2);
		System.out.println("Enter x1 value:"+y1);
		System.out.println("Enter x1 value:"+y2);
		double dist=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println(dist);
		

	}

}
