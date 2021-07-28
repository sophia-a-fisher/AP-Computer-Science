//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class Box
{
	public static String go( int size )
	{
		String output = "";
      for(int i=0; i<size; i++)
      {
                  
         for(int h=size; h>i; h--)
         {
            output += "*";
         }
         for(int j=0; j<=i; j++)
         {
            output += "#";
         }

         output += "\n";
      }

		return output+"\n";

	}
}