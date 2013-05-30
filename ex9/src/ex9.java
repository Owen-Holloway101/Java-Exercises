import java.applet.Applet;
import java.awt.*;
import java.text.DecimalFormat; 
//This class demonstrates methods for converting text to numerical values and converting the
//numerical values back to text for printing in paint. It also shows different ways of instantiating strings. 

public class ex9 extends Applet 
{
	String s1, s2;				//numerical strings for integers
    String s3 = "76.5156";			//Strings can be initialized on declaration
    int int1, int2;				//corresponding values for integers
    double real1; 				//corresponding values for reals
    DecimalFormat precision2;		//set decimal format for reals 
    
    public void init()
    {
    	//Define three strings which will be converted to numbers.
    	s1 =  new String( "1256" );	//instantiate s1
    	s2 = "5678";			//Strings can be instantiated directly
    	
    	//Define a decimal format of two decimal places (rounded)
    	precision2 = new DecimalFormat("#.00");
    	
    	int1 = Integer.parseInt(s1);			//One way to convert string to integer
    	int2 = Integer.valueOf(s2).intValue();		//Another way 
    	real1 = Double.valueOf(s3).doubleValue(); 	//Convert string to double 
    }
    
    public void paint (Graphics g)
    {
    	//Using drawString to �paint� the string values of the numbers.
    	g.drawString(Integer.toString(int1), 25, 25);
    	g.drawString(Integer.toString(int2), 25, 50);
    	g.drawString(Double.toString(real1), 25, 75);
    	g.drawString(precision2.format(real1), 25, 100);
    }
}
