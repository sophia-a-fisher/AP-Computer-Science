//(c) A+ Computer Science
// www.apluscompsci.com

//overloading example

import static java.lang.System.*;

class Monster
{
	private int height;				//default assinged to 0
	private double weight;			//default assinged to 0.0
	private int age;					//default assigned to 0
	
	//add in a String for the name
	
	//add in name and modify each constructor for name

	public Monster()
	{
		height=0;
		weight=0.0;
	}

	public Monster(int ht)
	{
		height=ht;
		weight=0.0;
	}

	public Monster(double wt)
	{
		height=0;
		weight=wt;
	}

	public Monster(int ht, double wt)
	{
		height=ht;
		weight=wt;
	}
	
	//add in a constructor for height, weight, and age


	//add in a new instance variable of type String for name
	//initialize name in all of the existing constructors
	//add in one more constructor to account for the name



  	public String toString()
  	{
  	    return height + "\t" + weight;
  	}
}

public class Overload
{
  public static void main ( String[] args )
  {
    Monster one = new Monster();
    System.out.println(one);

    Monster two = new Monster(45); //How does Java know which constructor to call?
    System.out.println(two);

    Monster three = new Monster(66.98);
    System.out.println(three);

    Monster four = new Monster(45,98.9);
    System.out.println(four);
    
    //Monster five = new Monster(45,98.9,11);
    //System.out.println(four);
  }
}