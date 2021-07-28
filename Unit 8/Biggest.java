//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class Biggest
{
   private static int biggest = -10000;
   //int tempBig = -1;
    public static int getBig(int[][] m)
    {
    biggest = -10000;

      for(int r=0; r<m.length; r++)
      {
         for(int c=0; c<m[r].length; c++)
         {
            if(m[r][c] > biggest)
            {
               biggest = m[r][c];
            }
         }
      }

		return biggest;
    }
}
