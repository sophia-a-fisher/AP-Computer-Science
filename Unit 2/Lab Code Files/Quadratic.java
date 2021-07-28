//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Quadratic
{
	public static double getRootOne( int a, int b, int c )
	{
      double ans = (-1*b + (Math.sqrt(Math.pow(b,2) - 4 * a * c)))/(2*a);
		return ans;
	}
	
	public static double getRootTwo( int a, int b, int c )
	{
      double ans = (-1*b - (Math.sqrt(Math.pow(b,2) - 4 * a * c)))/(2*a);
		return ans;

	}
}