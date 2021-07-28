//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019

public class RaySumLast
{
	public static int go(int[] ray)
	{
      int total = 0;
		for(int value=0;value<ray.length;value++)
      {
         if(ray[value] > ray[ray.length-1])
         {
            total += ray[value];
         }
         
      }
      
      if (total == 0)
      {
         total = -1;
      }
      
      return total;
	}
}