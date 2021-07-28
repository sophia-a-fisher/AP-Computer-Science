//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 14 January 2020

import java.util.ArrayList;
import java.util.List;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
      int sum = 0;
      
      for(int element: ray)
      {
         sum += element;
      }
      
		return sum;
	}
}