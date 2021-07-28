//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private static int sum = 0;
    private int[][] m = {{1,2,3,4,5},{6,7,8,9,0},{6,7,1,2,5},{6,7,8,9,0},{5,4,3,2,1}};   //load in the matrix values

    public int sum( int row, int column )
    {
      sum = 0;
      for(int r=0; r<m.length; r++)
      {
         for(int c=0; c<m[r].length; c++)
         {
            if(row == r && column == c)
            {
               sum += m[r][c];
               if(c+1<m[r].length)
               {
                  sum += m[r][c+1];
               }
               if(c-1>0)
               {
                  sum += m[r][c-1];
               }
               //System.out.println(sum);
               
               
            }
            
            if(r == row - 1 && column == c)
            {
               sum += m[r][c];
               if(c+1<m[r].length)
               {
                  sum += m[r][c+1];               
               }
               if(c-1>0)
               {
                  sum += m[r][c-1];
               }
               //System.out.println(sum);
                           
            }
            
            if(r == row + 1 && column == c)
            {
               if(c+1<m[r].length)
               {
                  sum += m[r][c+1];               
               }
               if(c-1>0)
               {
                  sum += m[r][c-1]; 
               }
               sum += m[r][c];
               //System.out.println(sum);
                        
            }
            
            
         }
       
      }

    	return sum;
    }

    public String toString()
    {
    	return "";
    }
}
