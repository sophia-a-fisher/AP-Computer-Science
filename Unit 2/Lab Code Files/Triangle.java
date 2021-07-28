//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 20 September 2019

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c)
	{
      sideA = a;
      sideB = b;
      sideC = c;
	}

	public void calcPerimeter( )
	{
      perimeter = sideA + sideB + sideC;
	}

	public double getArea( )
	{
      double s = perimeter/2;
      double ans = Math.sqrt(s*((s-sideA)*(s-sideB)*(s-sideC)));
		return ans;
	}
}