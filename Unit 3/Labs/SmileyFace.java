//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }
   //constructor method!
   public void smileyFace( Graphics window )
   {
      //prints out the drawing onto the screen
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.GREEN);
      window.fillOval(280, 200, 60, 40);
      window.fillOval(480, 200, 60, 40);
      
      window.setColor(Color.RED);
      window.drawArc(310, 350, 200, 80, 0, -180);
      
      window.setColor(Color.BLACK);
      window.fillOval(390, 300, 40, 40);


   }
}