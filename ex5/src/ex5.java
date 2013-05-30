import java.applet.Applet;
import java.awt.*;

/* Simple class to demonstrate the use of Graphics Components. It provides the user interface to add two numbers. (We will complete the extended class to actually perform the addition is the next exercise.)  */ 

public class ex5 extends Applet
{
	Label myPrompt1, myPrompt2, myPrompt3, myPrompt4, myPrompt5;	//declare prompts (Labels)
	TextField value1, value2;		//declare user input (text)
	Button addButton;			//declare a button to start addition
	//The init method sets up the GUI components that have been declared globally. 
	//To do this we must:
	//	- "instantiate" the components using the "new" command. This provides space in            	    memory for the components.
	//	- "add" the components to the applet window, in the  left to right, up to down order in   	    which they are added in init
	
	public void init()
	{
		myPrompt1 = new Label("This class will add two numbers.");
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
		
		addButton = new Button("Press to add");
		addButton.setBounds(55,100,85,20);
		addButton.setBackground(Color.green);
		
		add (myPrompt1);
		add (myPrompt2);
		add (myPrompt3);
		add (myPrompt4);
		
		add (value1);
		add (value2);
		
		add (addButton);
		
		setLayout(null);
	}
}