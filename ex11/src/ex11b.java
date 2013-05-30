// written by Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class ex11b extends Applet implements ActionListener
{
	int hours, pay;
	
	Label prompt1, prompt2, prompt3, prompt4; //The input variable are declared 
	TextField value1;
	Button perform_action;
	
	public void init()
	{
		
		showStatus("Setup");
		System.out.println("init");
		
		prompt1 = new Label("Exercise 11b"); //The input GUI is built (copied from ex11a because I am lazy)
		prompt1.setBounds(5,0,200,20);
		
		prompt2 = new Label("Input hours worked");
		prompt2.setBounds(5,25,250,20);
		
		value1 = new TextField(10);
		value1.setBounds(70,50,30,20);
		
		prompt3 = new Label("Hours:");
		prompt3.setBounds(5,50,40,20);
		
		perform_action = new Button("Calculate");
		perform_action.setBounds(40,75,100,20);
		perform_action.setBackground(Color.orange);
		
		add (prompt1);
		add (prompt2);
		add (prompt3);
		
		add (value1);
		
		add (perform_action);
		
		perform_action.addActionListener(this);
		value1.addActionListener(this);
		setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		showStatus("ButtonPress");
		System.out.println("ButtonPress");
		pay = 0;
		hours = Integer.valueOf(value1.getText()).intValue();
		repaint();
		if (hours <= 35) pay = hours * 15;
		if(hours > 35)
		{ 
			System.out.println(pay);
			pay = pay + ((hours - 35)*25) + 525;
		}
	}
	
	public void paint(Graphics g)
	{
		showStatus("Painting");
		System.out.println("Painting");
		
		g.drawString("Pay: $" + pay,10,150);
		
		showStatus("Ready");
		System.out.println("Ready");
	}
}
