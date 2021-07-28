//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class TriangleThree
{
	public static String go( int size, String let )
	{
		String output = "";
      for(int i=0; i<size; i++)
      {
         for(int j=size-1; j>i; j--)
         {
            output += " ";
         }
         
         for(int h=0; h<=i; h++)
         {
            output += let;
         }
         output += "\n";
      }

		return output+"\n";
	}
}