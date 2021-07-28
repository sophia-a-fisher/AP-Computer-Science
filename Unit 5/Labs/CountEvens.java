//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class CountEvens
{
	private static int sum;
	private static int index;
    public static int go( int number )
	{
	   sum = 0;
	   while(number>0)
	   {
		   index = number%10;
		   if(index%2 == 0)
		   {
			   sum++;
		   }
		   number /= 10;
	
	   }
	   return sum;
	}
}