package owen.holloway.applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This class extends the previous class ComponentDemo to actually provide a means of //adding up the numbers. It does this by including an ActionEvent method.
//Additions to ComponentDemo are in bold type.

//The class definition includes "implements ActionListener which tells the class to "listen" for //"events" set of by the user. In this case, the event being listened to is the press of a "button" //in the applet window.

public class ex6 extends Applet implements ActionListener
{
	Label myPrompt1, myPrompt2, myPrompt3, myPrompt4;
	TextField value1, value2;
	Button addButton;
	int num1, num2, answer;		//integers displayed in text fields and their sum	 
	
	public void init()
	{			
		myPrompt1 = new Label("This class will multiply two numbers");
		myPrompt1.setBounds(5,0,200,20);
		
		myPrompt2 = new Label("Type in the numbers in the spaces.");
		myPrompt2.setBounds(5,25,200,20);
		
		value1 = new TextField(10);
		value1.setBounds(50,50,95,20);
		
		myPrompt3 = new Label("No.1");
		myPrompt3.setBounds(5,50,40,20);
		
		value2 = new TextField(10);
		value2.setBounds(50,75,95,20);
		
		myPrompt4 = new Label("No.2");
		myPrompt4.setBounds(5,75,40,20);
		
		addButton = new Button("Press to multiply");
		addButton.setBounds(45,100,105,20);
		addButton.setBackground(Color.green);
		
		add (myPrompt1);
		add (myPrompt2);
		add (myPrompt3);
		add (myPrompt4);
		
		add (value1);
		add (value2);
		
		add (addButton);
		
		//Layout copied from ex5 (and edited to suit application)
		
		addButton.addActionListener(this);   //Tell the class which event to listen to:
		value2.addActionListener(this); 
		setLayout(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	/* This method is automatically called when the button is pressed. 
    	 * The code below 	obtains the text the user has typed in, converts the text to numbers and then finds 	
    	 * and displays the sum of these numbers. */
    	num1 = Integer.parseInt(value1.getText());      //Convert text value1 and value2
    	num2 = Integer.valueOf(value2.getText()).intValue();
    	answer = num1 * num2;			       //Find the sum
    	showStatus(Integer.toString(answer));	       //Display the sum
    	repaint();
    }
    
    public void paint(Graphics g)
    {
    	g.drawString("Product " + answer, 5, 150);
    }
}
