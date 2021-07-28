//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 1 March 2020

public class Dealer extends Player
{
	//define a deck of cards
	Deck deck = new Deck();	
	private Card chosenCard;
	

	public Dealer() 
	{
		super();
	}

	public void  shuffle()
	{
	   deck.shuffle();
	}

	public Card  deal()
	{
	   chosenCard = deck.nextCard();
	   return chosenCard;
	}
	
	public int numCardsLeftInDeck()
	{
		return deck.numCardsLeft();
	}

	public boolean hit()
	{
	   return false;
    }
}








