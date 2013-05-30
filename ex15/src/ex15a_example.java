import java.applet.Applet;
import java.awt.*;

//A demonstration of using a multi dimensional array

public class ex15a_example extends Applet {
	int data[][] = new int[3][3]; // declare and instantiate the array in one go

	public void init() {

		data[0][0] = 1; // this could be done more elegantly using a loop
		data[0][1] = 2; // but the purpose here is to show you how the
		data[0][2] = 3; // elements relate to what you see on the output screen.
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		data[2][0] = 7;
		data[2][1] = 8;
		data[2][2] = 9;
	}

	public void paint(Graphics g) {
		// Print out the array
		g.drawString(" " + data[0][0] + " " + data[0][1] + " " + data[0][2]
				+ " ", 20, 20);
		g.drawString(" " + data[1][0] + " " + data[1][1] + " " + data[1][2]
				+ " ", 20, 40);
		g.drawString(" " + data[2][0] + " " + data[2][1] + " " + data[2][2]
				+ " ", 20, 60);
	}
}