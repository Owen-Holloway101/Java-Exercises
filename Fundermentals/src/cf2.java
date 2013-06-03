import java.applet.Applet;
import java.awt.*;


public class cf2 extends Applet
{
	int b = 46;
	char a;
	
	public void paint(Graphics g)
	{
		a = (char) b;
		g.drawString("a= " + a, 50, 50);
	}
}
