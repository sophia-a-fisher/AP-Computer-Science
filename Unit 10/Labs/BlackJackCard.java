//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 13 February 2020

public class BlackJackCard extends Card
{
	private int value = 0;
  	//constructors
	public BlackJackCard(int face, String suit)
	{
		super(face,suit);
	}

  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
  		if(face<11 && face>1) 
  		{
  			value = face;
  		}
  		if(face == 11 || face == 12 || face == 13)
  		{
  			value = 10;
  		}
  		
  		if(face == 1)
  		{
  			value = 11;
  		}
  			
		return value;
  	}
  	
 }