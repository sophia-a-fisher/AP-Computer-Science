//Sophia Fisher

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample
{
   public static void main(String[] args)
   {
      ArrayList<Integer> ray;
      ray = new ArrayList<Integer>();
      
      ray.add(23);
      ray.add(11);
      ray.add(53);
      ray.add(60);
      ray.add(75);
      System.out.println(ray);
      Collections.rotate(ray,2);
      System.out.println(ray);
      Collections.rotate(ray,2);
      Collections.reverse(ray);
      System.out.println(ray);
        
   }

}
