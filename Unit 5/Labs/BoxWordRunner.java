//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import static java.lang.System.*;
import java.util.Scanner;

public class BoxWordRunner
{
   public static void main( String args[] )
   {
      Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the word : ");
         String word = keyboard.next();			

				//static methods can be called using the class name
			System.out.println( BoxWord.go( word) );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));

	}
}