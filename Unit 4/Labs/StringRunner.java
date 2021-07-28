//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import static java.lang.System.*; 
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String word = keyboard.next();
		StringStuff s = new StringStuff( word );
		System.out.println( "has even length " + s.isEvenLength() );
		System.out.println( "has same first last letters " + s.sameFirstLastLetters() );
		System.out.println( "ends with cat " + s.endsWith( "cat" ) );
      System.out.println();
      
      out.print("Enter a word :: ");
		word = keyboard.next();
		StringStuff s1 = new StringStuff( word );
		System.out.println( "has even length " + s1.isEvenLength() );
		System.out.println( "has same first last letters " + s1.sameFirstLastLetters() );
		System.out.println( "ends with cat " + s1.endsWith( "it" ) );

		
		//add more test cases	
	}
}