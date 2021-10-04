public class WindChill
{
	public static void main(String args[])
	{

		double t = Double.parseDouble(args[0]);
		System.out.println("Temperature value is : " +t);
		double v = Double.parseDouble(args[1]);
		System.out.println("Wind speed value is : " +v);
		
		if (t<50 && 3<v && v<120) 
		{
			double windchill=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("windchill : " +windchill);
		}
		else
		{	
			System.out.println("invalid value for t or v");
		}	

	}

}
