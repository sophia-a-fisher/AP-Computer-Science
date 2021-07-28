//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import static java.lang.System.*; 
import java.util.Scanner;

public class StringStuff
{
	//add in a String instance variable named word
   private String word;

	//add in a constructor with one String parameter
   public StringStuff(String _word)
   {
      word = _word;
   }
	
	//add in a setString method with one String parameter

 	public boolean isEvenLength()
 	{
      if(word.length()%2 == 0)
      {
         return true;
      }
      
      else
      {
		   return false;
      }
	}
	
	public boolean endsWith( String b )
	{
      if(word.indexOf(b) == word.length()-3)
      {
         return true;
      }
      
      else
      {
		   return false;	
      }		
	}
	
 	public boolean sameFirstLastLetters()
 	{
      if(word.charAt(0) == word.charAt(word.length()-1))
      { 
         return true;
      }
      
      else
      {
 	 	   return false;
      }
	}	

 	public String toString()
 	{
 		return "";
	}
}