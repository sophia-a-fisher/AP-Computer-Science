//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class LetterRemover
{
	public static String removeLetters( String s, char rem )
	{
		String cleaned = "";
		int loc = s.indexOf(rem);
		//System.out.println(loc);
		//System.out.println(s.substring(0, loc));
		//System.out.println(s.substring(loc+1, s.length()));
		while(loc >= 0)
		{
			//cleaned += s.substring(loc);
			//cleaned += s.substring(loc + 1, s.length());
			s = s.substring(0, loc) + s.substring(loc+1, s.length());
			loc = s.indexOf(rem);
		}
		cleaned += s;
		return cleaned;
	}
}