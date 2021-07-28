//(c) A+ Computer Science
// www.apluscompsci.com

//inheritance super this example

import static java.lang.System.*;

class Monster
{
	private String name;

	public Monster()
	{
		this("Monster");  //calls method Monster(name)
	}

	public Monster( String name )
	{
		//remove this. and rerun the program
		//what changes?
		this.name = name;
	}

	public String toString()
	{
		return this.name + " ";
	}
}

public class This
{
  public static void main( String[] args )
  {
     Monster one = new Monster();
     out.println(one);
     
     Monster two = new Monster("Sammy");
     out.println(two);
     
     Monster three = new Monster("Benny");
     out.println(three);     
  }
}