import java.applet.Applet;
import java.awt.*;

//A simple demonstration of using a for loop to sum the elements of an array.
public class ex15_orgional_alt extends Applet {
	int a[]; // declare the array without initialising its values

	int total;

	public void init() {
		a = new int[10]; // instantiate the array object and declare its size
		for (int b = 0; b < a.length; b++){
			System.out.println("a" + b + " = " + a[b]);
			// fill the array with the values
			a[b] = b + 1;
			System.out.println("a" + b + " = " + a[b]);
		}

		total = 0;
		for (int c = 0; c < a.length; c++) // note we have declared the loop
											// counter in the loop
		{
			System.out.println("a" + c + " = " + a[c]);
			total = total + a[c];
		}
	}

	public void paint(Graphics g) {
		// Print out the result
		g.drawString("Total of array elements :  " + total, 25, 100);
	}
}