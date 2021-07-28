//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MilesPerHour
{
	public static double getMPH( int dist, int hrs, int mins )
	{
      double ans = 0.0;
      double _dist = dist;
      double _hrs = hrs;
      double _mins = mins;
      double time = _mins/60 + _hrs;
      //System.out.println(time);
      //System.out.println(ans);
      ans = _dist / time;
      //System.out.println(ans);
      
		return ans;
	}
}

