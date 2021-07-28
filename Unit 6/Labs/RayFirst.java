//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019

public class RayFirst
{
	public static boolean go(int[] ray)
	{
      int total = 0;
		for(int value = 1; value<ray.length; value++)
      {
         if (ray[value] == ray[0])
         {
            return true;
         }
      }
      return false;
	}
}