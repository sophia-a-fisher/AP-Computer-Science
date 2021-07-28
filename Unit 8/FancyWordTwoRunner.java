//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("fancyword2.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{

			String word = file.next();
			//System.out.println(word);
			FancyWordTwo test = new FancyWordTwo(word);

			System.out.println(test);
	   }
	}
}