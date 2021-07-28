//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class DigitMath
{
	private static int counter;
	private static int sum;
	private static int index;
   public static int countDigits( int number )
	{
	   counter = 0;
		while(number > 0)
		{
			counter++;
			number /= 10;
		}
		return counter;
	}

   public static int sumDigits( int number )
	{
	   sum = 0;
		while(number > 0)
		{
			index = number%10;
			sum += index;
			number /= 10;
		}
		return sum;
	}

	//method go must call countDigits and sumDigits
	//to receive full credit
	public static double go( int number )
	{
		return (double)sumDigits(number)/countDigits(number);
	}
}