import java.applet.Applet; 
import java.awt.*;
import java.awt.event.*;

public class ex10a extends Applet implements ActionListener
{
	double number1, number2, sum, prod, quot; //Real numbers need to be doubles therefore they are declared as such
	
	Label prompt1, prompt2, prompt3, prompt4; //The input variable are declared 
	TextField value1, value2;
	Button perform_action;
	
	public void init ()
	{
		prompt1 = new Label("Exercise 10a"); //The input GUI is built (copied from ex5 because I am lazy)
		prompt1.setBounds(5,0,200,20);
		
		prompt2 = new Label("Finds sum, product and quotient and largest");
		prompt2.setBounds(5,25,250,20);
		
		value1 = new TextField(10);
		value1.setBounds(50,50,95,20);
		
		prompt3 = new Label("No.1");
		prompt3.setBounds(5,50,40,20);
		
		value2 = new TextField(10);
		value2.setBounds(50,75,95,20);
		
		prompt4 = new Label("No.2");
		prompt4.setBounds(5,75,40,20);
		
		perform_action = new Button("Run");
		perform_action.setBounds(45,100,105,20);
		perform_action.setBackground(Color.cyan);
		
		add (prompt1);
		add (prompt2);
		add (prompt3);
		add (prompt4);
		
		add (value1);
		add (value2);
		
		add (perform_action);
		
		perform_action.addActionListener(this);
		value2.addActionListener(this);
		setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		number1 = Double.valueOf(value1.getText()).doubleValue();
		number2 = Double.valueOf(value2.getText()).doubleValue();
		sum=number1+number2;
		prod=number1*number2;
		quot=number1/number2;
		System.out.println(value1);
		System.out.println(value2);
		repaint();
	}
	
	public void paint (Graphics g)
	{
		int yval = 150;
		g.drawString("No.1: " + number1,10,yval);
		yval = yval + 25;
		g.drawString("No.2: " + number2,10,yval);
		yval = yval + 25;
		g.drawString("Sum: " + sum,10,yval);
		yval = yval + 25;
		g.drawString("Prod: " + prod,10,yval);
		yval = yval + 25;
		g.drawString("Quot: " + quot,10,yval);
		yval = yval + 25;
		this.setSize(200,500);
		g.drawString("The largest: " + Math.max(number1,number2), 10, yval);
		System.out.println("paint");
	}
}
