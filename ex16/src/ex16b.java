//Owen Holloway GYC
//Uses UI scaler template version 1.2
//Test

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex16b extends Applet implements ActionListener, MouseListener, MouseMotionListener {

    int canvasX, canvasY, currCanvasX, currCanvasY;
    int UIType;
    Button begin;
    boolean redraw;

    Color color[];
    int colorSelected,slider = 20;

    int mouseX, mouseY;

    public void init() {

        UIType = 2;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        redraw = false;

        colorSelected = 0;

        color = new Color[11];

        color[0] = new Color(0,0,0);
        color[1] = new Color(255,0,0);
        color[2] = new Color(0, 255,0);
        color[3] = new Color(0,0, 255);
        color[4] = new Color(255, 255,0);
        color[5] = new Color(0, 255, 255);
        color[6] = new Color(255,0, 255);
        color[7] = new Color(127, 127, 127);
        color[8] = new Color(64, 64, 64);
        color[9] = new Color(255, 255, 255);
        color[10] = new Color(221, 221, 221);


        UI(); // Object UI elements

        addMouseMotionListener(this);
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

            paintedUI(g);

            if(UIType == 3) {
                UIType = 2;
            }

            redraw = false;
        }

        paintedUI(g); // Graphics UI elements
    }

    public void actionPerformed(ActionEvent e) {

        UIType = 2;

        redraw = true;

        //remove(begin);

        repaint();
    }

    public void UI() {
        // TODO Add object UI elements

        switch (UIType) // swtich for different UITypes
        {
            case 1:
                // eg: button = new button("button");
                // button.setBounds(currCanvasX / 2 - 40, 10, 80, 20);
                // button.setBackground(Color.green);
                // button.addActionListener(this);
                // add(button);

                //begin = new Button("Begin");
                //begin.setBounds(currCanvasX / 2 - 40, 40, 80, 30);
                //begin.addActionListener(this);
                //add(begin);
                break;

            case 2:
                break;
        }
    }

    public void paintedUI(Graphics g) {
        // TODO Add any graphics UI elements

        switch (UIType) // swtich for different UITypes
        {
            case 1:
                // eg: g.drawString("Hello World", currCanvasX/2, 40);
                break;

            case 2:
                //g.setColor(new Color(255, 255, 255));
                //g.fillRect(30,10,currCanvasX - 40,currCanvasY - 20);
                g.setColor(color[0]);
                g.drawRect(14,150,2,100);
                g.fillRect(10,200,11,4);
                for(int i = 0; i < 11; i++) {
                    g.setColor(color[i]);
                    g.fillRect(10, 10 + (10 * i),10,10);
                    g.setColor(color[0]);
                    g.drawRect(10, 10 + (10 * i),10,10);
                }
                UIType = 3;
                break;

            case 3:
                g.setColor(color[colorSelected]);
                g.fillOval(mouseX - (slider/2),mouseY - (slider/2),slider,slider);
                break;
            case 4:
                slider = 50 - ((mouseY - 150) / 2);
                g.setColor(color[0]);
                g.drawRect(14,150,2,100);
                g.fillRect(10,mouseY,11,4);
                UIType = 3;
                System.out.println("slider:" + slider);
                break;
        }
        System.out.println("UIType:" + UIType);
    }

    public void update(Graphics g) {
        switch (UIType) // swtich for different UITypes
        {
            case 1:
                g.clearRect(0, 0, 20, currCanvasY);
                break;

            case 4:
                g.clearRect(10, 150, 11, 120);
                break;
        }
            paint(g);
    }

    public void removeObjects() {
        // TODO remove all objects
        // eg: remove(objectName);
        //remove(begin);
    }

    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();


        if(mouseX > 30 && mouseX < (currCanvasX - 20) && mouseY > 10 && mouseY < (currCanvasY - 10))
            repaint();

        if(mouseX > 10 && mouseX < 20 && mouseY > 10 && mouseY < 20){
            colorSelected = 0;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 20 && mouseY < 30){
            colorSelected = 1;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 30 && mouseY < 40){
            colorSelected = 2;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 40 && mouseY < 50){
            colorSelected = 3;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 50 && mouseY < 60){
            colorSelected = 4;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 60 && mouseY < 70){
            colorSelected = 5;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 70 && mouseY < 80){
            colorSelected = 6;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 80 && mouseY < 90){
            colorSelected = 7;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 90 && mouseY < 100){
            colorSelected = 8;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 100 && mouseY < 110){
            colorSelected = 9;
        }

        if(mouseX > 10 && mouseX < 20 && mouseY > 110 && mouseY < 120){
            colorSelected = 10;
        }

        System.out.println("Color:" + colorSelected);

    }

    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();


        if(mouseX > 30 && mouseX < (currCanvasX - 20) && mouseY > 10 && mouseY < (currCanvasY - 20))
            repaint();

        if(mouseX > 10 && mouseX < 20 && mouseY > 150 && mouseY < 250) {
            System.out.println("Slider");

            UIType = 4;
            repaint();
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }
}
