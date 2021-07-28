//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
      yPos = y;
      width = wid;
      height = ht;
      color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      if(width == height)
      {
      
         if(height < 200)
         {
         window.setColor(color);
         window.fillOval(xPos - 10, yPos - 10, width + 20, height + 20);
         window.fillRect(xPos, yPos, width, height);
         
         window.setColor(Color.WHITE);
         window.fillOval(xPos + 40, yPos + 40, width - 50, height - 50);
   
         window.setColor(color);
         window.fillOval(xPos + 60, yPos + 60, width - 70, height - 70);
         }
         
         else
         { 
         window.setColor(color);
         window.fillOval(xPos - 20, yPos - 20, width + 50, height + 50);
         window.fillRect(xPos, yPos, width, height);
         
         window.setColor(Color.WHITE);
         window.fillOval(xPos + 40, yPos + 40, width - 50, height - 50);
   
         window.setColor(color);
         window.fillOval(xPos + 60, yPos + 60, width - 70, height - 70);
         }
              

      

      }
      
      if(width < height)
      {
         window.setColor(color);
         window.fillOval(xPos - 15, yPos - 15, width + 30, height + 30);
         window.fillRect(xPos, yPos, width, height);
         
         window.setColor(Color.WHITE);
         window.fillOval(xPos + 40, yPos + 40, width - 50, height - 50);
   
         window.setColor(color);
         window.fillOval(xPos + 60, yPos + 60, width - 70, height - 70);

      }
      
      if (width>height) 
      {
          window.setColor(color);
          window.fillOval(xPos - 20, yPos - 20, width + 50, height + 50);
          window.fillRect(xPos, yPos, width, height);
         
          window.setColor(Color.WHITE);
          window.fillOval(xPos + 40, yPos + 40, width - 50, height - 50);
   
          window.setColor(color);
          window.fillOval(xPos + 60, yPos + 60, width - 70, height - 70);
   
      }
            //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   public int getXPosition()
   {
      return xPos;
   }
   
   public int getYPosition()
   {
      return yPos;
   }
   
   public int getWidth()
   {
      return width;
   }
   
   public int getheight()
   {
      return height;
   }
   
   public Color getColor()
   {
      return color;
   }
   
   public void setXPosition(int _xPosition)
   {
      xPos = _xPosition;
   }
   
      public void setYPosition(int _yPosition)
   {
      yPos = _yPosition;
   }
   
      public void setWidth(int _width)
   {
      width = _width;
   }
   
      public void setHeight(int _height)
   {
      height = _height;
   }
   
      public void setColor(Color _color)
   {
      color = _color;
   }
   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}