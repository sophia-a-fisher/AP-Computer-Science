//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Sophia Fisher
import java.util.Scanner;

public class DoubleRunner
{
	public static void main(String[] args)
	{
      Scanner keyboard = new Scanner(System.in);
      double double1 = keyboard.nextDouble();
      double double2 = keyboard.nextDouble();
      double double3 = keyboard.nextDouble();
      double double4 = keyboard.nextDouble();
      BiggestDouble test = new BiggestDouble();
      System.out.println(test.getBiggest(double1, double2, double3, double4));
		//add more test cases		
	}
}