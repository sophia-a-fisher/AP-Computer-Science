//Sophia Fisher
//AP Compu Science 

import java.util.ArrayList;

public class ArrayLists
{
   public static void main(String[] args)
   {
      ArrayList <Integer> ray = new ArrayList<Integer>();
      ray.add(23);
      ray.add(11);
      ray.set(1,5);
      ray.add(4);
      ray.set(0,7);
      ray.add(53);
      System.out.println(ray.set(1,93));
      //ray.add(10,80);
      System.out.println(ray);
      //System.out.println(ray.set(1,95));
      //System.out.println(ray.set(1,97));
      System.out.println(ray.get(3));
      //System.out.println(ray.get(4));
      
      for(Integer num : ray)
      {
         System.out.println(num);
      }
      
      for(int num : ray)
      {
         System.out.println(num);
      }
   }
}