//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 13 February 2020

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	protected int face;

  	//constructors
   public Card()
   {
      suit = "";
      face = 0;
   }
   
   public Card(int face, String suit)
   {
      this.face = face;
      this.suit = suit;
   }


	// modifiers


  	//accessors
  	public String getSuit()
  	{
  		return suit;
  	}
   
  	public int getValue()
  	{
  		return face;
  	}

	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		
		return false;
	}

  	//toString
   public String toString()
   {
       return FACES[face] + " of " + getSuit() + " | value = " + getValue();
   }
  	
 }