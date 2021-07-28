//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 13 December 2019

public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray)
	{
		int count = 0;
      int previousCount = 0;
      int biggestCount = 0;
		for(int value = 0; value<ray.length;value++)
		{
			for(int i = 0; i<ray.length; i++)
         {
            
            if (ray[i] == ray [value])
            {
               count++;
            }
                        
            if(count > biggestCount)
            {
              biggestCount = count;
            }
            
         }
         //previousCount = count;
         count = 0;
         
         
		}
      //System.out.println(biggestCount);
      
      int count2 = 0;
      for (int value = 0; value<ray.length;value++)
      {
         for(int i = 0; i<ray.length; i++)
         {
            if (ray[i] == ray [value])
            {
               count2++;
            }
            
            if(count2 == biggestCount)
            {
               return ray[value];
            }

         }
         //System.out.println(count2);
         count2 = 0;
         
      }
		
		return ray[0];

	}
}