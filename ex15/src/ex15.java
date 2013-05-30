//Owen Holloway GYC
//Uses UI scaler template version 1.1 (fixed some errors in it  though)

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex15 extends Applet implements ActionListener {

	Button action;
	TextField input;
	Label stringOutput;
	int canvasX, canvasY, currCanvasX, currCanvasY;
	int intsInput, UIType;
	int i[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	String buttonLabel;

	public void init() {

		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;
		intsInput = 0;
		buttonLabel = "int " + intsInput;
		UIType = 1;

		UI(); // Object UI elements
		stringOutput = new Label("Number ");

		setLayout(null);
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		currCanvasX = getWidth();
		currCanvasY = getHeight();

		if (!(canvasX == currCanvasX)|!(canvasY == currCanvasY)) {
			removeObjects();
			UI(); // Object UI elements
			canvasX = currCanvasX;
			canvasY = currCanvasY;
		}

		else {

		}
		paintedUI(g); // Graphics UI elements
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Add Actions for (this)

		if (e.getSource() == action | e.getSource() == input) {
			removeObjects();
			if (intsInput < 9) {
				i[intsInput] = Integer.valueOf(input.getText()).intValue();
				intsInput++;
				buttonLabel = "int " + intsInput;
				UIType = 1;
				UI();
				
			} else if (intsInput >= 10) {
				intsInput = 0;
				UIType = 2;
				this.setSize(200,250);
				repaint();
				
			} else if (intsInput == 9) {
				i[9] = Integer.valueOf(input.getText()).intValue();
				intsInput++;
				buttonLabel = "Show Ints";
				UIType = 2;
				this.setSize(200,250);
				repaint();
			}

			System.out.println("intsInput: " + intsInput);
		}

	}

	public void UI() {
		// TODO Add object UI elements
		// eg: button = new button("button");
		// button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
		// button.setBackground(Color.green);
		// button.addActionListener(this);
		// add(button);

		if (UIType == 1) {
			action = new Button(buttonLabel);
			action.setBounds((currCanvasX / 2) - 50, 40, 100, 20);
			action.setBackground(Color.green);
			action.addActionListener(this);
			add(action);

			input = new TextField();
			input.setBounds((currCanvasX / 2) - 30, 10, 60, 20);
			input.addActionListener(this);
			add(input);
			input.requestFocus();
		}

		if (UIType == 2) {
			/*
			 * int a = 9; while (a <= 9) { stringOutput = new Label("Number " +
			 * a + ": " + i[a]); stringOutput.setBounds(currCanvasX / 2 - 40,60
			 * , 10, 40 + (9 - a) * 20); add(stringOutput); a++; }
			 */
		}

	}

	public void paintedUI(Graphics g) {
		// TODO Add any graphics UI elements
		// eg: g.drawString("Hello World", currCanvasX/2, 40);
		if (UIType == 2) {
			g.drawString("Number 9: " + i[9], 10, 40); // This works under Linux
														// and Mac OS X,
														// inferiour OS's suck
			g.drawString("Number 8: " + i[8], 10, 60);
			g.drawString("Number 7: " + i[7], 10, 80);
			g.drawString("Number 6: " + i[6], 10, 100);
			g.drawString("Number 5: " + i[5], 10, 120);
			g.drawString("Number 4: " + i[4], 10, 140);
			g.drawString("Number 3: " + i[3], 10, 160);
			g.drawString("Number 2: " + i[2], 10, 180);
			g.drawString("Number 1: " + i[1], 10, 200);
			g.drawString("Number 0: " + i[0], 10, 220);
		}
	}

	public void removeObjects() {
		// TODO remove all objects
		// eg: remove(objectName);
		remove(action);
		remove(input);
		remove(stringOutput);
	}

}
