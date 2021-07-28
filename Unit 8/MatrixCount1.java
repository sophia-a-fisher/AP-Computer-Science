//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};
    private static int count = 0;

    public static int count( int val  )
    {
      count = 0;
		for(int r=0; r<m.length; r++)
      {
         for(int c=0; c<m[r].length; c++)
         {
            if(m[r][c] == val)
            {
               count++;
               //System.out.println(m[r][c]);
            }
         }
      }

		return count;
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
