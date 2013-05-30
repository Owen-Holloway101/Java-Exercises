//Owen Holloway GYC
//Uses UI scaler template version 1.2

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crypt extends Applet implements ActionListener {

	int canvasX, canvasY, currCanvasX, currCanvasY;
	int UIType;
	char passChar[], phraseChar[];
	
	TextField password, phrase;
	Button crypt, decrypt;

	public void init() {

		UIType = 1;
		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;

		UI(); // Object UI elements

		setLayout(null);
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		currCanvasX = getWidth();
		currCanvasY = getHeight();

		if (!(canvasX == currCanvasX) | !(canvasY == currCanvasY)) {
			removeObjects();
			UI(); // Object UI elements

			canvasX = currCanvasX;
			canvasY = currCanvasY;

		}
		paintedUI(g); // Graphics UI elements
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Add Actions for (this)
	}

	public void UI() {
		// TODO Add object UI elements
		
		
		switch (UIType) //switch for different UITypes
		{
		case 1: 
			// eg: button = new button("button");
			// button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
			// button.setBackground(Color.green);
			// button.addActionListener(this);
			// add(button);
			
			password = new TextField();
			password.setBounds(currCanvasX/2 - 80, 20, 160, 20);
			add(password);
			
			phrase = new TextField();
			phrase.setBounds(currCanvasX/2 - (currCanvasX - 20)/2, 60, currCanvasX - 20, currCanvasY - 80);
			add(phrase);
		break;
		}
	}

	public void paintedUI(Graphics g) {
		// TODO Add any graphics UI elements
		
		
		switch (UIType) //swtich for different UITypes
		{
		case 1: 
			// eg: g.drawString("Hello World", currCanvasX/2, 40);
			g.drawString("Password", currCanvasX/2 - 30, 15);
		break;
		}
	}

	public void removeObjects() {
		
		remove(password);
		remove(phrase);
	}

}
