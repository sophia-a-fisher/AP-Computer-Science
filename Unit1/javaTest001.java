public class javaTest001
{
   public static void main(String[] args)
   {
      System.out.println("6 - 5 == " + (6-5));
      System.out.println("6 + 5 == " + (6+5));
      System.out.println("6 * 5 == " + (6*5));
      System.out.println("6 / 5 == " + (6/5));
      System.out.println("6 / 5 == " + (6.0/5.0));
      
      System.out.println("6.1 - 5.2 == " + (6.1-5.2));
      System.out.println("6.1 + 5.2 == " + (6.1+5.2));
      System.out.println("6.1 * 5.2 == " + (6.1*5.2));
      System.out.println("6.1 / 5.2 == " + (6.1/5.2));
      
      System.out.println(1/2.0);
      System.out.println(1.0/2);
      //prints a real number because there is one real number in expression
      
      //System.out.println(1/0);
      System.out.println(0/1);
      
      System.out.println(2%3);
      System.out.println(3%2);
      
      System.out.println(9%3);
      System.out.println(9.2%3);
      
      int num = 27;
      num *= 2;
      System.out.println(num);
      num /=5;
      System.out.println(num);
      num = num + 4 / 2 - 8;
      System.out.println(num);
      num = (4+5)/2+7;
      System.out.println(num);

      
   }

}
