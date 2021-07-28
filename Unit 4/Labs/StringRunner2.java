//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Sophia Fisher
import java.util.Scanner;

public class StringRunner2
{
	public static void main(String args[])
	{
      Scanner keyboard = new Scanner(System.in);
      String string1 = keyboard.nextLine();
      String string2 = keyboard.nextLine();
      String string3 = keyboard.nextLine();
		BiggestString test1 = new BiggestString();
      System.out.println(test1.getBiggest(string1, string2, string3));
      
      
	}
}