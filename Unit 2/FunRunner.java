//(c) A+ Computer Science
// www.apluscompsci.com

//return method example 1

public class FunRunner
{
   public static void main(String args[])
   {	
		//option 1 - instantiate an object and call methods on the reference
		Fun x = new Fun();
		System.out.println( x.times( 3, 4) );
		
		Fun aplus = new Fun();
		System.out.println( aplus.times( 3, 4) );
   }
}
