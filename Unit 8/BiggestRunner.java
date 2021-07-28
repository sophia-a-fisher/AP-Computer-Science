//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class BiggestRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] f = {{1,2,3},{5,5,5,5}};
		System.out.println( "The biggest number is :: " + Biggest.getBig( f ) );
      int[][] f2 = {{1,2,3},{-5},{11},{21,2}};
      System.out.println( "The biggest number is :: " + Biggest.getBig( f2 ) );
      int[][] f3 = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
      System.out.println( "The biggest number is :: " + Biggest.getBig( f3 ) );		
      int[][] f4 = {{-20, -40},{-234,-234234 } };
      System.out.println( "The biggest number is :: " + Biggest.getBig( f4 ) );		
		//add more code and test cases		
	}
}



