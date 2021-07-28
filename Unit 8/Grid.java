//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.lang.Math;

public class Grid
{
   private String[][] grid;
   private static double value = 1.0;
   private static int count = 0;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
      grid = new String[rows][cols];
      for(int r=0; r<grid.length; r++)
      {
         for(int c=0; c<grid[r].length; c++)
         {
        	 while(value>.7)
        	 {
	            value = Math.random();
	            if(value <.1)
	            {grid[r][c] = "a";}
	            else if(value <.2)
	            {grid[r][c] = "b";}
	            else if(value <.3)
	            {grid[r][c] = "c";}
	            else if(value <.4)
	            {grid[r][c] = "7";}
	            else if(value <.5)
	            {grid[r][c] = "9";}
	            else if(value <.6)
	            {grid[r][c] = "x";}
	            else if(value <.7)
	            {grid[r][c] = "2";}
	            
        	 }
        	 value = 1.0;
         }
      }
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String output = "";
		int biggestCount = -1;
		int countedVals = -1;
		for(int i=0;i<vals.length;i++)
		{
			countedVals = countVals(vals[i]);
			if(countedVals > biggestCount)
			{biggestCount = countedVals;}
		}
		for(int i=0;i<vals.length;i++)
		{
			countedVals = countVals(vals[i]);
			if(countedVals == biggestCount)
			{output += vals[i] + " occurs the most.";}
		}

		return output;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		count = 0;
		for(int r=0; r<grid.length; r++)
		{
			for(int c=0; c<grid[r].length; c++) 
			{
				if(grid[r][c] == val)
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int r=0; r<grid.length; r++)
		{
			for(int c=0; c<grid[r].length; c++)
			{
	             output += grid[r][c];
			}
			output += "\n";
		}
		  output += "\n";
	      output += "a count is " + countVals("a") + "\n";
	      output += "b count is " + countVals("b") + "\n";
	      output += "c count is " + countVals("c") + "\n";
	      output += "7 count is " + countVals("7") + "\n";
	      output += "9 count is " + countVals("9") + "\n";
	      output += "x count is " + countVals("x") + "\n";
	      output += "2 count is " + countVals("2") + "\n";

		return output;
	}
}