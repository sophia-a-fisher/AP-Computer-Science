//(c) A+ Computer Science
// www.apluscompsci.com

//String references

import static java.lang.System.*;

public class StringRef
{
	public static void main (String[] arg)
	{
		String one = "compsci";
		String two = "compsci";
		
		if(one==two)
		   System.out.println("==");
		else
		   System.out.println("!==");

		
		String a = new String("compsci");
		String b = new String("compsci");

		if(a==b)
			System.out.println("==");
		else
			System.out.println("!==");
	}
}