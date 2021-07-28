//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

//import java.io.File;
import java.io.IOException;
//import java.util.Scanner;
//import static java.lang.System.*;

public class SpiralMatrixRunner
{
	public static void main( String args[] ) throws IOException
	{
      SpiralMatrix test = new SpiralMatrix();
      test.setSize(5);
      test.createSpiral();
      System.out.println(test);
      test.setSize(8);
      test.createSpiral();
      System.out.println(test);
      test.setSize(7);
      test.createSpiral();
      System.out.println(test);
      test.setSize(3);
      test.createSpiral();
      System.out.println(test);
      test.setSize(2);
      test.createSpiral();
      System.out.println(test);
      test.setSize(1);
      test.createSpiral();
      System.out.println(test);
	}
}