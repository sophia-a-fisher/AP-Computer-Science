//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class LeapYear2
{
	public static boolean isLeapYear( int year )
	{
		if (year%400 == 0 || (year%100 != 0 && year%4 == 0))
		{
			return true;
		}
		return false;
	}
}