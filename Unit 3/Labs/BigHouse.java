//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.fillRect(150, 100, 400, 250);
      window.fillRect(150, 350, 150, 150);
      window.fillRect(400, 350, 150, 150);
      
      window.setColor(Color.YELLOW);
      window.fillRect(200, 200, 100, 100);
      window.fillRect(400, 200, 100, 100);
      
      window.setColor(Color.GREEN);
      window.fillRect(75, 50, 550, 100);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );

   }
}