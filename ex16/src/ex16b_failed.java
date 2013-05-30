//Owen Holloway GYC
//Uses UI scaler template version 1.2

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ex16b_failed extends Applet implements ActionListener, MouseListener,
		MouseMotionListener {

	int canvasX, canvasY, currCanvasX, currCanvasY;
	int UIType;

	Color colour[];

	int pointCurrent, points1, points2;
	int pointX, pointY, pointXtmp[][], pointYtmp[][];

	boolean redraw;
	
	Button save;
	TextField fileName;

	public void init() {

		UIType = 1;
		points1 = 1;
		points2 = 1;
		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;
		pointCurrent = 0;
		colour = new Color[10];

		// Initialise colours (Eclipse says these are spelt wrong. Eclipse is
		// stupid)
		colour[0] = new Color(255, 255, 255);
		colour[1] = new Color(0, 0, 0);
		colour[2] = new Color(255, 0, 0);
		colour[3] = new Color(0, 255, 0);
		colour[4] = new Color(0, 0, 255);
		colour[5] = Color.lightGray;
		
		redraw = false;

		UI(); // Object UI elements

		addMouseMotionListener(this);
		addMouseListener(this);
		setLayout(null);
	}
	
	public void update (Graphics g) {
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

		switch (UIType) // swtich for different UITypes
		{
		case 1:
			// eg: button = new button("button");
			// button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
			// button.setBackground(Color.green);
			// button.addActionListener(this);
			
			//TODO add save and filename UI
			break;
		}
	}

	public void paintedUI(Graphics g) {

		switch (UIType) // swtich for different UITypes
		{
		case 1:
			// eg: g.drawString("Hello World", currCanvasX/2, 40);

			for (int i = 0; i < 6; i++) {
				g.setColor(Color.gray);
				g.drawRect(0, 0 + (i * 15), 15, 15);
				g.setColor(colour[i]);
				g.fillRect(1, 1 + (i * 15), 14, 14);
			}
			g.setColor(Color.white);
			g.fillRect(20, 5, currCanvasX - 26, currCanvasY - 6);
			g.fillRoundRect(pointX, pointY, 6, 6, 3, 3);

			break;
		}
	}

	public void removeObjects() {
		
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getX() < 90 && e.getY() < 15) {

		}
	}

	public void mousePressed(MouseEvent e) {
		//System.out.println("MousePressed");
	}

	public void mouseReleased(MouseEvent e) {
		//System.out.println("MouseReleased");
		points1++;
	}

	public void mouseEntered(MouseEvent e) {
		//System.out.println("MouseEntered");
	}

	public void mouseExited(MouseEvent e) {
		//System.out.println("MouseExited");
	}

	public void mouseDragged(MouseEvent e) {
		
		pointX = e.getX();
		pointY = e.getY();
		repaint();
		
		/*
		System.out.println("points1:" + points1);
		System.out.println("points2:" + points2);
		
		pointXtmp = new int[points1][points2];
		pointYtmp = new int[points1][points2];
		
		System.out.println("tmp_created");
		
		for(int i1 = 0; i1 < points1; i1++){
			for(int i2 = 0; i2 < points2; i2++){
				pointXtmp[i1][i2] = pointX[i1][i2];
				pointYtmp[i1][i2] = pointY[i1][i2];
			}
		}
		
		System.out.println("tmp_written");
		
		points2++;
		
		pointX = new int[points1][points2];
		pointY = new int[points1][points2];
		
		for(int i1 = 0; i1 < points1; i1++){
			for(int i2 = 0; i2 < points2 - 1; i2++){
				pointX[i1][i2] = pointXtmp[i1][i2];
				pointY[i1][i2] = pointYtmp[i1][i2];
			}
		}
		
		System.out.println("real_written");
		
		//pointX[points1][points2] = e.getX();
		//pointY[points1][points2] = e.getY();
		
		
		for(int i1 = 0; i1 < points1; i1++){
			for(int i2 = 0; i2 < points2; i2++){
				System.out.println("PointX" + i1 + ":" + i2 +":" + pointX[i1][i2]);
				System.out.println("PointY" + i1 + ":" + i2 +":" + pointY[i1][i2]);
			}
		}
		*/
		//System.out.println("MouseDragged");

	}

	public void mouseMoved(MouseEvent e) {
		//System.out.println("MouseMoved");
	}

}