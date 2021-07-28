//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
      int[][] f = {{1,2,3},{5,5,5,5}};
		System.out.println( "Row totals are :: " + TotalRow.getRowTotals( f ) );
      int[][] f2 = {{1,2,3},{5},{1},{2,2}};;
		System.out.println( "Row totals are :: " + TotalRow.getRowTotals( f2 ) );
      int[][] f3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};;
		System.out.println( "Row totals are :: " + TotalRow.getRowTotals( f3 ) );


	}
}



