//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;
   private static int _size;

	public PascalsTriangle()
	{
      _size = 0;
	}

	public PascalsTriangle(int size)
	{
      _size = size;
	}

	public void createTriangle()
	{
      mat = new int[_size][_size];
      for(int i = 0; i < _size; i++)
      {
         mat[i][0] = 1;
      }
      
      for(int i = 1; i < _size; i++)
      {
         mat[i][i] = 1;
      }
      
      for(int i = 0; i < _size; i++)
      {
         for(int j = 1; j < i; j++)
         {
            mat[i][j] = -1;
         }
      }
      
      for(int i = 0; i < _size; i++)
      {
         for(int j = 0; j < _size; j++)
         {
               if(mat[i][j] != 1 && mat[i][j] != 0)
               {
                  mat[i][j] = mat[i-1][j-1] + mat[i-1][j];
               }
         }

      }



	}

	public String toString()
	{
      String output = "";
	for(int j = 0; j < _size; j++)
		{
         for(int k =_size-j-2; k >= 0; k--)
         {
            output += "\t";
         }
         for(int i = 0; i< _size; i++)
			{

            if(mat[j][i] != 0)
            {
   			   output += mat[j][i] + "\t\t";
            }
            
            else
            {
               output += " " + "\t\t";
            }
         }
         
						output += "\n";
		}
		return output+"\n\n";

	}
}