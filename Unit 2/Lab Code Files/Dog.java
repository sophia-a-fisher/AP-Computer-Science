//Sophia Fisher

public class Dog
{
   private int age;
   private String name;
   
   public Dog(String n)
   {
      age = 1;
      name = n;
   }
   
   public Dog(String n, int a)
   {
      age = a;
      name = n;
   }
   
   public void increaseAgeByOne()
   {
      age = age + 1;
   }   
   
   public int getPeopleAge(int val)
   {
      int ans = age * val;
      return ans;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String toString()
   {
      return "Dog - " + name + "" + age;
   }
      
}