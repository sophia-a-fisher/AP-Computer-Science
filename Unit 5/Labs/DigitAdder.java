//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class DigitAdder
{
	private static int sum;
	private static int index;
	public static int go( int num )
	{
		sum = 0;
		while(num > 0)
		{
			index = num%10;
			sum += index;
			num /= 10;
		}
		return sum;
	}
}