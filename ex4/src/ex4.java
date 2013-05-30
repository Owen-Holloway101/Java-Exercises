import java.applet.Applet;
import java.awt.*;

/* This simple class introduces some ideas about Strings. 
 * Strings are objects and so contain both data and methods. 
 * They must be declared, instantiated and given values. 
 * However, there are some short cuts in setting up a string in a class. */

public class ex4 extends Applet
{
	String s1;
	String s2;
	String s3;
	String s4;
	String s5 = "How are you .";	//Strings can be instantiated when declared
	
	public void init()
	{
		s1 = new String ();		//null string
		s2 = new String ("Hello");	//one way to instantiate with a value
		s3 = new String (s2);	//another way to initialise
		s4 = "    Hello     ";		//still another way.
    } 
	public void paint (Graphics g)
	{
		//The following line illustrates concatenation of strings with +
		g.drawString(s2 + " What a nice day.", 25,25);
		
		//The following line illustrate the string method length
		g.drawString("s2 equals " + s2, 25, 50);
		g.drawString("Length of s2 is " + s2.length() + " characters", 25,75);	
		
		//Uppercase and lowercase methods. In these examples, we have not
		//declared a name for the new strings, so that the new string is
		//lost as soon as the drawString method is over.
		g.drawString("s2 to UpperCase is " + s2.toUpperCase( ), 25, 100);
		g.drawString("s2 to LowerCase is " + s2.toLowerCase( ), 25,125);
		
		//Trim removes the white spaces on either side of the strings
		//In this example (and the next) we have named the new strings
		//so that the new string remains after the drawString method.
		s1 = s4.trim( );
		System.out.println(" s1 = " + s1 );
		g.drawString("The original s4 is:" + s4, 25, 150);
		g.drawString("After trimming s4 is:" + s1, 25,175);
		
		//replace changes characters
		s1 = s2.replace('H', 'h');
		g.drawString("s2 after a replace is  " + s1, 25, 200);
		
		//Exercise playing with S4 string
		int s4WithSpace;
		int s4NoSpace;
		int s4SpaceAmount;
		String s4Trim;
		String s4Caps;
		
		s4WithSpace = s4.length();
		s4Trim = s4.trim();
		s4Caps = s4Trim.toUpperCase();
		System.out.println(s4 + " , " +s4WithSpace );
		s4NoSpace = s4Trim.length();
		g.drawString("Upper case s4: " + s4Caps, 25, 250);
		s4SpaceAmount = s4WithSpace - s4NoSpace;
		g.drawString("Amount of spaces in s4: " + s4SpaceAmount , 25, 275);
	}
}

