//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
      if(num > 0)
      {
         if(num%2 == 0)
         {
            return 1 + countOddDigits(num/10);
         }
         else
         {
            return 0 + countOddDigits(num/10);
         }
    
      }
		   return 0;
      
	}
}