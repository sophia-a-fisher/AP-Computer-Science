//(c) A+ Computer Science
// www.apluscompsci.com

//sound example using AudioClip

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.awt.Canvas;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sounds extends Canvas
{
	AudioClip dahSound;

	public Sounds()
	{
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.RED);
		window.drawString("Playing Sounds", 200, 200 );

		try
		{
			File file1 = new File("C:\\Users\\jon\\Documents\\Sophia\\EclipseWorkspace\\JadEcamples\\src\\School_Fire_Alarm-Cullen_Card-202875844.wav");
			URL loc = file1.toURI().toURL();    //put a .wav file in the folder and change your_sound_file
			dahSound = Applet.newAudioClip(loc);
			dahSound.play();
		}
		catch(Exception e)
		{
			System.out.println("You have a problem!");
			e.printStackTrace();
		}
	}
}