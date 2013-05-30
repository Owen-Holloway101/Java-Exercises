//  TwentythreeMatches.java
//  GUI template for TwentythreeMatches

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SDLC_23_Matches extends Applet implements ActionListener {
	Label chooseMatches, won;
	Button one, two, three, reset;

	Double random_number;

	// data items required
	int user_choice, comp_choice, remaining_matches = 23, canvasX, canvasY,
			haswon = 0;

	public void init() {
		chooseMatches = new Label("Choose number of matches");
		chooseMatches.setBounds(10, 10, 1000, 20);

		one = new Button("One");
		one.setBounds(10, 40, 50, 20);
		two = new Button("Two");
		two.setBounds(70, 40, 50, 20);
		three = new Button("Three");
		three.setBounds(130, 40, 50, 20);
		reset = new Button("Reset");
		reset.setBounds(130, 40, 50, 20);

		add(chooseMatches);
		add(one);
		add(two);
		add(three);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		reset.addActionListener(this);
		
		setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		// enter your code for user's button actions and algorithm

		if (e.getSource() == one) {
			remaining_matches = remaining_matches - 1;
			if (remaining_matches <= 0) {
				haswon = 1;
				win();
			}
			else 
			computer_go();
		}

		if (e.getSource() == two) {
			remaining_matches = remaining_matches - 2;
			if (remaining_matches <= 0) {
				haswon = 1;
				win();
			}
			else
			computer_go();
		}

		if (e.getSource() == three) {
			remaining_matches = remaining_matches - 3;
			if (remaining_matches <= 0) {
				haswon = 1;
				win();
			}
			else
			computer_go();
		}

		if (e.getSource() == reset) {
			
			System.out.println("reset_pressed");
			
			remaining_matches = 23;
			
			if (haswon == 3) remove(won);
			
			remove(reset);
			
			reset = new Button("Reset");
			reset.setBounds(130, 40, 40, 20);
			
			add(chooseMatches);
			add(one);
			add(two);
			add(three);
			
			comp_choice = 0;
			
			setBackground(Color.lightGray);
			
			haswon = 0;
			repaint();
		}
		repaint();

		if (remaining_matches < 0) {
			remove(one);
			remove(two);
			remove(three);
		}

		if (remaining_matches < 2) {
			remove(two);
			remove(three);
		}

		if (remaining_matches < 3) {
			remove(three);
		}
	}

	public void computer_go() {
		// enter your code for computer's algorithm

		if(remaining_matches > 3) {
		random_number = (Math.random() * 3) + 1;
		System.out.println("Random Number: " + random_number);
		comp_choice = random_number.intValue();
		remaining_matches = remaining_matches - comp_choice;
		}
		
		else if(remaining_matches == 3) {
			remaining_matches = remaining_matches - 2;
		}
		
		else 
			remaining_matches = remaining_matches - 1;
		repaint();
		
		if (remaining_matches <= 0) {
			haswon = 2;
			win();
		}
		
	}

	public void win() {
		System.out.println("Has won: " + haswon );
		repaint();
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		
		if (haswon == 0) {
			g.drawString("The computer took " + comp_choice + " matches", 10, 120);
			g.drawString("The total number of matches", 10, 160);
			g.drawString("left is now " + remaining_matches,10 , 180);
		}
		
		if (haswon == 1) {

			System.out.println("Has won: 1" );
			
			remove(reset);
			remove(one);
			remove(two);
			remove(three);
			remove(chooseMatches);

			reset = new Button("Reset");
			reset.setBounds(60, 40, 60, 20);

			won = new Label("COMPUTER WON!");
			won.setBounds(35, 10, 120, 20);
			 
			add(won);
			add(reset);
			
			reset.addActionListener(this);
			
			setBackground(Color.red);
			
			haswon = 3;
		}

		if (haswon == 2) {

			System.out.println("Has won: 2" );
			
			remove(reset);
			remove(one);
			remove(two);
			remove(three);
			remove(chooseMatches);

			reset = new Button("Reset");
			reset.setBounds(70, 40, 60, 20);

			won = new Label("YOU WON!");
			won.setBounds(60, 10, 60, 20);
			
			add(won);
			add(reset);
			
			reset.addActionListener(this);
			
			setBackground(Color.green);
			
			haswon = 3;
		}
		
		this.setSize(200, 200);
	}
}
