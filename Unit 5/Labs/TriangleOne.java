//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String go( String let, int size)
	{
		String output = "";
      for(int i=0; i<size; i++)
      {
         for(int j=0; j<=i; j++)
         {
            output += let;
         }
         output += "\n";
      }
		return output;
	}
}