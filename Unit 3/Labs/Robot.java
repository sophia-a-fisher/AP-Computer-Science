//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      
      window.setColor(Color.GREEN);
      window.fillOval(330, 120, 25, 25);
      window.fillOval(460, 120, 25, 25);
      
      window.setColor(Color.BLACK);
      window.fillOval(390, 150, 25, 15); 
      
      window.setColor(Color.RED);
      window.drawArc(340, 150, 130, 40, 0, -180);


		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.fillRect(330, 220, 150, 100);
      
      window.setColor(Color.BLACK);
      window.drawRect(330, 220, 150, 100);
            
      window.setColor(Color.BLACK);
      window.drawLine(330, 220, 230, 140);
      window.drawLine(480, 220, 580, 120);   
   }

   public void lowerBody( Graphics window )
   {
      window.setColor(Color.GRAY);
      window.fillRect(330, 350, 150, 100);
      
      window.setColor(Color.YELLOW);
      window.drawRect(330, 350, 150, 100);
      
      window.setColor(Color.BLACK);
      window.drawLine(330, 450, 230, 550);
      window.drawLine(480, 450, 580, 550);   
      
   }
}