//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019

public class RayTotal
{
	public static int go(int[] ray)
	{
      int total = 0;
		for(int value:ray)
      {
         total = total + value;
      }
      return total;
	}
}