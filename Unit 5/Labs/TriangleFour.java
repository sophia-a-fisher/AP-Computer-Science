//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class TriangleFour
{
	public static String go( int size, String let )
	{
		String output = "";
      for(int i=0; i<size; i++)
      {
         for(int j=0; j<i; j++)
         {
            output += " ";
         }
         
         for(int h=size; h>i; h--)
         {
            output += let;
         }
         output += "\n";
      }

		return output+"\n";
	}
}