import java.applet.Applet; 	//Applet class
import java.awt.*;	    	//Graphics class

/*
An introductory class to illustrate the use of Graphics objects,
Fonts and Colors. Paint (Graphics g) is one of the standard 
methods which is always used in a java applet. In this case
we have added a few graphics to it.

Adapted by Owen Holloway GYC Hobart using Eclipse and realj IDE's 
*/

public class ex1 extends Applet 
{
	public void paint (Graphics g)
    {
    	g.setFont(new Font("serif", Font.PLAIN, 13)); //Text, square and circle 
    	g.setColor(new Color(0,0,0));
    	g.drawString("Hello World",62,69);
    	g.setFont(new Font("sansserif", Font.ITALIC, 11));
    	g.setColor(new Color(0,0,0));
    	g.drawString("Linux Calling",62,81);
    	g.setColor(new Color(35,150,45));
    	g.drawRect(50,20,100,100);
    	g.setColor(new Color(35,150,45));
    	g.drawOval(50,20,100,100);
    	g.setColor(Color.blue);            //Multicoloured box at bottom (Its actually multiple boxes with no pixels between them)
    	g.fillRect(50,130,20,60);
    	g.setColor(Color.red);
    	g.fillRect(70,130,20,60);
    	g.setColor(Color.green);
    	g.fillRect(90,130,20,60);
    	g.setColor(Color.yellow);
    	g.fillRect(110,130,20,60);
    	g.setColor(Color.blue);
    	g.fillRect(130,130,20,60);
    	g.setColor(new Color(50,18,255)); //Blue boxes with red borders
    	g.drawRect(10,20,30,170);
    	g.setColor(new Color(50,18,255));
    	g.drawRect(160,20,30,170);
    	g.setColor(new Color(200,9,10));
    	g.fillRect(11,21,29,169);
    	g.setColor(new Color(200,9,10));
    	g.fillRect(161,21,29,169);
    }
}
