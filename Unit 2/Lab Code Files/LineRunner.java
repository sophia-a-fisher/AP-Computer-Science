//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class LineRunner
{
   public static void main( String[] args )
   {
   /*
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter y2: ");
      int y2 = keyboard.getInt();
      
      System.out.print("Enter y1: ");
      int y1 = keyboard.getInt();
           
      System.out.print("Enter x2: ");
      int x2 = keyboard.getInt();
      
      System.out.print("Enter x1: ");
      int x1 = keyboard.getInt();*/
      
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,2 ) );
      
      System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1, 7,18,3 ) );

      System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 6,4,2,2 ) );

      System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 4,4,5,3 ) );

      System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,1,2,9 ) );
      
      System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,2,9 ) );
		//add more test cases		
	}
}