//Sophia Fisher
//17 September 2019

public class Formatting
{

   public static void main(String[] args)
   {
      Formatting test = new Formatting();
      test.formatNumbers();
   }
   
   public void formatNumbers()
   {
      //System.out.print("cat");
      
      //specifying number of decimal places
      System.out.printf("%.2f\n", 300.5438);
      System.out.printf("%.3f\n", 300.5438);
      //the f specifies data type (otherwise runtime error)
      
      //specifying the amount of spaces number gets
      System.out.printf("%10.2f\n", 300.5438);
      System.out.printf("%4.2f\n", 300.5438);
      //still prints if the number is larger than spaces specified
      
      //prints out 0s in all empty spaces
      System.out.printf("%010.2f\n", 300.5438);
      
      //prints out x after number is printed
      System.out.printf("%10.2fx\n", 300.5438);
      
      //- specifies that the number appears on the left of the screen
      System.out.printf("%-10.2fx\n", 300.5438);
    }

}