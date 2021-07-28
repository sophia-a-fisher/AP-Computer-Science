/*Sophia Fisher
  3 September 2019
*/

//the class will accept input for length and width and return a perimeter
import java.util.Scanner;

public class RectRunner
{
   /*public double calcPerimeter(int length, int width)
   {
      return (double)(2*length) + (2*width);
   }*/

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter a width: ");
      int width = keyboard.nextInt();
      
      System.out.print("Please enter a length: ");      
      int length = keyboard.nextInt();
      
      double perimeter = (double)(2*length) + (2*width);
      System.out.println("The perimeter is: " + perimeter);     
      
      //commented below is previous attempt using a method
      
      /*RectRunner myRunner = new RectRunner();
      System.out.println(myRunner.calcPerimeter(12,5));
      System.out.println(myRunner.calcPerimeter(131,75));
      System.out.println(myRunner.calcPerimeter(20,25));
      System.out.println(myRunner.calcPerimeter(9,256));
      System.out.println(myRunner.calcPerimeter(36,72));
      System.out.println(myRunner.calcPerimeter(8,6));
      System.out.println(myRunner.calcPerimeter(18,16));
      */
   }
}
