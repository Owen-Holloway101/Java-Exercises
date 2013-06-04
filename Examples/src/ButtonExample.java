//Owen Holloway GYC
//Uses UI scaler template version 1.3

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample extends Applet implements ActionListener {

    int canvasX, canvasY, currCanvasX, currCanvasY;
    int UIType;

    Button button_example[];

    public void init() {

        UIType = 1;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        button_example = new Button[50];

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
        System.out.println("action" + e.getSource());
        // TODO Add Actions for (this)
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

                int x,y;
                x = 10;
                y = 10;

                for(int i = 0; i < 50; i++){
                    if(x > 270){
                        y = y + 20;
                        x = 10;
                    }

                    button_example[i] = new Button();
                    button_example[i].setBounds(10 + x,y,60,20);
                    button_example[i].addActionListener(this);
                    add(button_example[i]);

                    x = x + 60;
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
            for (int i = 0; i < 50; i++) {
            remove(button_example[i]);
        }
    }

}
