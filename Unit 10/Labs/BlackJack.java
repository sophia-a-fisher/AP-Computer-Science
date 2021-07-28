//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 1 March 2020

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
	//add in Dealer instance variable
	private Player player;	
	private Dealer dealer;
	private boolean keepPlaying = false;
	private boolean playerHit = false;
	private boolean dealerHit = true;
	private int playerTotal;
	private int dealerTotal;
	private int playerWinTotal;
	private int dealerWinTotal;
	private int playerNumber;
	private char choice;
	Scanner keyboard;
	private ArrayList<Player> playerList;

	public BlackJack()
	{
		player = new Player();	
		dealer = new Dealer();
		playerWinTotal = 0;
		dealerWinTotal = 0;
		keyboard = new Scanner(System.in);
		playerList = new ArrayList<Player>();
		playerList.add(player);
	}
	public BlackJack(int players)
	{
		playerList = new ArrayList<Player>(players);
		for(int i = 0; i < players; i++)
		{
			playerList.add(new Player());
		}
		dealer = new Dealer();
		playerWinTotal = 0;
		dealerWinTotal = 0;
		keyboard = new Scanner(System.in);
	}

	public void playGame()
	{
		dealer.shuffle();

		do{
			dealer.resetHand();
			dealerHit = true;
			for(Player element: playerList)
			{
				element.resetHand();
			}
			//player.resetHand();
			for(Player element: playerList)
			{
				element.addCardToHand(dealer.deal());
			}
			dealer.addCardToHand(dealer.deal());
			for(Player element: playerList)
			{
				element.addCardToHand(dealer.deal());
			}
			//player.addCardToHand(dealer.deal());
			//player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());
			
			//playerTotal = player.getHandValue();
			//dealerTotal = dealer.getHandValue();
			playerNumber = 1;
			for(Player element: playerList)
			{
				out.println("\nPLAYER " + playerNumber);
				out.println("Hand Value :: " + element.getHandValue() );
				out.println("Hand Size :: " + element.getHandSize() );
				out.println("Cards in Hand :: " + element.toString() );
				
				playerHit = element.hit();

				while(element.getHandValue()<21 && playerHit)
					{
						element.addCardToHand(dealer.deal());
						out.println("\nPLAYER " + playerNumber);
						out.println("Hand Value :: " + element.getHandValue() );
						out.println("Hand Size :: " + element.getHandSize() );
						out.println("Cards in Hand :: " + element.toString() );
					}
				playerNumber++;
			}
			
			//out.println("\nPLAYER ");
			//out.println("Hand Value :: " + playerTotal );
			//out.println("Hand Size :: " + player.getHandSize() );
			//out.println("Cards in Hand :: " + player.toString() );
			

			//playerHit = player.hit();

			/*while(playerTotal<21 && playerHit)
				{
					player.addCardToHand(dealer.deal());
					playerTotal = player.getHandValue();
					out.println("\nPLAYER ");
					out.println("Hand Value :: " + playerTotal );
					out.println("Hand Size :: " + player.getHandSize() );
					out.println("Cards in Hand :: " + player.toString() );
				}*/
			
			//out.println("\nDEALER ");
			//out.println("Hand Value :: " + dealerTotal );
			//out.println("Hand Size :: " + dealer.getHandSize() );
			//out.println("Cards in Hand :: " + dealer.toString() );

			while(dealerHit)
			{
				//code to add cards should be in dealer hit method print
				//out dealer’s hand value and cards
				dealer.addCardToHand(dealer.deal());
				dealerTotal = dealer.getHandValue();
				out.println("\nDEALER ");
				out.println("Hand Value :: " + dealerTotal );
				out.println("Hand Size :: " + dealer.getHandSize() );
				out.println("Cards in Hand :: " + dealer.toString() );
				dealerHit = false;
			}
			playerNumber = 1;
			for(Player element: playerList)
			{
				if(element.getHandValue()>21&&dealer.getHandValue()<=21)
				{
				   out.println("\nDealer wins - Player " + playerNumber+ " busted!");
				   dealerWinTotal++;
				}
				else if(element.getHandValue()<=21&&dealer.getHandValue()>21)
				{
				   out.println("\nPlayer " + playerNumber + " wins - Dealer busted!");
				   element.winCount++;
				}
				else if(element.getHandValue()>21&&dealer.getHandValue()>21)
				{
				   out.println("\nBoth player " + playerNumber + " and dealer bust!");
				}
				
				else if(element.getHandValue()>dealer.getHandValue())
				{
				   out.println("\nPlayer " + playerNumber + " has bigger hand value than the dealer!");
				   element.winCount++;
				}
				else 
				{
				   out.println("\nDealer has bigger hand value than player " + playerNumber+ "!");
				   dealerWinTotal++;
				}
				playerNumber++;
			}
			dealer.shuffle();
			System.out.println("\nDealer has won " + dealerWinTotal + " times");
			playerNumber = 1;
			for(Player element:playerList)
			{
				System.out.println("Player " + playerNumber + " has won " + element.winCount + " times");
				playerNumber++;
			}

		System.out.println("\nDo you want to play again? [y,Y,n,N] : ");
		choice = keyboard.next().charAt(0);
		if(choice == 'y' || choice == 'Y' )
		{
			keepPlaying = true;
		}
		
		else if (choice == 'n' || choice == 'N' )
		{
			keepPlaying = false;
		}
	} while (keepPlaying);
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many players? : ");
		int playerCount = keyboard.nextInt();
		BlackJack game;
		if(playerCount == 1)
		{
			game = new BlackJack();
		}
		else
		{
			game = new BlackJack(playerCount);
		}

		game.playGame();
	}
}