//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 17 October 2019

public class Social
{
	private String num;
	
	public Social( String n )
	{
      num = n;
	}
	
	private boolean isValid()
	{
      if((num.indexOf("-") == 3)&&(num.lastIndexOf("-") == 6))
      {
         return true;	
      }
      
      else
      {
         return false;
      }
	
	}
	
	//method go must call isValid
   public String go()
	{
      if (isValid() == true)
      {
         return num.substring(7,11);
      }
      
      else
      {
		   return "bad";
      }
	}
}



