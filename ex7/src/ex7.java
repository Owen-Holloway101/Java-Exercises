import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex7 extends Applet implements ActionListener
{
	Image penguin, picture;		//image variable
	Button splode;
	
	public void init()
	{
		//Next line gets an image stored in the same directory as the HTML.
		//These images can be imported or created in Paint Shop Pro.
		penguin = getImage(getDocumentBase(), "penguin.gif");
		//picture = getImage(getDocumentBase(), "picture.gif");
		
		splode = new Button("splode");
		splode.setBounds(410,190,50,20);
		splode.setBackground(Color.black);
		
		add (splode);
		
		splode.addActionListener(this);
		setLayout(null);
	}
	
	public void paint(Graphics g)
	{
		int width = penguin.getWidth(this);
		int height = penguin.getHeight(this);
		g.drawImage(penguin, 10, 10, this);
		g.drawImage(penguin, 10, 10, width*2, height*2, this);
		g.drawImage(penguin, 10, 10, width*3, height*3, this);
		g.setFont(new Font("sansserif", Font.ITALIC, 30));
		g.drawString("Soon", 400, 650);
     }
	
	public void actionPerformed(ActionEvent e)
    {
		penguin = getImage(getDocumentBase(), "explode.gif");
		repaint();
		remove (splode);
    }
}
