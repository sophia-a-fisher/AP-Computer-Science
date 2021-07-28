//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
      for(int value = 1; value<numArray.length; value++)
      {
         if(numArray[value] >= numArray[value-1])
         {
            return false;
         }
      }
   
		return true;
	}	
}