class Split
{
   public String recur(String s)
   {
     int len = s. length();
     if(len > 0)
     {
         return s.charAt(len-1) + recur(s.substring(0,len-1));
     }  
     return ""; 
   }
   
   public static void main(String args[])
   {
      Split test = new Split();
      System.out.println(test.recur("applepie"));
   }
}