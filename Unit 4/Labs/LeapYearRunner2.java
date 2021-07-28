//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.*;

public class LeapYearRunner2
{
	public static void main( String args[] )
	{		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		LeapYear2 test = new LeapYear2();
		boolean leapYear = test.isLeapYear(year);
		
		if(leapYear)
		{
			System.out.println(year + " is a leap year.");
		}
		
		else
		{
			System.out.println(year + " is NOT a leap year.");
		}
		//add test cases				
	}
}