import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//User enters values from 0 ..49 and class counts values in ranges 0..9, 10..19 etc.

public class ex12 extends Applet implements ActionListener 
{
	int number, zeros, tens, twenties, thirties, forties;
	Label prompt;
	TextField value;
	public void init()
	{
		zeros = 0;		//Initialise all range counts.
		tens = 0;
		twenties = 0;
		thirties = 0;
		forties = 0;
		prompt = new Label("Enter a number between 0 and 49");
		value = new TextField(10);
		add (prompt);
		add (value);
		
		value.addActionListener(this);
	}
	//Class tests if values are between 0..9, then 10..19 etc to 40..49 and maintains
	//a tally of each the total number of entries within each range.
	
	public void actionPerformed (ActionEvent e)
	{
		number =  Integer.parseInt(value.getText());
		if (number < 10) zeros = zeros + 1;
		else
			if (number < 20) tens = tens + 1;
			else
				if (number < 30) twenties = twenties + 1;
				else
					if (number < 40) thirties = thirties + 1;
					else forties = forties + 1;
		value.setText("");			//Clear the text box
		repaint();
		}
	
	public void paint (Graphics g)
	{
		g.drawString ("Values 0 to 9       " + zeros, 25, 50);
		g.drawString ("Values 10 to 19  " + tens, 25, 75);
		g.drawString ("Values 20 to 29  " + twenties, 25, 100);
		g.drawString ("Values 30 to 39  " + thirties, 25, 125);
		g.drawString ("Values 40 to 49  " + forties, 25, 150);
	}
}
