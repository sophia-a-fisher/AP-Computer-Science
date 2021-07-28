//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019

import java.util.Arrays;
public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
      int[] greatArray = {0,0,0};
      boolean firstGreat = false;
      boolean secondGreat = false;
      boolean thirdGreat = false;
      for(int value = 0; value<ray.length; value++)
      {
         if(ray[value] > 11 && firstGreat == false)
         {
            greatArray[0] = ray[value];
            firstGreat = true;
         }
         
         else if(ray[value] > 11 && secondGreat == false)
         {
            greatArray[1] = ray[value];
            secondGreat = true;
         }
         
         else if(ray[value] > 11 && thirdGreat == false)
         {
            greatArray[2] = ray[value];
            thirdGreat = true;
         }
         
         if(thirdGreat == true)
         {
            return greatArray;
         }
         
      }
		return greatArray;

	}
}