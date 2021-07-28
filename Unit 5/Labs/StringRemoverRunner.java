//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
	  StringRemover test = new StringRemover("xR-MxR-MHelloxR-M", "R-M");
      test.removeStrings();
      System.out.println(test.toString());
      StringRemover test2 = new StringRemover("sxsssxssxsxssexssxsesss", "xs");
      test2.removeStrings();
      System.out.println(test2.toString());
      StringRemover test3 = new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
      test3.removeStrings();
      System.out.println(test3.toString());
      StringRemover test4 = new StringRemover("dogdogcatddodogdogdoggog", "dog");
      test4.removeStrings();
      System.out.println(test4.toString());
									
	}
}