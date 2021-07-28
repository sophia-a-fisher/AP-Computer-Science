//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Sophia Fisher

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
    
	public static void main(String args[])
	{
      boolean playAgain = true;
      char response = 'a';
      do
      {
		Scanner keyboard = new Scanner(System.in);
      System.out.print("\nGuessing Game - how many numbers? ");
      int numbersBound;
      numbersBound = keyboard.nextInt();
      GuessingGame test = new GuessingGame(numbersBound);
      test.playGame();
      
     while(response != 'n' && response != 'y')
     {
      System.out.print("Do you want to play again? ");
      response = keyboard.next().charAt(0);
      
      if(response == 'y') 
      {playAgain = true;}
      
      else if (response == 'n') 
      {playAgain = false;}
     }
     
     response = 'a';
      
     }
      while(playAgain == true);
      
		
	}
}