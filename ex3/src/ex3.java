import java.applet.Applet;
import java.awt.*;

//This class is a development of the PaintDemo class in introductory exercise 1. It //demonstrates simple Graphics with colors and fonts declared and then instantiated in init.

public class ex3 extends Applet 
{

//This class is similar to the PaintDemo class except that the init method (another standard //method used in java applets) is used to initialise the colors and fonts used in paint. To //transfer the information from init to paint we must first declare the color and font as "objects" //that can be accessed in both paint and init.
	
	Color color1;
	Color color2;
	Color color3;	//declare three Color objects
	Font font1;			//declare a Font object    
	
	//Exercise Fonts + Colors
	Color penguinYellow;
	Font penguinFont;
	
	
//The init method is used in this case to set some global colours and fonts.

	public void init() 
	{
		//Color and font methods
		
		setBackground(Color.black);
		color1 = new Color(255,50, 50);
		color2 = color1.brighter();
		color3 = new Color(50, 50, 255);
		font1 = new Font("SansSerif", Font.ITALIC, 14);
		
		//Exercise init() methods
		
		penguinYellow = new Color(255, 204, 0);
		penguinFont = new Font("Serif", Font.BOLD, 15);
	}
	
//The paint method can now make use of the colours and fonts defined in init().
	
	public void paint (Graphics g) 
	{
		System.out.println("Paint");
		g.setColor(color1);
		g.drawRect(20,20,130,60);
		g.setColor(color2);
		g.fillOval(20,20,130,60);
		g.setColor (color3);
		g.setFont(font1);
		g.drawString("Hello World", 50, 55);
		
		//Exercise paint() methods 
		
		g.setColor(penguinYellow);
		g.drawOval(20, 115, 130, 60);
		g.setFont(penguinFont);
		g.drawString("Hello Dave", 50, 150);
	}
}