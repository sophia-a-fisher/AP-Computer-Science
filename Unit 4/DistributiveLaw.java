//(c) A+ Computer Science  -  www.apluscompsci.com

//Boolean algebra law of disbribution

import static java.lang.System.*;

public class DistributiveLaw
{
	public static void main(String args[])
	{
		System.out.println("DISTRIBUTIVE LAW - UIL and AP!\n");

		boolean C=true, S=true, I=false, ans;
		
		ans=(( C || ( S && I ))
		             ==
		         (( C || S ) && ( C || I )));
		
		System.out.println(ans);
	}
}