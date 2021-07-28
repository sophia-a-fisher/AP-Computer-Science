//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

//import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix
   private static int _size = 0;
   private static int[][] spiralArray;
   private static boolean hasZero = false;
   private static int number = 1;
   private static int counter = 0;

	public SpiralMatrix()
	{
	}

	public SpiralMatrix(int size)
	{
      _size = size;
	}
	
	public void setSize(int size)
	{
      _size = size;
	}

	public void createSpiral()
	{
		hasZero = false;
		number = 1;
		counter = 0;
        spiralArray = new int[_size][_size];
		do
		{
        	for(int k = counter; k<_size-counter;k++)
        	{
				spiralArray[k][counter] = number;
				number++;
        	}
        	number--;
        	
        	for(int k = counter; k<_size-counter;k++)
        	{
				spiralArray[_size-1-counter][k] = number;
				number++;
        	}
        	number--;
        	
        	for(int k = _size-1-counter; k>=counter;k--)
        	{
				spiralArray[k][_size-1-counter] = number;
				number++;
        	}
        	number--;
        	for(int k = _size-1-counter; k>=counter+1;k--)
        	{
				spiralArray[counter][k] = number;
				number++;
        	}
        	/*for(int k = 0; k<_size-counter;k++)
        	{
				spiralArray[_size-1-counter][k+counter+1] = number;
				number++;
        	}
        	
        	for(int k = 0; k<_size-counter;k++)
        	{
				spiralArray[_size-k-2-counter][_size-counter-1] = number;
				number++;
        	}
        	
        	for(int k = 0; k<_size-counter;k++)
        	{
				spiralArray[counter][_size-k-2-counter] = number;
				number++;
        	}*/
        	
        	
        hasZero = false;
			for(int j = 0; j<_size; j++)
			{

				for(int i = 0; i < _size; i++)
				{

					if(spiralArray[j][i] == 0)
					{
						hasZero = true;
						
					}
					
					//else if (spiralArray[j][i] != 0 && hasZero == false)
					//{
						//hasZero = false;
					//}
					//output += spiralArray[j][i] + "\t";
				}
				//output += "\n";
			}
			
			//System.out.println(output);
			
		counter++;
		}
		while(hasZero);

	}

	public String toString( )
	{
		String output="";
		for(int j = 0; j < _size; j++)
		{
			for(int i = 0; i< _size; i++)
			{
				output += spiralArray[j][i] + "\t";
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}