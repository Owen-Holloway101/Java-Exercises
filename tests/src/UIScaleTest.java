//Owen Holloway GYC
//Uses UI scaler template version 1.1

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIScaleTest extends Applet implements ActionListener {

	int canvasX, canvasY, currCanvasX, currCanvasY;
	Button ChangeUI;

	public void init() {

		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;

		UI(); // Object UI elements

		setLayout(null);
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		currCanvasX = getWidth();
		currCanvasY = getHeight();

		if (canvasX == currCanvasX & canvasY == currCanvasY)
			; // Checks if the canvas has changed

		else {
			removeObjects();
			UI(); // Object UI elements
			paintedUI(g); // Graphics UI elements
			canvasX = currCanvasX;
			canvasY = currCanvasY;
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Add Actions for (this)
	}

	public void UI() {
		// TODO Add object UI elements
		// eg: button = new Button("button");
		// button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
		// button.setBackground(Color.green);
		// button.addActionListener(this);
		// add(button);
		
		ChangeUI = new Button("Change UI");
		ChangeUI.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
		add(ChangeUI);
	}

	public void paintedUI(Graphics g) {
		// TODO Add any graphics UI elements
		// eg: g.drawString("Hello World", currCanvasX/2, 40);
	}

	public void removeObjects() {
		// TODO remove all objects
		// eg: remove(objectName);
		
		remove(ChangeUI);
	}

}
