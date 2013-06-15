import java.applet.Applet;
import java.awt.*;
public class ParameterDemo extends Applet {
    int i;
    String s1 = "Hello    ",
            s2 = "Goodbye  ";
    TextField t;
    public void init() {
        i = 12;
        t = new TextField(s1);
        add (t);
    }

    public void tryToChange(int j, TextField f) {
        //”attempts” to set the int to 12 and the textfield to “Goodbye”
        j = 24;
        f.setText(s2);
    }

    public void paint (Graphics g) {
        g.drawString("Original value of int is  " + i, 25, 100);			//output 12
        g.drawString("Original value of text is " + t.getText(), 25, 125);	//output Hello
        tryToChange(i, t);
        g.drawString("Value of int after tryToChange is  " + i, 25, 150);	//output 12
        g.drawString("Value of text after tryToChange is " + t.getText(), 25, 175);  //output Goodbye.
    }
}
