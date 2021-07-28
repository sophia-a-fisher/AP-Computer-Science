//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019

public class RaySmallest
{
	public static int go(int[] ray)
	{
      int smallest = 0;
      for(int value = 0; value<ray.length; value++)
      {
         if(value == 0)
         {
            smallest = ray[value];
         }
         
         else if (ray[value] < smallest)
         {
            smallest = ray[value];
         }      
      }
		return smallest;
	}
}