import java.applet.Applet;
import java.awt.*; 

public class debug extends Applet
{
	int n, m, sum, diff;
	public void init()
	{
		n = 25;		//initialise values of n and m
		m = 6;
		sum = n + m;
		diff = n - m;	
} 
public void paint (Graphics g)
{
	g.setFont(new Font("Serif", Font.BOLD, 13));
	g.setColor(new Color(255,0,0));
	g.drawString("The original values are " + n +  " and "  + m, 25, 25);
	g.drawString("The sum is " + sum, 25, 50);
	g.drawString("The difference is " + diff, 25, 75);
	}
}