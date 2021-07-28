//(c) A+ Computer Science
// www.apluscompsci.com

//pass by value example 2

import static java.lang.System.*;
import java.util.Arrays;

class A
{
   private String s;

   public A( String val ){  
      s = val;  
   }
   public void change( ){
      s = "aplus";
   }
   public String toString(){ 
      return s;  
   }
}

class B
{
   public void mystery(A x, A y) 
   {
		x.change();
		y = x;
   }
}

public class PassByValueTwo
{
	public static void main(String args[])
	{
		//test code in the main in another class
		B test = new B();
		A one = new A("comp");
		A two = new A("sci");
		System.out.println(one + " " + two); 
		test.mystery(one,two);
		System.out.println(one + " " + two); 
	}
}