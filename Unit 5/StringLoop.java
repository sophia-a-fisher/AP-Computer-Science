public class StringLoop
{
   public static void main(String[] args)
   {
      String s = "compsci12";
      /*for(int i = 0; i < 8; i++)
      {
         System.out.println(s.charAt(i));
      }*/
      
      for(char c: s.toCharArray())
      {
         System.out.println(c);
      }
   }
}