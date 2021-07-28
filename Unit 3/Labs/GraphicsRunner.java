//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sophia Fisher

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new SmileyFace());
		
		//add other classes to run them 
		//BigHouse, Robot, or ShapePanel 
      
      getContentPane().add(new BigHouse());
      getContentPane().add(new Robot());
      
      getContentPane().add(new ShapePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}