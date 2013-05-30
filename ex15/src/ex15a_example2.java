import java.applet.Applet;
import java.awt.*;
//A demonstration of using a multi dimensional array

public class ex15a_example2 extends Applet {
int data [][] = { { 1, 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } }; // This line declares, instantiates and  
             //initialises the two dimensional array in 
             //one go!
    public void init() {
    }
    public void paint (Graphics g) {
	//Print out the array
  g.drawString(" "+data[0][0]+" "+ data[0][1]+" "+data[0][2]+" ",20, 20);
    	  g.drawString(" "+data[1][0]+" "+ data[1][1]+" "+data[1][2]+" ",20, 40);
    	  g.drawString(" "+data[2][0]+" "+ data[2][1]+" "+data[2][2]+" ",20, 60);
     }
}