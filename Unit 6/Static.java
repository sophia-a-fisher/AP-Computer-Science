//(c) A+ Computer Science
// www.apluscompsci.com

//static example

import static java.lang.System.*;

class Monster
{
   private String name;
   private static int count = 0;   	//all Monsters share this var
   											//there is only one count	

   public Monster()
   {
     name="";
     count++;
   }
   public Monster( String name )
   {
     this.name = name;
     count++;
   }

		//all Monsters share this method
   public static int getCount( )
   {
     return count;
   }

   public String toString()
   {
      return name + " " + count;
   }
}

class Static
{
  public static void main ( String[] args )
  {
     System.out.println("\nMonster count == " + Monster.getCount() + "\n\n");

     Monster casper = new Monster("Casper");
     out.println(casper);
     
     Monster fred = new Monster();
     Monster dude = new Monster();
     out.println("Monster count == " + casper.getCount() + "\n");
     
     Monster a = new Monster();
     Monster b = new Monster();
     Monster c = new Monster();     
     out.println("Monster count == " + Monster.getCount() + "\n");
  }
}