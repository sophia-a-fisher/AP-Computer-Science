//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Sophia Fisher

public class BiggestString
{
	public static String getBiggest( String a, String b, String c )
	{
      if(a.compareTo(b) > 0)
      {
         if(a.compareTo(c) > 0)
         {
            return a;
         }
         
         else if(c.compareTo(b) > 0)
         {
            return c;
         }
      }
      
      else
      {
         if(b.compareTo(c) > 0)
         {
            return b;
         }
         
         else
         {
            return c;
         }
      }
      
      return "";
	}
}