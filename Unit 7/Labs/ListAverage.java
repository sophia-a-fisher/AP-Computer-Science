//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 14 January 2020

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
      double average = 0.0;
      int smallest = ray.get(0);
      int biggest = ray.get(0);
      for(int i = 0; i<ray.size();i++)
      {
         for(int j = i+1; j<ray.size();j++)
         {
            if(ray.get(i) < ray.get(j) && ray.get(i) < smallest)
            {
               smallest = ray.get(i);
            }
            
            else if (ray.get(i) < ray.get(j) && ray.get(j) > biggest)
            {
               biggest = ray.get(j);
            }
            
            else if (ray.get(j) < ray.get(i) && ray.get(j) < smallest)
            {
               smallest = ray.get(j);
            }
            
            else if (ray.get(j) < ray.get(i) && ray.get(i) > biggest)
            {
               biggest = ray.get(i);
            }
         }
      }
      
      //System.out.println(smallest);
      //System.out.println(biggest);
      
      average = (smallest + biggest)/2.0;
		return average;
	}
}