//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleThreeRunner
{
   public static void main( String args[] )
   {
      Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
         int value = keyboard.nextInt();
			out.print("Enter a letter : ");
         String big = keyboard.next();
			

				//static methods can be called using the class name
			System.out.println( TriangleThree.go( value, big ) );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
   }
}