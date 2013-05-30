//Owen Holloway GYC
//Uses UI scaler template version 1.2

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ex16a extends Applet implements ActionListener, MouseListener {

	int canvasX, canvasY, currCanvasX, currCanvasY;
	int UIType;
	Button begin;

	int pointX[], pointY[], pointCurrent;

	boolean redraw;

	public void init() {

		UIType = 1;
		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;
		pointCurrent = 0;

		pointX = new int[11];
		pointY = new int[11];

		redraw = false;

		UI(); // Object UI elements

		addMouseListener(this);
		setLayout(null);
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		currCanvasX = getWidth();
		currCanvasY = getHeight();

		if (!(canvasX == currCanvasX) | !(canvasY == currCanvasY)
				| redraw == true) {
			removeObjects();
			UI(); // Object UI elements

			canvasX = currCanvasX;
			canvasY = currCanvasY;

		}

		paintedUI(g); // Graphics UI elements
	}

	public void actionPerformed(ActionEvent e) {

		UIType = 2;

		redraw = true;

		repaint();
	}

	public void UI() {
		// TODO Add object UI elements

		switch (UIType) // swtich for different UITypes
		{
		case 1:
			// eg: button = new button("button");
			// button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
			// button.setBackground(Color.green);
			// button.addActionListener(this);
			// add(button);

			begin = new Button("Begin");
			begin.setBounds(currCanvasX / 2 - 40, 40, 80, 30);
			begin.addActionListener(this);
			add(begin);
			break;

		case 2:
			break;
		}
	}

	public void paintedUI(Graphics g) {
		// TODO Add any graphics UI elements

		switch (UIType) // swtich for different UITypes
		{
		case 1:
			// eg: g.drawString("Hello World", currCanvasX/2, 40);
			break;

		case 2:
			// pointCurrent needs a -1
			if (pointCurrent > 0) {
				g.drawString("Mouse point(" + pointX[pointCurrent - 1] + ","
						+ pointY[pointCurrent - 1] + ")",
						pointX[pointCurrent - 1], pointY[pointCurrent - 1]);
				System.out.println("PointX in paint:" + (pointCurrent - 1)
						+ ":" + pointX[pointCurrent - 1]);
				System.out.println("PointY in paint:" + (pointCurrent - 1)
						+ ":" + pointY[pointCurrent - 1]);
			}
			g.fillRect(currCanvasX - 15, 0, 15, 15);

			break;

		case 3:
			for(int i =0; i < pointCurrent - 1; i++){
				g.drawString("Mouse point(" + pointX[i] + ","
						+ pointY[i] + ")",
						pointX[i], pointY[i]);
			}

			break;
		}

		for (int i = 0; i < pointCurrent; i++) {
			System.out.println("PointX:" + i + ":" + pointX[i]);
			System.out.println("PointY:" + i + ":" + pointY[i]);
		}
		System.out.println("pointCurrent: " + pointCurrent);
	}

	public void removeObjects() {
		// TODO remove all objects
		// eg: remove(objectName);
		remove(begin);
	}

	public void mouseClicked(MouseEvent e) {

		if (UIType == 2 && pointCurrent < 10) {
			pointX[pointCurrent] = e.getX();
			pointY[pointCurrent] = e.getY();
			if (pointX[pointCurrent] > (currCanvasX - 15)
					&& pointY[pointCurrent] < 15) {
				UIType = 3;
			}
			pointCurrent++;
		}
		repaint();
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

}
