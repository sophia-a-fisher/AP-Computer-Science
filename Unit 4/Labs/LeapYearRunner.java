//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.*;

public class LeapYearRunner
{
	public static void main( String args[] )
	{		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		//add test cases				
      
      LeapYear test = new LeapYear();
      if (test.isLeapYear(year) == true)
      {
         System.out.println(year + " is a leap year.");
      }
      
      else
      {
         System.out.println(year + " is NOT a leap year.");
      }

	}
}