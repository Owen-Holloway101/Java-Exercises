//Owen Holloway GYC
//Uses UI scaler template version 1.2

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIScaler extends Applet implements ActionListener {

	int canvasX, canvasY, currCanvasX, currCanvasY;
	int UIType;

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
		
		
		switch (UIType) //swtich for different UITypes
		{
		case 1: 
			// eg: button = new button("button");
			// button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
			// button.setBackground(Color.green);
			// button.addActionListener(this);
			// add(button);
		break;
		}
	}

	public void paintedUI(Graphics g) {
		// TODO Add any graphics UI elements
		
		
		switch (UIType) //swtich for different UITypes
		{
		case 1: 
			// eg: g.drawString("Hello World", currCanvasX/2, 40);
		break;
		}
	}

	public void removeObjects() {
		// TODO remove all objects
		// eg: remove(objectName);
	}

}
