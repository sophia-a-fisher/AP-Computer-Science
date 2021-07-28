//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class JavaLoopLabRunner
{
	public static void main( String args[] )
	{
		int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222 };
		
		//uncomment the class you need to test 
		//as you need to test them
		
		//DigitAdder s = new DigitAdder();
		//DigitCounter s = new DigitCounter();
		//DigitMath s = new DigitMath();
		//CountEvens s = new CountEvens();
		CountOdds s = new CountOdds();
				
				
		for( int val : cases )
		{
			System.out.println( s.go( val ) );
		}
	}
}