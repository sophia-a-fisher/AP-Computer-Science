//Sophia Fisher
//October 31 2019

import java.util.Random;
import javax.swing.JFrame;

public class Randomness extends JFrame
{
   static Random test = new Random();
   private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
   
   public Randomness()
   {
      super("Spooky Generator");
      setSize(WIDTH, HEIGHT);
      
      getContentPane().add(new Spooky());
      
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args)
   {
      
      System.out.println("Random number: " + getRandomInt(10));
      System.out.println("Random number: " + getRandomInt(100));
      System.out.println("Random number: " + getRandomInt(5));
      System.out.println("Random number: " + getRandomInt(20));
      System.out.println("Random number: " + getRandomInt(1000));
      
      Randomness testing = new Randomness();
   }
   
   public static int getRandomInt()
   {
      int myInt;
      myInt = test.nextInt();
      return myInt;
   }
   
   public static int getRandomInt(int x)
   {
      int myInt;
      myInt = test.nextInt(x);
      return myInt;
   }
   
}