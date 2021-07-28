//(c) A+ Computer Science
// www.apluscompsci.com

//graphics example for polygons

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Canvas;

public class Polygons extends Canvas
{
	public Polygons()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Polygons ", 50, 50);
		
		int[] xPoints = {25,50,75,60,20};
		int[] yPoints = {100,100,125,150,110};
		int nPoints = 5;
		Polygon triangle = new Polygon(xPoints,yPoints,nPoints);

		window.setColor(Color.RED);
		window.fillPolygon(triangle);
	}
}