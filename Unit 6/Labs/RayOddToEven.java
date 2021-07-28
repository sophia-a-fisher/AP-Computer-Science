//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019

public class RayOddToEven
{
	public static int go(int[] ray)
	{
      int oddIndex = -1;
      int distance = 0;
		for (int value = 0; value< ray.length; value++)
      {
         if(ray[value]%2 == 1 && oddIndex == -1)
         {
            oddIndex = value;
         }
         
         else if(oddIndex!=-1 && ray[value]%2 == 0)
         {
            distance = value - oddIndex;
            return distance;
         }
      }
      return -1;
      
	}
}