//(c) A+ Computer Science
// www.apluscompsci.com

//String compareTo() method

import static java.lang.System.*;

public class CompareTo
{
   public static void main( String args[] )
   {
		String one = "region";
		String two = "uilstate";

		out.println(one.compareTo(two));
		out.println(two.compareTo(one));

		two = "region";
		out.println(two.compareTo(one));
		
		Integer a = 90;
		Integer b = 75;
		out.println( a.compareTo( b ));
		out.println( b.compareTo( a ));
		
		b = 90;
		out.println( b.equals( a ) );
		out.println( b.compareTo( a ) );		
	}
}