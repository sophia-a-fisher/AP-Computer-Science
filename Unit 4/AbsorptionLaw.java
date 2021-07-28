//(c) A+ Computer Science  -  www.apluscompsci.com

//Boolean algebra law of absorption

import static java.lang.System.*;

public class AbsorptionLaw
{
	public static void main(String args[])
	{
		System.out.println("LAW OF ABSORPTION - UIL and AP!\n");

		boolean C = false;
		boolean S = true;
		boolean I = C && ( C || S );
		out.println("C == " + C);
		out.println("S == " + S);
		System.out.println("C && ( C || S ) = " + I + "\n\n");

		C = true;
		S = false;
		I = C || ( C && S );
		out.println("C == " + C);
		out.println("S == " + S);
		System.out.println("C || ( C && S ) = " + I);
	}
}