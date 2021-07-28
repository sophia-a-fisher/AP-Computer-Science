//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class Perfect
{
	private static int ranNum;
	private static int sum;
	public static boolean isPerfect( int number )
	{
		ranNum = 1;
		sum = 0;
		while(ranNum<number)
		{
			if(number%ranNum == 0)
			{
				sum += ranNum;
			}
			ranNum++;
		}
		
		if(sum == number)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}