//Sophia Fisher

public class Array
{
   int[] nums = {5,4,3,2,1};
   
   public Array()
   {
      //nums = {5,4,3,2,1};
      //System.out.println(nums.length);
   }
   

   
   public String toString()
   {
      String output = "";
      for(int spot = 0; spot < nums.length; spot++)
      {
         output = output+nums[spot] + "";
      }
      return output;
   }
}