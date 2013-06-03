//Owen Holloway GYC
//Uses UI scaler template version 1.3

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Algorithum extends Applet implements ActionListener {

    int canvasX, canvasY, currCanvasX, currCanvasY;
    int UIType;

    Button choice[], coin[];
    int costChoice[];
    String labelChoice[];

    public void init() {
        this.setSize(300,400);

        UIType = 1;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        choice = new Button[6];
        labelChoice = new String[6];
        costChoice = new int[6];

        costChoice[0] = 1;
        costChoice[1] = 1;
        costChoice[2] = 1;
        costChoice[3] = 1;
        costChoice[4] = 1;
        costChoice[5] = 1;

        coin = new Button[5];

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
    }

    public void UI() {
        // TODO Add object UI elements


        switch (UIType) //swtich for different UITypes
        {
            case 1:

                for(int i = 0; i < 6; i++) {
                    choice[i] = new Button();
                    choice[i].setBackground(Color.blue);
                    choice[i].setBounds(currCanvasX - 80,170 + (30 * i),60,20);
                    add(choice[i]);
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

                g.setColor(Color.red);
                g.fillRect(0,0,currCanvasX,currCanvasY);
                break;
        }
    }

    public void update(Graphics g) {
        // This can be changed to use a switch
        g.clearRect(0,0,currCanvasX,currCanvasY);
        paint(g);
    }

    public void removeObjects() {
        // TODO remove all objects
        // eg: remove(objectName);

        for(int i = 0; i < 6; i++) {
            remove(choice[i]);
        }
    }

}
