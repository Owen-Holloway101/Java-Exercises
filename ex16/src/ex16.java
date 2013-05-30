//Owen Holloway GYC
//Uses UI scaler template version 1.2
//Test

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ex16 extends Applet implements ActionListener, MouseListener {

    int canvasX, canvasY, currCanvasX, currCanvasY;
    int UIType;

    TextField corners;
    Button begin;

    int pointX[], pointY[], points;

    boolean redraw;

    public void init() {

        UIType = 1;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        redraw = false;

        UI(); // Object UI elements

        addMouseListener(this);
        setLayout(null);
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        currCanvasX = getWidth();
        currCanvasY = getHeight();

        if (!(canvasX == currCanvasX) | !(canvasY == currCanvasY) | redraw == true) {
            removeObjects();
            UI(); // Object UI elements

            canvasX = currCanvasX;
            canvasY = currCanvasY;

        }
        paintedUI(g); // Graphics UI elements
    }

    public void actionPerformed(ActionEvent e) {
        points = Integer.valueOf(corners.getText()).intValue();

        pointX = new int[points];
        pointY = new int[points];

        UIType = 2;

        redraw = true;

        repaint();
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

                begin = new Button("Begin");
                begin.setBounds(currCanvasX/2 - 40, 40, 80, 30);
                begin.addActionListener(this);
                add(begin);

                corners = new TextField();
                corners.setBounds(currCanvasX / 2 - 30, 15, 60, 20);
                corners.addActionListener(this);
                add(corners);
                break;

            case 2:
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

            case 2:
                g.drawLine(pointX[0], pointY[0], pointX[0], pointY[0]);
                g.fillRect(pointX[0] - 5, pointY[0] - 5, 10, 10);
                break;
        }
    }

    public void removeObjects() {
        // TODO remove all objects
        // eg: remove(objectName);
        remove(begin);
        remove(corners);
    }

    public void mouseClicked(MouseEvent e) {

        pointX[0] = e.getX();
        pointY[0] = e.getY();

        repaint();
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

}
