//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();	
		System.out.println("I am Sam I am - letter to remove a");
		System.out.println(test.removeLetters("I am Sam I am", 'a'));
		System.out.println("");
		
		System.out.println("ssssssssxssssesssssesss - letter to remove s");
		System.out.println(test.removeLetters("ssssssssxssssesssssesss", 's'));
		System.out.println("");
		
		System.out.println("qwertyqwertyqwerty - letter to remove a");
		System.out.println(test.removeLetters("qwertyqwertyqwerty", 'a'));
		System.out.println("");
		
		System.out.println("abababababa - letter to remove b");
		System.out.println(test.removeLetters("abababababa", 'b'));
		System.out.println("");
		
		System.out.println("abaababababa - letter to remove x");
		System.out.println(test.removeLetters("abaababababa", 'x'));
		System.out.println("");
	}
}