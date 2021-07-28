//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class RecursiveBoxes extends JPanel
{
	public RecursiveBoxes()
	{
		setSize(640,480);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);
		window.setColor(Color.ORANGE);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		
		window.drawString("Drawing Boxes Using Recursion ",20,80);
		drawBoxes(window,10,10);
	}

	public void drawBoxes(Graphics window, int x, int y)
	{
		//base case
			window.setColor(Color.BLUE);
         if(x<100&&y<100)
         {
			   window.drawRect(90+x, 90+y, 20+x, 20+x);
		   	drawBoxes(window, x+10, y+10);
         }


	}
}