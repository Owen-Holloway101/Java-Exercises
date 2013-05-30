import java.applet.Applet;
import java.awt.*;

//A simple demonstration of using a for loop to sum the elements of an array.
public class ex15_orgional extends Applet {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // declare and instantiate an
													// array of 10 elements
	// with values given
	int total;

	public void init() {
		int b; // note here we have declared the loop counter prior to
		// the loop
		total = 0;
		for (b = 0; b < a.length; b++) {
			total = total + a[b];
		}
	}

	public void paint(Graphics g) {
		// Print out the result
		g.drawString("Total of array elements :  " + total, 25, 100);
	}
}