//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
		int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789};
		ReverseNumber test = new ReverseNumber();
		
		for( int val : cases )
		{
			int reverse = test.getReverse(val);
			System.out.println(val + " reversed is " + reverse);
			System.out.println("");
		}
	}
}