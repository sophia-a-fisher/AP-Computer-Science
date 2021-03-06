//(c) A+ Computer Science
// www.apluscompsci.com

//default constructor example

import static java.lang.System.*;

class Monster
{
   private String myName;
   
   //Java provides a default() parameterless constructor
   // if no constructors are present
   
   /*
   //uncomment and rerun
   public Monster()
   {
   	myName = "scary";
   }
   
   */

   public void setName(String name)
   {
   	myName=name;
   }

   public String getName()
   {
   	return myName;
   }

   public String toString() {
      return "Monster is named " + myName + "\n";
   }
}

public class Default
{
	public static void main ( String[] args )
	{
		Monster one = new Monster();  //Calling Java provided default() constructor
		out.println(one);

		one.setName("Comp Sci");
		out.println(one);
	}
}