package owen.holloway.applets;

//Owen Holloway GYC
//Uses UI scaler template version 1.3

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import owen.holloway.main;

public class startup extends Applet implements ActionListener {

    //Canvas and UIType setups
    int canvasX, canvasY, currCanvasX, currCanvasY;
    int UIType;

    //Button labels (strings) and buttons
    String buttonLabel[];
    Button buttonStart[];
    int buttons = 26;

    public void init() {

        buttonLabel = new String[buttons];

        buttonLabel[0] = "ex1";
        buttonLabel[1] = "ex2";
        buttonLabel[2] = "ex3";
        buttonLabel[3] = "ex4";
        buttonLabel[4] = "ex5";
        buttonLabel[5] = "ex6";
        buttonLabel[6] = "ex7";
        buttonLabel[7] = "ex8";
        buttonLabel[8] = "ex9";
        buttonLabel[9] = "ex10";
        buttonLabel[10] = "ex10a";
        buttonLabel[11] = "ex11";
        buttonLabel[12] = "ex11a";
        buttonLabel[13] = "ex11b";
        buttonLabel[14] = "ex12";
        buttonLabel[15] = "ex12a";
        buttonLabel[16] = "ex12a_rewrite";
        buttonLabel[17] = "ex12b";
        buttonLabel[18] = "ex13";
        buttonLabel[19] = "ex14";
        buttonLabel[20] = "ex15";
        buttonLabel[21] = "ex15a";
        buttonLabel[22] = "ex15b";  //oops this doesn't exist ... I have a feeling it should maybe
        buttonLabel[23] = "ex16";
        buttonLabel[24] = "ex16a";
        buttonLabel[25] = "ex16b";

        buttonStart = new Button[buttons];

        UIType = 1;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        UI(); // Object UI elements

        setLayout(null);
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        currCanvasX = getWidth();
        currCanvasY = getHeight();

        if (!(canvasX == currCanvasX) | !(canvasY == currCanvasY)) {
            removeObjects();
            UI(); // Object UI elements

            canvasX = currCanvasX;
            canvasY = currCanvasY;

        }
        paintedUI(g); // Graphics UI elements
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Add Actions for (this)

        System.out.println("ButtonPressed: " + e.getSource());

        for (int i = 0; i < buttons; i++) {
            if (e.getSource() == buttonStart[i]) {
                main.applet = i;
                main.nextApplet = true;
            }
        }
    }

    public void UI() {
        // TODO Add object UI elements


        switch (UIType) //swtich for different UITypes
        {
            case 1:
                // eg: button = new button("button");
                // button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
                // button.setBackground(Color.green);
                // button.addActionListener(this);
                // add(button);

                for (int i = 0; i < buttons; i++) {
                    buttonStart[i] = new Button(buttonLabel[i]);
                    buttonStart[i].setBounds(10, 10 + (i * 20), canvasX - 20, 20);
                    buttonStart[i].addActionListener(this);
                    add(buttonStart[i]);
                }

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

    public void removeObjects() {
        // TODO remove all objects
        // eg: remove(objectName);

        for (int i = 0; i < buttons; i++) {
            remove(buttonStart[i]);
        }

    }

}
