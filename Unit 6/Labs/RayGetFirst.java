//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher
//Date - 12 December 2019
 
public class RayGetFirst
{
	//method go will return an array
	//containing all values > the first value in the array
	//from the array parameter ray
	public static int[] go(int[] ray)
	{
		
		int count = 0;
		for(int value = 0; value<ray.length;value++)
		{
			if(ray[value]>ray[0])
			{
				count++;
			}
		}
		
		int newArray[] = new int[count];
		int indexCount = 0;
		
		for(int value = 0; value<ray.length;value++)
		{
			if(ray[value]>ray[0])
			{
				newArray[indexCount] = ray[value];
				indexCount++;
			}
		}
		return newArray;
	}
}