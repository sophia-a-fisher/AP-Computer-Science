//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Sophia Fisher

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
      password = "mchammergohammer";
	}

	public void check()
	{
      Scanner keyboard = new Scanner(System.in);
      String answer = "";

      do
      {
         System.out.print("Enter the password :: ");
         answer = keyboard.nextLine();
         //System.out.println(password);
         //System.out.println(answer);
         
         if(!(answer.equals(password)))
         {
            System.out.println("INVALID");
         }
         
         else
         {
            System.out.println("VALID");
         }
      } 
      while(!(answer.equals(password)));
	}
}