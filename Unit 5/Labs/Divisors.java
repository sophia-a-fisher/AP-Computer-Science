//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class Divisors
{
	private static int ranNum;
	public static String getDivisors( int number )
	{
		String divisors = "";
		ranNum = 1;
		while(ranNum<number)
		{
			if(number%ranNum == 0)
			{
				divisors += " " + ranNum;
			}
			ranNum++;
		}
		return divisors; 
	}
}