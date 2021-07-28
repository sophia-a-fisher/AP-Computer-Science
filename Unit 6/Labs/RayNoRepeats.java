//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 13 December 2019

public class RayNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go(int[] ray)
	{		
		int count = 0;
		for(int value = 0; value<ray.length;value++)
		{
			for(int i = 0; i<ray.length; i++)
         {
            if (i == value)
            {
                           
            }
            
            else if (ray[i] == ray [value])
            {
               return false;
            }
         }
		}
		
		return true;
	}
}