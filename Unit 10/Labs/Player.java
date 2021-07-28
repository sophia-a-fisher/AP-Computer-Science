//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 28 February 2020

import java.util.*;

public class Player
{
   private ArrayList<Card> hand;
   public int winCount;
   private int handValue;
   Scanner keyboard;
	private char choice;

   public Player ()
   {
	   hand = new ArrayList<Card>();
	   handValue = 0;
	   keyboard = new Scanner(System.in);
   }

   public Player (int score)
   {
   }

   public void addCardToHand( Card temp )
   {
      hand.add(temp);
   }

   public void resetHand( )
   {
      hand.clear();
   }

   public  void setWinCount( int numwins )
   {
      winCount = numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
	   handValue = 0;
	   for(Card element:hand)
	   {
		   handValue += element.getValue();
	   }
	   return handValue;
   }


   public  boolean  hit( )
   {
	   System.out.println("Do you want to hit? [Y/N] : ");
		choice = keyboard.next().charAt(0);
		if(choice == 'y' || choice == 'Y' )
		{
			return true;
		}
		
		else if (choice == 'n' || choice == 'N' )
		{
			return false;
		}
       return false;
   }

   public String toString()
   {
      return "hand = " + hand;
   }
}