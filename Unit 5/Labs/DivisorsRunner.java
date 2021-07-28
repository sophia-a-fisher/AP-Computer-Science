//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class DivisorsRunner
{
	public static void main( String args[] )
	{
		Divisors test = new Divisors();
		int[] cases = {10, 45, 14, 1024, 1245, 33, 65535};
		
		for( int val : cases )
		{
			String divisors = test.getDivisors(val);
			System.out.println(val + " has divisors " + divisors);
			System.out.println("");
		}
	}
}