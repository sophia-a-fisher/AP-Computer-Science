//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList;
  // private static int count = 0;
   //private static String input = "";
	private static boolean equals = false;
   private static Toy greatestElement;
   private static int greatestCount = 0;
   private static String output = "";

	public ToyStore()
	{
      toyList = new ArrayList<Toy>();
	}
   
   public void loadToys(String[] toy)
   {
     //count = 0;
	   equals = false;
      toyList.add(new Toy(toy[0]));
      //System.out.println(toyList);
      for(int i = 1; i < toy.length; i++)
      {
    	  equals = false;
         //System.out.println(toyList);
         for(int j = 0; j < toyList.size(); j++)
         {
            if(toyList.get(j).getName().equals(toy[i]))
            {
               equals = true;
               toyList.get(j).setCount(toyList.get(j).getCount()+1);
               break;
            }
            
         }
         if(!equals)
         {
             toyList.add(new Toy(toy[i]));
         }
         
      }

   }
  
  	public Toy getThatToy( String nm )
  	{
      for(Toy element: toyList)
      {
         if(element.getName().equals(nm))
         {
            return element;
         }
      }
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
      greatestCount = 0;
      for(Toy element: toyList)
      {
         if(element.getCount()> greatestCount)
         {
            greatestElement = element;
            greatestCount = element.getCount();
         }
      }
  		return greatestElement.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
      output = "[";
      if(toyList.size()>0)
      {
            for(Toy element:toyList)
            {
               output += element.getName() + " " + element.getCount() + ", ";
            }
            output = output.substring(0,output.length()-2);
      }

       output += "]";
	   return output;
	}
}