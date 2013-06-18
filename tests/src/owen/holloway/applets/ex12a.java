package owen.holloway.applets;//Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex12a extends Applet implements ActionListener
{
	double number1, number2, answer; //Added the ability to use reals, because ints are a bit restrictive.
	
	int canvasX, canvasY;
	Label prompt1, prompt2, prompt3, prompt4; 
	TextField value1, value2;
	Button add, sub, div, mul, exp;
	
	public void init()
	{
		showStatus("init");
		System.out.println("init");
		
		canvasX = getWidth()/2;
		canvasY = getHeight()/2;
		
		System.out.println(canvasX);
		System.out.println(canvasY);
		
		prompt1 = new Label("Exercise 12a");
		prompt1.setBounds(canvasX - 95,canvasY - 100,200,20);
		
		prompt2 = new Label("Calculator");
		prompt2.setBounds(canvasX - 95,canvasY - 80,250,20);
		
		value1 = new TextField(10);
		value1.setBounds(canvasX - 50,canvasY - 60,100,20);
		
		prompt3 = new Label("No.1");
		prompt3.setBounds(canvasX - 95,canvasY - 60,40,20);
		
		value2 = new TextField(10);
		value2.setBounds(canvasX - 50,canvasY - 40,100,20);
		
		prompt4 = new Label("No.2");
		prompt4.setBounds(canvasX - 95,canvasY - 40,40,20);
		
		add = new Button("+");
		add.setBounds(canvasX - 50,canvasY - 15,50,30);
		add.setBackground(Color.blue);
		
		sub = new Button("-");
		sub.setBounds(canvasX - 50,canvasY + 15,50,30);
		sub.setBackground(Color.red);
		
		div = new Button("/");
		div.setBounds(canvasX,canvasY - 15,50,30);
		div.setBackground(Color.green);
		
		mul = new Button("x");
		mul.setBounds(canvasX,canvasY + 15,50,30);
		mul.setBackground(Color.yellow);
		
		mul = new Button("x");
		mul.setBounds(canvasX,canvasY + 15,50,30);
		mul.setBackground(Color.yellow);
		
		add (prompt1);
		add (prompt2);
		add (prompt3);
		add (prompt4);
		
		add (value1);
		add (value2);
		
		add (add);
		add (sub);
		add (div);
		add (mul);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		value2.addActionListener(this);
		setLayout(null);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		showStatus("ButtonPress");
		System.out.println("ButtonPress");
		number1 = Double.valueOf(value1.getText()).doubleValue();
		number2 = Double.valueOf(value2.getText()).doubleValue();
		if(e.getSource() == add) answer = number1 + number2;
		if(e.getSource() == sub) answer = number1 - number2;
		if(e.getSource() == div) answer = number1 / number2;
		if(e.getSource() == mul) answer = number1 * number2;
		repaint();
	}

	public void paint(Graphics g)
	{
		showStatus("Paint");
		System.out.println("Paint");
		g.drawString("Answer: " + answer,canvasX - 95 ,canvasY + 70);
		showStatus("Ready");
	}
}
