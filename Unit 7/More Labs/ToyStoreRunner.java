// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sophia Fisher

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Arrays;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore sto = new ToyStore();
		System.out.println( sto );
      
		String[] s = "sorry bat sorry sorry sorry train train teddy teddy ball ball".split(" ");
        //System.out.println(Arrays.asList(s));
		sto.loadToys( s );
		System.out.println( sto );	
		System.out.println( "max == " + sto.getMostFrequentToy() );	
		System.out.println( sto.getThatToy( "sorry" ) );		
	}
}