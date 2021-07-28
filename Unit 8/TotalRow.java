//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.*;

public class TotalRow
{
   private static List<Integer> ray;
   private static int sum = 0;
    public static List<Integer> getRowTotals( int[][] m )
    {
      ray = new ArrayList<Integer>();
    	for(int r=0; r<m.length; r++)
      {
         for(int c=0; c<m[r].length; c++)
         {
            sum += m[r][c];
         }
         ray.add(sum);
         sum = 0;
      }

		return ray;
    }
}
