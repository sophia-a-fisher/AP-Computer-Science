class Fun
{
   public int fun(int x, int y)
   {
     if(x == 0)
     {
         return x;
     }   
     else
     {
         return x + fun(y-1, x);
     }
   }
   
   public static void main(String args[])
   {
      Fun test = new Fun();
      System.out.println(test.fun(4,4));
   }
}