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
    int costChoice[], coinVal[];
    double balance;
    String labelChoice[];

    public void init() {
        this.setSize(300,400);

        UIType = 1;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        choice = new Button[6];
        labelChoice = new String[6];
        costChoice = new int[6];

        costChoice[0] = 100;
        costChoice[1] = 100;
        costChoice[2] = 100;
        costChoice[3] = 100;
        costChoice[4] = 100;
        costChoice[5] = 100;

        labelChoice[0] = "Choice 0";
        labelChoice[1] = "Choice 1";
        labelChoice[2] = "Choice 2";
        labelChoice[3] = "Choice 3";
        labelChoice[4] = "Choice 4";
        labelChoice[5] = "Choice 5";


        coin = new Button[5];
        coinVal = new int[5];

        coinVal[0] = 10;
        coinVal[1] = 20;
        coinVal[2] = 50;
        coinVal[3] = 100;
        coinVal[4] = 200;

        balance = 0.00;

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
        if(e.getSource() == choice[0]){
             System.out.println("Choice0");
        }

        if(e.getSource() == choice[1]){
            System.out.println("Choice1");
        }

        if(e.getSource() == choice[2]){
            System.out.println("Choice2");
        }

        if(e.getSource() == choice[3]){
            System.out.println("Choice3");
        }

        if(e.getSource() == choice[4]){
            System.out.println("Choice4");
        }

        if(e.getSource() == choice[5]){
            System.out.println("Choice5");
        }
    }

    public void UI() {
        // TODO Add object UI elements


        switch (UIType) //swtich for different UITypes
        {
            case 1:

                for(int i = 0; i < 6; i++) {
                    choice[i] = new Button(labelChoice[i]);
                    choice[i].setBackground(new Color(81, 180, 255));
                    choice[i].setBounds(currCanvasX - 100,170 + (30 * i),90,20);
                    choice[i].addActionListener(this);
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
                g.fillRect(0, 0, currCanvasX, currCanvasY);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(45, 55, 100, 100);
                g.drawLine(145, 55, 195, 100);
                g.drawLine(145,154,195,120);
                g.setColor(Color.black);
                g.fillRect(195,100,5,20);
                g.drawString("Balance: " + balance,205,115);
                g.fillRect(45,320,100,25);
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
