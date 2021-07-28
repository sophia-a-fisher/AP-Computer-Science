//Sophia Fisher
//15 October 2019

public class Ifs
{
   public static void main (String[] args)
   {
      /*int total = 1000;
      if(total <= 25)
      {
         System.out.println("Cat");
      }
      
      if(total = 10)
      {
         System.out.println("Cat");
      }*/
      
      /*int aplus = 990;
      if(aplus > 10)
      {
         System.out.println(">100");
      }
      
      else
      {
         System.out.println("!> 100");
      }*/
      
      /*int one = 6;
      int two = 150;
      
      if(one>6 || two > 200)
      {
         System.out.println("aplus");
      }
      
      else if (one<=6 && two<200)
      {
         System.out.println("compu sci");
      }*/
      
      int num = 67;
      if(num>50)
      {//1
         if(num>60)
         {//2
            if(num>70)
            {//3
               System.out.println(">70");
            }//3
            else
            {//4
               System.out.println(">60 and <70");
            }//4
         }//2
         
         else
         {//5
            System.out.println(">50 and <60");
         }//5
      }//1
      
      else
      {//6
         System.out.println("<50");
      }//6
   }
}