//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		String suit;
		int face;

  	//constructors
      public Card(String suit, int face)
      {
         this.suit = suit;
         this.face = face;
      }


	// modifiers - mutators
		//set methods
      public void setFace(int face)
      {
         this.face = face;
      }


  	//accessors
		//get methods
      public String getSuit()
      {
         return suit;
      }
      
      public int getFace()
      {
         return face;
      }


  	//toString
      public String toString()
      {
         return FACES[face] + " of " + suit;
      }

 }