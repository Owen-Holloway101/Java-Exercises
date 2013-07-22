//Program to manipulate a balloon in the applet window
//Taken from Bell & Parr (1999) Java for Students, 2nd ed.  Europe: Prentice Hall.  pp 175-6

//Edited by Owen Holloway GYC

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PlayBalloon extends Applet implements ActionListener {
    private Button grow, shrink, growAdd, growSub, shrinkAdd, shrinkSub, left, right,up,down;
    private Balloon myBalloon;

    public void init() {
        //Sets up the variable for Balloon

        myBalloon = new Balloon();

        //Adds all the buttons for the applet

        growAdd = new Button("+");
        growAdd.addActionListener(this);
        add(growAdd);
        grow = new Button("Grow: " + Balloon.growAmount);
        add(grow);
        growSub = new Button("-");
        growSub.addActionListener(this);
        add(growSub);
        shrinkAdd = new Button("+");
        shrinkAdd.addActionListener(this);
        add(shrinkAdd);
        grow.addActionListener(this);
        shrink = new Button("Shrink: " + Balloon.shrinkAmount);
        add(shrink);
        shrinkSub = new Button("-");
        shrinkSub.addActionListener(this);
        add(shrinkSub);
        shrink.addActionListener(this);
        left = new Button("Left");
        add(left);
        left.addActionListener(this);
        right = new Button("Right");
        add(right);
        right.addActionListener(this);
        up = new Button("Up");
        add(up);
        up.addActionListener(this);
        down = new Button("Down");
        add(down);
        down.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {

        //Actions for when button are press (obviously)
        if (event.getSource() == growAdd){
            Balloon.growAmount = Balloon.growAmount + 1;
            grow.setLabel("Grow: " + Balloon.growAmount);
        }
        if (event.getSource() == growSub){
            Balloon.growAmount = Balloon.growAmount - 1;
            grow.setLabel("Grow: " + Balloon.growAmount);
        }
        if (event.getSource() == shrinkAdd){
            Balloon.shrinkAmount = Balloon.shrinkAmount + 1;
            shrink.setLabel("Shrink: " + Balloon.shrinkAmount);
        }
        if (event.getSource() == shrinkSub){
            Balloon.shrinkAmount = Balloon.shrinkAmount - 1;
            shrink.setLabel("Shrink: " + Balloon.shrinkAmount);
        }
        if (event.getSource() == grow)
            myBalloon.grow();                          //Grows balloon
        if (event.getSource() == shrink)
            myBalloon.shrink();                        //Shrinks balloon
        if (event.getSource() == right)
            myBalloon.right();                         //Moves balloon right
        if (event.getSource() == left)
            myBalloon.left();                          //Moves balloon left
        if (event.getSource() == up)
            myBalloon.up();                            //Moves balloon up
        if (event.getSource() == down)
            myBalloon.down();                          //Moves balloon down
        repaint();
    }

    public void paint(Graphics g) {
        myBalloon.display(g);                         //draws the balloon
    }

}


class Balloon {
    private int diameter = 10;                         //Sets up the default variables for initial variables
    private int xCoord = 20, yCoord = 50;

    public static int growAmount = 5, shrinkAmount = 5;

    public void display(Graphics g) {
        g.drawOval(xCoord, yCoord, diameter, diameter);    //method for drawing balloon
    }

    public void left() {                                //takes 10 from the x coordinate moving it left
        xCoord = xCoord - 10;
    }

    public void right() {                               //add 10 from the x coordinate moving it right
        xCoord = xCoord + 10;
    }

    public void up(){                                   //takes 10 from the y coordinate moving it up
        yCoord = yCoord - 10;
    }

    public void down(){                                 //takes 10 from the y coordinate moving it down
        yCoord = yCoord + 10;
    }

    public void grow() {                                //adds 5 to the diameter of the circle growing it
        diameter = diameter + growAmount;
    }

    public void shrink() {                              //adds 5 to the diameter of the circle growing it
        diameter = diameter - growAmount;
    }
}
