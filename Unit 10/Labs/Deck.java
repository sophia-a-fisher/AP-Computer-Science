//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 28 February 2020

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
	  stackOfCards = new ArrayList<Card>(NUMCARDS);
      topCardIndex = NUMCARDS - 1;
		
		//loop through suits
			//loop through faces
				//add in a new card
            
     for(int i = 0; i < NUMSUITS; i++)
     {
         for(int k = 1; k <= NUMFACES; k++)
         {
            stackOfCards.add(new Card(k,SUITS[i]));
         }
     }
     //System.out.println(stackOfCards);
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
	   
	  stackOfCards.clear();
	  
	  for(int i = 0; i < NUMSUITS; i++)
	     {
	         for(int k = 1; k <= NUMFACES; k++)
	         {
	            stackOfCards.add(new Card(k,SUITS[i]));
	         }
	     }
	  
      Collections.shuffle(stackOfCards);
	}

   //accessors
	public int  size ()
	{
		return 0;
	}

	public int numCardsLeft()
	{
		return stackOfCards.size();
	}

	public Card nextCard()
	{
		Card chosen = stackOfCards.get(topCardIndex--);
		stackOfCards.remove(chosen);
		return chosen;
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}