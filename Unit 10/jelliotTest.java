import jeliot.io.*;

public class RecursionTwo
{
   public void run(int x)
   {
      if(x<5)
      {
         run(x+1);
      }
      System.out.println(x);
   }
   
   public static void main(String args[])
   {
      RecursionTwo test = new RecursionTwo();
      test.run(1);
   }
}