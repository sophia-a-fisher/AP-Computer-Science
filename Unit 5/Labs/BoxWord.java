//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

public class BoxWord
{
	public static String go( String word )
	{
		String output="";
      for(int i=0; i<word.length(); i++)
      {
   
         
         if(i==0)
         {
            output += word;
            if(word.length() == 1)
            {
               return output + "\n";
            }
         }         
         
         for(int h=1; h<=word.length(); h++)
         {
            if(i>0 && h==1 && i !=word.length()-1)
            {
               output += word.substring(i,i+1);
            } 
            
            if(i>0 && h!=1 && h!= word.length() && i!= word.length()-1)
            {
               output += " ";
            }
            
                        
            if(i==word.length()-1)
            {
               output += word.substring(word.length()-h,word.length()-h+1);
            }
            
            if(i>0 && h == word.length()-1 && i !=word.length()-1)
            {
               output += word.substring(word.length()-i-1,word.length()-i);
            }

           
         }
                  
         //System.out.println("cat");

         output += "\n";
      }

		return output+"\n";
	}
}