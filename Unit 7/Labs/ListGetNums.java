//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 14 January 2020

import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static ArrayList<Integer> go( List<Integer> ray )
	{
      ArrayList<Integer> finalArray = new ArrayList<Integer>();
      for(int element: ray)
      {
         if(element > 11)
         {
            finalArray.add(element);
         }
         
         if(finalArray.size() == 3)
         {
            return finalArray;
         }
      }
		return finalArray;
	}
}