//Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex13 extends Applet implements ActionListener {

	Button draw;
	TextField noStars;
	int iStars, xpos, ypos;
	int canvasX, canvasY, currCanvasX, currCanvasY;

	public void init() {

		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;

		iStars = 0;

		draw = new Button("draw");
		noStars = new TextField(10);

		add(draw);
		add(noStars);

		removeObjects();

		UI();

		setLayout(null);
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		currCanvasX = getWidth();
		currCanvasY = getWidth();
		
		for (int i = 1; i <= iStars; i++) {
			g.setFont(new Font("serif", Font.PLAIN, 20));
			g.drawString("★", xpos, ypos);
			xpos = xpos + 20;
			if (xpos >= (currCanvasX - 20)) {
				ypos = ypos + 20;
				xpos = 10;
			}
		}

		if (canvasX == currCanvasX & canvasY == currCanvasY) {
			
			xpos = 10;
			ypos = 100;
			
		}

		else {

			removeObjects();

			UI();

			xpos = 10;
			ypos = 100;

			canvasX = currCanvasX;
			canvasY = currCanvasY;
		}
	}

	public void UI() {

		draw = new Button("Draw Stars");
		draw.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
		draw.setBackground(Color.green);
		draw.addActionListener(this);
		add(draw);

		noStars = new TextField(10);
		noStars.setBounds(currCanvasX / 2 - 40, 40, 80, 20);
		noStars.addActionListener(this);
		add(noStars);
		
		noStars.requestFocus();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == draw) {
			iStars = Integer.valueOf(noStars.getText()).intValue();

			System.out.println("Stars: " + iStars);

			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;

			repaint();
		}
		
		if (e.getSource() == noStars) {
			iStars = Integer.valueOf(noStars.getText()).intValue();

			System.out.println("Stars: " + iStars);

			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;

			repaint();
		}
	}

	public void removeObjects() {
		add(draw);
		add(noStars);

		remove(draw);
		remove(noStars);
	}

}
