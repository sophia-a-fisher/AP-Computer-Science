//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sophia Fisher
//Date - 3 March 2020
//Class - AP Computer Science
//Lab  - Recursion Fun Lab Three

import static java.lang.System.*;

public class RecursionFunThree
{

	public static int luckyThrees( long number )
	{
      if(number > 0)
      {
         if(number<10)
         {
            return 0 + luckyThrees(number/10);
         }
         if(number%10==3)
         {
            return 1 + luckyThrees(number/10);
         }
         else
         {
            return 0 + luckyThrees(number/10);
         }
      }
		return 0;
	}
}