//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class Discount
{
	private double amount;
	
	public Discount( double a )
	{
      amount = a;
	}
	
	public boolean check()
	{
      if(amount > 2000)
      {
         return true;
      }     
      else if (amount <= 2000)
      {
         return false;
      }
      
      else
      {
         return false;
      }
		
	}
	
	public double getTheBill()
	{
      if (check() == true)
      {
         amount = amount - (amount*.15);
      }
     
		   return amount;
      
	}
}