//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class PerfectRunner
{
	public static void main( String args[] )
	{
		int[] cases = {496, 45, 6, 14, 8128, 1245, 33, 28, 27, 33550336};
		Perfect test = new Perfect();
		
		for( int val : cases )
		{
			boolean perfect = test.isPerfect(val);
			if(perfect)
			{
				System.out.println(val + " is perfect.");
				System.out.println("");
			}
			else
			{
				System.out.println(val + " is not perfect.");
				System.out.println("");
			}
			
		}
	}
}