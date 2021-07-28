//Sophia Fisher
//4 October 2019

public class MethodChunk
{
   public static void main(String[] args)
   {
      System.out.println(getFirstChunk("cat@kitty"));
      System.out.println(getFirstChunk("odog@jdh@jf"));
      System.out.println(getFirstChunk("@jhsdgu"));
      System.out.println(getFirstChunk("catts"));  
      System.out.println(getFirstChunk("fsgyijvou"));
      System.out.println(getFirstChunk("@dsisd"));
      
      String s = "uil";
      System.out.println(s);
      s = "aplus";
      System.out.println(s);
      
   }
   
   public static String getFirstChunk(String line)
   {
      int stoppingIndex = line.indexOf("@");
      String subString = "";
      
      if (stoppingIndex == -1)
      {
         subString = "aplus";
      }
      
      else if (stoppingIndex == 0)
      {
         subString = "APLUS";
      }
      
      else if (stoppingIndex > 0)
      {
         subString = line.substring(0, stoppingIndex);
      }
      return subString;
   }
}