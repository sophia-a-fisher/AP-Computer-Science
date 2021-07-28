//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 16 January 2020

import java.util.ArrayList;
import java.util.List;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static ArrayList<Integer> go(  List<Integer> ray )
	{
      ArrayList<Integer> finalRay = new ArrayList<Integer>();
      for(int element: ray)
      {
         if(element > ray.get(ray.size()-1))
         {
            finalRay.add(element);
         }
         
      }
		return finalRay;
	}
}