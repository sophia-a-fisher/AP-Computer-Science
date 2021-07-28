//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

//design and create
//your Toy class
 public class Toy
 {
   private String _name = "";
   private int count = 0;
   public Toy(String name)
   {
      _name = name;
      count = 1;
   }
   
   public String getName()
   {
      return _name;
   }
   
   public int getCount()
   {
      return count;
   }
   
   public void setCount(int number)
   {
      count = number;
   }
   
   public String toString()
   {
      String output = _name + " " + count;
      return output;
   }
   
   
 }