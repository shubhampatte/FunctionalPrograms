public class EuclideanDistance
{
	public static void main(String args[])
	{

		int x = Integer.parseInt(args[0]);
		System.out.println("Value of x is :" +x);
		
		int y = Integer.parseInt(args[1]);
		System.out.println("Value of y is :" +y);
		
		float Edistance;		
		
		Edistance = (float) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	
		System.out.println("EuclideanDistance is : " +Edistance);
		  	
	}

}
