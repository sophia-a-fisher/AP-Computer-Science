//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
      if(word.length()>0)
      {
         if(word.contains("chicken"))
         {
            word = word.replaceFirst("chicken","");
            return 1 + countChickens(word);
         }
         
         else
         {
            return 0;
         }
      }

		return 0;
	}
}