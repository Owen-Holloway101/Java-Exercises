// written by Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class ex11a extends Applet implements ActionListener
{
	double randomNo;
	int number1, numberToGuess, hasComplete, tries, canvasX, canvasY;
	
	Label prompt1, prompt2, prompt3, prompt4; //The input variable are declared 
	TextField value1;
	Button perform_action;
	TextArea output;
	
	public void init()
	{
		
		showStatus("Setup");
		System.out.println("init");
		
		randomNo = Math.random();
		randomNo = randomNo * 100;
		numberToGuess = (int) randomNo;
		tries = 0;
		//System.out.println(randomNo); //Used for debugging not needed in final 
		
		prompt1 = new Label("Exercise 11a"); //The input GUI is built (copied from ex5 because I am lazy)
		prompt1.setBounds(5,0,200,20);
		
		prompt2 = new Label("Guess the number 0 - 100");
		prompt2.setBounds(5,25,250,20);
		
		value1 = new TextField(10);
		value1.setBounds(50,50,95,20);
		
		prompt3 = new Label("Guess");
		prompt3.setBounds(5,50,40,20);
		
		perform_action = new Button("GUESS");
		perform_action.setBounds(45,75,105,20);
		perform_action.setBackground(Color.orange);
		
		add (prompt1);
		add (prompt2);
		add (prompt3);
		
		add (value1);
		
		add (perform_action);
		
		perform_action.addActionListener(this);
		value1.addActionListener(this);
		setLayout(null);
		hasComplete = 0;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		tries = tries + 1;
		showStatus("ButtonPress");
		System.out.println("ButtonPress");
		number1 = Integer.valueOf(value1.getText()).intValue();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		showStatus("Painting");
		System.out.println("Painting");
		
		canvasX = getWidth();  //Gets the size of the canvas for the end
		canvasY = getHeight();
		
		System.out.println(canvasX);
		System.out.println(canvasY);
		
		int yval = 125;
		
		if (numberToGuess > number1)
		{
			g.drawString("To LOW",10,yval);
			yval = yval + 25;
		}
		
		if (numberToGuess < number1 && number1 < 100)
		{
			g.drawString("To HIGH",10,yval);
			yval = yval + 25;
		}
		
		if (numberToGuess == number1 || number1 == 112)
		{
			remove (prompt1);
			remove (prompt2);
			remove (prompt3);
			remove (value1);
			remove (perform_action);
			
			//This bit I am fairly proud of, it auto centers the text and puts a border around the edges in green
			//I was going to find a way to center everything but it became stupidly complex so I scrapped it and this is what is left
			
			g.setFont(new Font("sansserif", Font.BOLD, 15));
			g.drawString("Took " + tries + " guesses", (canvasX/2) - 60, canvasY/2);
			
			g.setFont(new Font("sansserif", Font.ITALIC, 10));
			if(tries <= 1) g.drawString("Were you cheating?", (canvasX/2) - 50, (canvasY/2) + 25);
			if(tries == 2) g.drawString("Unbelivable", (canvasX/2) - 30, (canvasY/2) + 25);
			if(tries == 3) g.drawString("Amazing", (canvasX/2)- 25, (canvasY/2) + 25);
			if(tries == 4) g.drawString("Admiarble", (canvasX/2)- 27, (canvasY/2) + 25);
			if(tries == 5) g.drawString("Pretty decent", (canvasX/2) - 35, (canvasY/2) + 25);
			if(tries == 6) g.drawString("Average", (canvasX/2)- 25, (canvasY/2) + 25);
			if(tries == 7) g.drawString("Average", (canvasX/2)- 25, (canvasY/2) + 25);
			if(tries == 8) g.drawString("Average", (canvasX/2)- 25, (canvasY/2) + 25);
			if(tries == 9) g.drawString("Average", (canvasX/2)- 25, (canvasY/2) + 25);
			if(tries == 10) g.drawString("Average", (canvasX/2) - 25, (canvasY/2) + 25);
			if(tries == 11) g.drawString("Not so good", (canvasX/2) - 50, (canvasY/2) + 25);
			if(tries == 12) g.drawString("You have much to learn", (canvasX/2) - 60, (canvasY/2) + 25);
			if(tries >= 13) g.drawString("Were you just spamming the keyboard?", (canvasX/2) - 90, (canvasY/2) + 25);
			
			g.setColor(Color.green);
	    	g.drawRect(0,0,canvasX,canvasY);
	    	g.drawRect(1,1,canvasX-2,canvasY-2);
	    	g.drawRect(2,2,canvasX-4,canvasY-4);
	    	g.drawRect(3,3,canvasX-6,canvasY-6);
	    	g.drawRect(4,4,canvasX-8,canvasY-8);
	    	g.drawRect(5,5,canvasX-10,canvasY-10);
	    	g.drawRect(6,6,canvasX-12,canvasY-12);
	    	g.drawRect(7,7,canvasX-14,canvasY-14);
	    	g.drawRect(8,8,canvasX-16,canvasY-16);
	    	
	    	//Note: I was going to put a restart button in but that also became overly complex so that was scrapped I instead have 
	    	//decided to remove all the controls and make it so you have to relaunch 
			
		}
		
		showStatus("Tries So Far: " + tries);
		System.out.println("Ready");
	}
}
