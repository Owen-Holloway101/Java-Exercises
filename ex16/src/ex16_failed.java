//Owen Holloway GYC
//Uses UI scaler template version 1.2

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ex16_failed extends Applet implements ActionListener, MouseListener {

	int canvasX, canvasY, currCanvasX, currCanvasY;
	int UIType;
	int mouseX, mouseY, mouseOldX, mouseOldY, firstX, firstY;
	int points;
	int drawPoints = 0;

	int pointsX[];
	int pointsY[];

	boolean redraw, mouseDraw, join;

	Button begin;
	TextField corners;

	public void init() {

		UIType = 2;
		points = 4;
		pointsX = new int[4];
		pointsY = new int[4]; 
		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;

		redraw = false;
		mouseDraw = false;

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

			redraw = false;
		}
		paintedUI(g); // Graphics UI elements
	}

	public void actionPerformed(ActionEvent e) {
		points = Integer.valueOf(corners.getText()).intValue();
		pointsX = new int[points];
		pointsY = new int[points];
		UIType = 2;
		redraw = true;
		mouseDraw = true;
		repaint();
	}

	public void mouseClicked(MouseEvent e) {
		if (mouseDraw = true) {

			pointsX[drawPoints] = e.getX();
			pointsY[drawPoints] = e.getY();

		}

		drawPoints = drawPoints + 1;

		for (int a = 0; a < drawPoints; a++) {

			System.out.println("PointX" + a + ": " + pointsX[a]);
			System.out.println("PointY" + a + ": " + pointsY[a]);

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

	public void UI() {

		switch (UIType) // swtich for different UITypes
		{
		case 1:
			// eg: button = new button("button");
			// button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
			// button.setBackground(Color.green);
			// button.addActionListener(this);
			// add(button);
			// 240 ... don't worry about this its the default pixel density for
			// my phone

			/*
			begin = new Button("begin");
			begin.setBounds(currCanvasX / 2 - 30, 40, 60, 20);
			begin.addActionListener(this);
			add(begin);

			corners = new TextField();
			corners.setBounds(currCanvasX / 2 - 30, 15, 60, 20);
			corners.addActionListener(this);
			add(corners);
			break;
			*/
			
		case 2:

			break;
		}
	}
/*
	public void update(Graphics g) {
	}
*/
	public void paintedUI(Graphics g) {

		switch (UIType) // swtich for different UITypes
		{
		case 1:
			for (int i = 0; i < 5; i++) {
				g.drawRect(0 + i, 0 + i, currCanvasX - 2 * i, currCanvasY - 2
						* i);
			}
			g.drawString("Choose the amount ", currCanvasX / 2 - 50, 80);
			g.drawString("of corners you want", currCanvasX / 2 - 50, 100);
			break;

		case 2:
			/*
			 * for (int i = 0; i < 10; i++) { g.setColor(Color.black);
			 * g.drawRect(0 + i, 0 + i, currCanvasX - 2 * i, currCanvasY - 2 i);
			 * } g.setColor(Color.white); g.fillRect(10, 10, currCanvasX - 20,
			 * currCanvasY - 20);
			 */
			
			g.setColor(Color.black);

			//if (drawPoints < points) {
				//for (int a = 0; a < drawPoints; a++) {

					if (drawPoints == 0) {
						g.drawLine(pointsX[0],
								pointsY[0],
								pointsX[0],
								pointsY[0]);
					}

					if (drawPoints > 0 && drawPoints < points) {
						g.drawLine(pointsX[drawPoints - 1],
								pointsY[drawPoints - 1],
								pointsX[drawPoints],
								pointsY[drawPoints]);
					}
				//}

				break;
			//}

		//	else {
		//		g.drawLine(pointsX[0], pointsY[0], pointsX[points - 1],
		//				pointsY[points - 1]);
		//	}
		}
	}

	public void removeObjects() {
		// eg: remove(objectName);

		/*
		remove(begin);
		remove(corners);
		*/
	}
}