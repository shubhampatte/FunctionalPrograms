public class Quadratic
{
	public static void main(String args[])
	{

		int a = Integer.parseInt(args[0]);
		System.out.println("Value of a is :" +a);
		
		int b = Integer.parseInt(args[1]);
		System.out.println("Value of b is :" +b);
		
		int c = Integer.parseInt(args[2]);
		System.out.println("Value of c is :" +c);
		
		double delta;
		
		delta = (double) Math.pow(b, 2)-4*a*c;
	
		double root1 = (double)(-b + Math.sqrt(delta))/(2*a);
		double root2 = (double)(-b - Math.sqrt(delta))/(2*a);
		
		System.out.println(" Delta is : " +delta);
		
		System.out.println("The equation of first root is  : " +root1);
		System.out.println("The equation of second root is : " +root2);
		
	}

}
