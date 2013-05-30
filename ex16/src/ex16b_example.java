import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//Class to enable user to draw on applet screen
public class ex16b_example extends Applet 
	     implements MouseListener, MouseMotionListener {
    int x, y;	//coordinates of mouse
  
    //Listen to mouse
    public void init() {
	addMouseMotionListener (this);
	addMouseListener (this);
    }

    //draw small circle at position of mouse
    public void paint (Graphics g) {
	g.fillOval(x-2, y-2, 4,4);
    }
    
    //declare all mouse methods

    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    
    //Without this line repaint would wipe out all previous circles drawn on the applet. update is normally                     
    //called automatically before repaint to clear the screen. This method overrides the normal update.
   
   public void update (Graphics g) {paint(g);}
    
    //response to mouseDragged event

    public void mouseDragged (MouseEvent e) {
	x = e.getX();
	y = e.getY();
	repaint();
    }
}
