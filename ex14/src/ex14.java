//Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex14 extends Applet implements ActionListener {

	Button draw;
	TextField numbers;
	int canvasX, canvasY, currCanvasX, currCanvasY;

	public void init() {

		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;

		draw = new Button("Draw Stars");
		numbers = new TextField(10);
		
		removeObjects();

		UI();

		setLayout(null);
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		currCanvasX = getWidth();
		currCanvasY = getWidth();

		if (canvasX == currCanvasX & canvasY == currCanvasY) {
		}

		else {
			removeObjects();
			UI();
			canvasX = currCanvasX;
			canvasY = currCanvasY;
		}
	}

	public void actionPerformed(ActionEvent e) {

	}
	
	public void UI() {
		draw = new Button("show numbers");
		draw.setBounds(currCanvasX / 2 - 60, 10, 120, 20);
		draw.setBackground(Color.green);
		draw.addActionListener(this);
		add(draw);

		numbers = new TextField(10);
		numbers.setBounds(currCanvasX / 2 - 40, 40, 80, 20);
		numbers.addActionListener(this);
		add(numbers);
		
		numbers.requestFocus();
	}

	public void removeObjects() {
		add(draw);
		add(numbers);
		
		remove(draw);
		remove(numbers);
	}

}
