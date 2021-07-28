//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Sophia Fisher

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
   private int correctNumber;
   private int totalGuesses;
   private int wrongGuesses;
   private boolean correct;
   private double percentageWrong;

	public GuessingGame(int stop)
	{
      upperBound = stop;
      correctNumber = (int)(Math.random()*upperBound);
      System.out.println(correctNumber);
      correct = false;
      
	}

	public void playGame()
	{
      int answer = 0;
		Scanner keyboard = new Scanner(System.in);
      
      while(!correct)
      {
         System.out.print("Enter a number between 1 and " + upperBound + " ");
         answer = keyboard.nextInt();
         
         if(answer == correctNumber)
         {
            totalGuesses++;  
            correct = true;
         }
         
         else
         {
            wrongGuesses++;
            totalGuesses++;
         }
      }
      
      percentageWrong = ((double)wrongGuesses/totalGuesses)*100;
      System.out.println("\nIt took " + totalGuesses + " guesses to guess " + correctNumber);
      System.out.println("You guessed wrong " + (int)percentageWrong + " percent of the time");
      
	}

	public String toString()
	{
		String output="";
		return output;
	}
}