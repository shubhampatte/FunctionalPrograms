public class SumOfInteger
{
	public static void main(String args[])
	{

		int array[] = { 2 , 3 , 5 , 8 , -3 , -5 , -13 , -10 };
		//System.out.println("Numbers are :" +number);
		
			int add = 0;
		 
			for (int i=0; i<array.length-2; i++)
			{
				for (int j=i+1; j<array.length-1; j++ )
				{
					for (int k=j+1; k<array.length; k++)
					{
						if (array[i] + array[j] + array[k] == 0)
						{
							
							System.out.println("yes !! Triplets found : " +array[i]+ " " +array[j]+ " " +array[k]);
							++add;
						}
					}
				}
			}
				
				System.out.println("Number of Triplets are : " +add);
			
	}

}
