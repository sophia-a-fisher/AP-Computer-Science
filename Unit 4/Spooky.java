//Sophia Fisher
//October 31 2019

import java.awt.*;
public class Spooky extends Canvas
{

   public Spooky()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }
   
   public void paint( Graphics window )
   {
      pumpkin(window);
   }
   
   public void pumpkin( Graphics window )
   {
      //prints out the drawing onto the screen
      //window.setColor(Color.BLUE);
      //window.drawString("SMILEY FACE LAB ", 35, 35);
      Color darkOrange = new Color(150,45,30);

      window.setColor(Color.ORANGE);
      window.fillOval( 210, 100, 400, 300 );
      
      window.setColor(darkOrange);
      window.fillArc(210,100,400,300, 90, 180);
      
      window.setColor(Color.BLACK);
      window.fillArc(290, 150, 100,50, 0,180);
      window.fillArc(420, 150, 100,50, 0,180);
      window.fillPolygon(new int[] {300,310,290}, new int[] {200,230,310}, 3);
      window.fillPolygon(new int[] {310,320,310}, new int[] {310,230,310}, 3);
      window.fillPolygon(new int[] {300,310,290}, new int[] {200,230,310}, 3);
      
      //window.drawArc(310, 350, 200, 80, 0, -180);
      
      window.setColor(Color.BLACK);
      window.drawString("Happy Halloween" , 350, 10);


   }
      
}