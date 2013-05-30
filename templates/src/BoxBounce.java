//Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;

public class BoxBounce extends Applet {

	int x, y, addx, addy;
	int canvx, canvy;
	boolean loop;

	public void init() {
		this.setSize(400,350);
		loop = true;
		x = 0;
		y = 0;
		addx = 1;
		addy = 1;
	}

	public void paint(Graphics g) {

		canvx = getWidth();
		canvy = getHeight();

		g.drawRect(x, y, 10, 10);

		if (loop = true) {

			if (x + 10 > canvx)
				addx = -addx;
			if (y + 10 > canvy)
				addy = -addy;
			if (x < 0)
				addx = -addx;
			if (y < 0)
				addy = -addy;

			x = x + addx;
			y = y + addy;

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			repaint();
		}

		else {

		}
	}
}
