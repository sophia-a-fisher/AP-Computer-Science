//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 14 January 2020

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
      int evenIndex = -1;
   
      for(int i = 0; i < ray.size(); i++)
      {
         if(ray.get(i) % 2 == 1)
         {
            for (int j = i+1; j < ray.size(); j++)
            {
               if(ray.get(j) % 2 == 0)
               {
                  evenIndex = j;
                  //System.out.println(evenIndex);
               }
            }
            
            //System.out.println(evenIndex);
            if(evenIndex == -1)
            {
               return evenIndex;
            }
            
            else
            {
               return evenIndex - i;
            }
         }
         
         if(i == ray.size()-1 && ray.get(i) % 2 != 1)
         {
            return evenIndex;
         }
      }
      
      /*if(evenIndex == -1)
      {
         return false;
      }*/
      
		return evenIndex;
	}
}