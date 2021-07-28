//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

class StringRemover
{
   private String remove;
   private String sentence;

	public StringRemover( String sen, String rem )
	{
      remove = rem;
      sentence = sen;
      //System.out.println(sentence);
	}

	public void removeStrings()
	{
      //System.out.println(sentence);
		String cleaned = "";
		int loc = sentence.indexOf(remove);
		//System.out.println(loc);
		//System.out.println(s.substring(0, loc));
		//System.out.println(s.substring(loc+1, s.length()));
		while(loc >= 0)
		{
			//cleaned += s.substring(loc);
			//cleaned += s.substring(loc + 1, s.length());
			if(loc != 0)
			{
				sentence = sentence.substring(0, loc-1) + sentence.substring(loc+remove.length(), sentence.length());
			}
			
			else
			{
				sentence = sentence.substring(0, loc) + sentence.substring(loc+remove.length(), sentence.length());
			}
			loc = sentence.indexOf(remove);
		}
		cleaned += sentence;
		
	}

	public String toString()
	{
		return sentence;
	}
}