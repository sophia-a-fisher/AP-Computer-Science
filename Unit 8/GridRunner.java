//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] stringArray = {"a","b","c","7","9","x","2"};
		Grid test = new Grid(20,20,stringArray);
		System.out.println(test);
		System.out.println(test.findMax(stringArray));

	}
}