//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sophia Fisher
//Date - 30 January 2020
//Class - AP Computer Science
//Lab  - 1

import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};
   private static int sum = 0;

    public static int sum(  )
    {
		for(int r=0; r<m.length; r++)
      {
         for(int c=0; c<m[r].length; c++)
         {
            sum += m[r][c];
         }
      }
		return sum;
    }
    
    public String toString()
    {
      String output = "Matrix values\n";
      for(int[] row: m)
      {
         for(int element: row)
         {
            output += element + " ";
         }
         output += "\n";
      }
      
      return output;
    }
}
