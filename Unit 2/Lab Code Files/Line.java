//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
      double _x1 = x1;
      double _x2 = x2;
      double _y1 = y1;
      double _y2 = y2;
      double ans = (double)(_y2-_y1)/(_x2-_x1);
		return ans;
	}

}