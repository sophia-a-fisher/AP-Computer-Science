//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 14 January 2020

import java.util.ArrayList;
import java.util.List;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
      boolean occured = false;
      
      for(int i =0; i <ray.size()-1; i++)
      {
         if(ray.get(i) == ray.get(ray.size()-1))
         {
            occured = true;
            return occured;
         }
      }
		return occured;
	}
}