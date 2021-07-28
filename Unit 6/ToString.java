//(c) A+ Computer Science
// www.apluscompsci.com

//monster example one

import static java.lang.System.*;

class Monster
{
	private int weight;
	
	public Monster( )
	{
		weight=0;
	}
	
	public void print()
	{
		System.out.println("Monster's weight = " + weight);
	}
	
	//add a toString()
	//overide the Object toString
	
}

public class ToString
{
	public static void main ( String[] args )
	{
		Monster m = new Monster();
		m.print();
		
		System.out.println(m.toString());   //uses the Object toString
														//need to override the
														//the Object toString
														//in Monster
	}
}