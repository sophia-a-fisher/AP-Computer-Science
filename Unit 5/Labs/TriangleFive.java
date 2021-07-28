//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class TriangleFive
{
	public static String go( int amount, char letter )
	{
	  String output="";
	  char tempLetter = letter;
      for(int i=0; i<amount; i++)
      {
    	  tempLetter = letter;
          for(int h=i; h<amount; h++)
          {
            for(int j=amount; j>h-i; j--)
            {
            	if(tempLetter+(h-i)<=90)
            	{
            		output += (char)(tempLetter+(h-i));
            	}
            	
            	else if(tempLetter+(h-i)>90)
            	{
            		tempLetter = (char)('A' - (h-i));
            		
            		output += (char)(tempLetter+(h-i));
            	}
            }
            output += " ";
          }
          output += "\n";
      }

      return output;
	}
}