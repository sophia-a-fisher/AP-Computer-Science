//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class BigOrSmall
{
	public static String check( int a, int b )
	{
		if(a>b && a%2 ==1)
		{
			return "yes";
		}
		
		else if(b>a && b%2 ==1)
		{
			return "no";
		}
		
		else if (a == b && (a%2 == 0 && b%2 ==0))
		{
			return "aplus";
		}
		
		return "compsci";
	}
}