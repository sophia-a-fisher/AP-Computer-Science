//(c) A+ Computer Science  -  www.apluscompsci.com

//Boolean algebra demorgan's law

import static java.lang.System.*;

public class DemorgansLaw
{
	public static void main(String args[])
	{
		boolean C = true, S = false;

		out.println("DEMORGAN'S LAW - UIL and AP!\n");
		out.println("C == " + C);
		out.println("S == " + S + '\n');
		out.println( "!(C || S) == " + (!(C||S)));
		out.println( "!C && !S  == " + (!C&&!S));
		out.println( "!(C && S) == " + (!(C&&S)));
		out.println( "!C || !S  == " + (!C||!S));
	}
}