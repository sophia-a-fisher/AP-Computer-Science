//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


      Shape test1 = new Shape(50, 220, 300, 300, Color.RED);
      test1.draw(window);
		//instantiate a Shape
		//tell your shape to draw
      
      Shape test4 = new Shape(240, 50, 400, 300, Color.BLACK);
      test4.draw(window);


      Shape test2 = new Shape(500, 250, 150, 200, Color.GREEN);
      test2.draw(window);
		//instantiate a Shape
		//tell your shape to draw

      Shape test3 = new Shape(420, 400, 100, 100, Color.BLUE);
      test3.draw(window);
		//instantiate a Shape
		//tell your shape to draw
      
     	}
}