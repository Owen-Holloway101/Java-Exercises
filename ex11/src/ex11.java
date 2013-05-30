import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//This class is a modification of the previous addition class, but instead of adding //the two numbers it compares them with using an if conditional statement.

public class ex11 extends Applet implements ActionListener
{
	Label myPrompt1, myPrompt2;	//declare prompts (Labels)
	TextField value1, value2;		//declare user input (text)    
	int num1, num2;			//integers displayed in text fields
	
	public void init()
	{
		//instantiate and add components as in previous class
		myPrompt1 = new Label("This class will compare two numbers.");
		myPrompt2 = new Label("Type in the numbers in the spaces.");
		value1 = new TextField(10);
		value2 = new TextField(10);
		add (myPrompt1);
		add (myPrompt2);
		add (value1);
		add (value2);
		
		//We must now tell the class which events to listen to:
		value1.addActionListener(this);
		value2.addActionListener(this);
    }
	
	//ActionPerformed is here used simply to get the values of the two integers
	public void actionPerformed(ActionEvent e)
    {
		num1 = Integer.parseInt(value1.getText());
		num2 = Integer.parseInt(value2.getText());
		repaint();
    }
	
	//paint is used to print out the comparison between the two numbers. An alternate
	//approach would be to use showStatus in the actionPerformed method.
	public void paint (Graphics g)
	{
		if (num1 > num2)
		{
			g.drawString("First number is larger.", 25, 150);
			g.drawString("Maximum value is   " + num1, 25, 200); 
		}
	
		if (num1 == num2)  g.drawString("Numbers are equal.", 25, 150);
		
		if (num1 < num2)
		{
			g.drawString("First number is smaller.", 25, 150);
			g.drawString("Maximum value is  " + num2, 25, 200); 
		}
    }
}