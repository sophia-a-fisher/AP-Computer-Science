//(c) A+ Computer Science
// www.apluscompsci.com

//graphics example for rectangles

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Rectangles extends Canvas
{
	public Rectangles()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Squares - Rectangles", 10, 10);

		window.setColor(Color.BLUE);
		//fillRect(int x1, int y1, int width, int height)
		window.fillRect(150, 300, 100, 20 );

		window.setColor(Color.GRAY);
		window.fillRect(200,80,50,50);

		window.setColor(Color.RED);
		window.drawRect(320,370,40,40);

		window.setColor(Color.BLUE);
		window.fillRect(100,180,50,50);

		window.setColor(Color.ORANGE);
		window.drawRect(520,250,90,20);
	}
}