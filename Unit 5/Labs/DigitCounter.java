//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class DigitCounter
{
	private static int counter = 0;
    public static int go( int number )
	{
    	counter = 0;
		while(number > 0)
		{
			counter++;
			number /= 10;
		}
		
		return counter;
	}
}