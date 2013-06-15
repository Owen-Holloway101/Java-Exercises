// Load an array of images, loop through the array, and display each image.
import java.applet.Applet;
import java.awt.*;
public class ex17 extends Applet {
    private Image pic[];
    private int totalImages = 3,  // total number of images
            currentImage = 0,  // current image subscript
            sleepTime = 50;    // milliseconds to sleep
    // The next two objects are for double-buffering
    private Graphics gContext; // off-screen graphics context
    private Image buffer;      // buffer in which to draw image
    // load the images when the applet begins executing
    public void init()
    {
        pic = new Image[ totalImages ];
        buffer = createImage( 160, 80 ); // create image buffer
        gContext = buffer.getGraphics(); // get graphics context
        // set background of buffer to white
        gContext.setColor( Color.white );
        gContext.fillRect( 0, 0, 160, 80 );

        for ( int i = 0; i < pic.length; i++ )
            pic[ i ] = getImage( getDocumentBase(),
                    "images/pic" + i + ".gif" );
    }
    // start the applet
    public void start()
    {
        // always start with 1st image
        gContext.drawImage( pic[ 0 ], 0, 0, this );
        currentImage = 1;
    }
    // display the image in the Applet's Graphics context
    public void paint( Graphics g )
    {
        g.drawImage( buffer, 0, 0, this );
        // clear previous image from buffer
        gContext.fillRect( 0, 0, 160, 80 );
        // draw new image in buffer
        gContext.drawImage( pic[ currentImage ], 0, 0, this );
        currentImage = ( currentImage + 1 ) % totalImages;
        try {
            Thread.sleep( sleepTime );
        }
        catch ( InterruptedException e ) {
            showStatus( e.toString() );
        }
        repaint();  // display buffered image
    }
}                                       
