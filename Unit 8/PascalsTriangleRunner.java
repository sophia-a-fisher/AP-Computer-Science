//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner
{
	public static void main( String args[] ) throws IOException
	{
      Scanner file = new Scanner(new File("triangle.dat"));
      int length = file.nextInt();
      
      for(int i = 0; i< length; i++)
      {
         PascalsTriangle test = new PascalsTriangle(file.nextInt());
         test.createTriangle();
         System.out.println(test);
      }
      
	}
}



