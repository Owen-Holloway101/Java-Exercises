import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class debug extends Applet implements ActionListener
{
	Label myPrompt;
	TextField value1, value2;
	int num1, num2, answer;		
	Button addButton;
public void init()
{
	myPrompt = new Label("This class will multiply two numbers.");
	value1 = new TextField(10);
	value2 = new TextField(10);
	addButton = new Button("Press to add");
	add (myPrompt);
	add (value1);
	add (value2);
	add (addButton);
	addButton.addActionListener((ActionListener) this);   
	value1.addActionListener((ActionListener) this);
}
public void actionPerformed(ActionEvent e)
{
	num1 = Integer.parseInt(value1.getText());      
	num2 = Integer.valueOf(value2.getText()).intValue();
	answer = num1 + num2;
	showStatus("Answer " + answer);
	}
}