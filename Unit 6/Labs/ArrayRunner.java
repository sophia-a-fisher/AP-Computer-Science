//Sophia Fisher

public class ArrayRunner
{

   public static void changeOne(int[] ray)
   {
      ray[0] = 0;
      ray[1] = 1;
   }
   
   public static void changeTwo(int[] ray)
   {
      ray = new int[5];
      ray[0] = 2;
      //System.out.println(ray);
      
      String output = "";
      for(int spot = 0; spot < ray.length; spot++)
      {
         output = output+ray[spot] + "";
      }
      System.out.println(output);

   }
   
   public static void main(String[] args)
   {
      Array test = new Array();
      //System.out.println(test);
      //int[] nums = {1,2,3,4,5};
      changeTwo(test.nums);
      System.out.println(test);
      
   }
   
}