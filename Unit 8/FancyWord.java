//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class FancyWord
{
	private String[][] mat;
	private static int length = 0;

   public FancyWord(String s)
	{
		//size the matrix
	   mat = new String[s.length()][s.length()];
	   length = s.length();
	   for (String[] row: mat)
		    {Arrays.fill(row, " ");}

		//use Arrays.fill() to fill in the matrix with spaces

		//use a for loop to load in the letters into the matrix
	   for(int j = 0; j < s.length(); j++)
	   {
		   for(int i = 0; i < s.length();i++)
		   {
			   mat[0][i] = s.substring(i,i+1);
			   mat[length-1][i] = s.substring(i,i+1);
			
			   //mat[0][i] = s.substring(i,i+1);
		   }
		   mat[j][j] = s.substring(j,j+1);
		   mat[j][length-j-1] = s.substring(length-j-1,length-j);
		   
	   }
	 
	}

	public String toString()
	{
		String output="";
		for(int j = 0; j < length; j++)
		{
			for(int i = 0; i< length; i++)
			{
				output += mat[j][i];
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}