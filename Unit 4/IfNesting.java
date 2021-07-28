//(c) A+ Computer Science
// www.apluscompsci.com

//nested if statement example

public class IfNesting
{
	public static void main(String args[])
	{
		int num=17;	//rerun the program with diff values for num

		if(num>2)
		{
		   if(num<10)
		      System.out.println(">2<10");
		   else
		      System.out.println("fun");
		}
		
		num = 7;
		if(num>2)
		{
		   if(num<10)
		      System.out.println(">2<10");
		   if(num>10)
		      System.out.println(">2>10");
		}		
		
		int x = 10;
		if( x >= 3 )
		{
		  System.out.println("aplus");
		  if( x >= 10 )
		    System.out.println("comp");
		  if( x < 10 )
		    System.out.println("sci");
		}
		System.out.println("rox");
		
		x = -10;
		if( x >= 3 )
		{
		  System.out.println("aplus");
		  if( x >= 10 )
		    System.out.println("comp");
		  if( x < 10 )
		    System.out.println("sci");
		}
		System.out.println("rox");		
				
	}
}

