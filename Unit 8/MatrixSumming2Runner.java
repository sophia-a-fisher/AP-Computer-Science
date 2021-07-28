//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
      MatrixSumming2 test = new MatrixSumming2();
      int cnt = file.nextInt();
      int param1 = -1;
      int param2 = 0;
      for(int i = 0; i < cnt; i++)
      {
         if(file.hasNextInt() && (param1 == -1))
         {
            param1 = file.nextInt();
         }
         
         if(file.hasNextInt() && (param1 != -1))
         {
            param2 = file.nextInt();
         }
         System.out.println("The sum of " + param1 + "," + param2 + " is " + test.sum(param1,param2) + ".");
         param1 = -1;
      }
      /*.out.println("The sum of 2,2 is " + test.sum(2,2) + ".");
      System.out.println("The sum of 0,0 is " + test.sum(0,0) + ".");
      System.out.println("The sum of 4,3 is " + test.sum(4,3) + ".");
      System.out.println("The sum of 4,4 is " + test.sum(4,4) + ".");
      System.out.println("The sum of 2,4 is " + test.sum(2,4) + ".");
      System.out.println("The sum of 1,3 is " + test.sum(1,3) + ".");*/
		
		// reference slideshow 13 
		// for help on file input
	}
}



