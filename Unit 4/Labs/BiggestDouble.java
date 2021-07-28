//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Sophia Fisher

public class BiggestDouble
{
	public static double getBiggest( double a, double b, double c, double d )
	{
   
      /*String A = String.valueOf(a);
      String B = String.valueOf(b);
      String C = String.valueOf(c);
      String D = String.valueOf(d);*/
      
      if(a > b)
      {
         if(a > c)
         {
            if(a > d)
            {
               return a;
            }
            
            else
            {
               return d;
            }
         }
         
         else if(c > d)
         {
            return c;
         }
         
         else
         {
            return d;
         }
      }
      
      else
      {
         if(b > c)
         {
            if(b > d)
            {
               return b;
            }
            
            else
            {
               return d;
            }
         }
         
         else if (c > d)
         {
            return c;
         }
         
         else
         {
            return d;
         }
      }

		//return 0.0;
	}
}