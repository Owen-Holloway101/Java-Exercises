//Owen Holloway GYC
//Uses UI scaler template version 2.1

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIScaler extends Applet implements ActionListener {

    //Canvas and UIType setups
    int canvasX, canvasY, currCanvasX, currCanvasY;
    int UIType;

    //Buttons, TextFields, Labels, etc ....
    Button test_Button;
    TextArea test_textArea;

    public void init() {

        UIType = 1;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        //Declare and add buttons here
        test_Button = new Button("test");
        add(test_Button);
        test_textArea = new TextArea();
        add(test_textArea);
        //############################

        UI(); // Object UI elements

        setLayout(null);
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        currCanvasX = getWidth();
        currCanvasY = getHeight();

        if (!(canvasX == currCanvasX) | !(canvasY == currCanvasY)) {
            UI(); // Object UI elements

            canvasX = currCanvasX;
            canvasY = currCanvasY;

        }
        paintedUI(g); // Graphics UI elements
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Add Actions for (this)
    }

    public void UI() {
        // TODO Add object UI elements


        switch (UIType) //swtich for different UITypes
        {
            case 1:
                test_Button.setBounds(10,10,currCanvasX - 20,20);
                test_textArea.setBounds(10,30,currCanvasX - 20, currCanvasY - 40);
                break;
        }
    }

    public void paintedUI(Graphics g) {
        // TODO Add any graphics UI elements


        switch (UIType) //swtich for different UITypes
        {
            case 1:
			// eg: g.drawString("Hello World", currCanvasX/2, 40);
                break;
        }
    }

    public void update(Graphics g) {
        // This can be changed to use a switch
        g.clearRect(0, 0, currCanvasX, currCanvasY);
        paint(g);
    }
}