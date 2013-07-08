//Owen Holloway GYC
//Uses UI scaler template version 2.1

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QueueExample extends Applet implements ActionListener {

    //Canvas and UIType setups
    int canvasX, canvasY, currCanvasX, currCanvasY;
    int UIType;

    //Buttons, TextFields, Labels, etc ....
    Button join, next;
    TextField addToQueue;

    //Other stuff
    Queue q = new Queue();
    int windowSizeY = 300;

    public void init() {

        UIType = 1;
        canvasX = getWidth() + 1;
        canvasY = getHeight() + 1;

        this.setSize(200,windowSizeY);

        //Declare and add buttons here

        join = new Button("join");
        next = new Button("next");
        addToQueue = new TextField();

        join.addActionListener(this);
        next.addActionListener(this);

        add(join);
        add(next);
        add(addToQueue);

        //############################

        UI(); // Object UI elements

        setLayout(null);
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        currCanvasX = getWidth();
        currCanvasY = getHeight();

        if (!(canvasX == currCanvasX) | !(canvasY == currCanvasY)) {
            UI(); // Object UI elements

            canvasX = currCanvasX;
            canvasY = currCanvasY;

        }
        paintedUI(g); // Graphics UI elements
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == join){

            q.join(addToQueue.getText().toString());

            if(windowSizeY < (20 * q.queueLength + 50)){
                windowSizeY = windowSizeY + 20;
                this.setSize(currCanvasX,windowSizeY);

            }
        }

        if (e.getSource() == next){

            if(!(q.queueLength == 0)){

            q.next();

            if(windowSizeY > (20 * q.queueLength) + 100){
                windowSizeY = windowSizeY - 20;
                this.setSize(currCanvasX,windowSizeY);

            }

            repaint();
            }
        }

        repaint();
    }

    public void UI() {
        // TODO Add object UI elements


        switch (UIType) //swtich for different UITypes
        {
            case 1:
                join.setBounds(10,10,50,20);
                next.setBounds(10,30,50,20);
                addToQueue.setBounds(70,10,currCanvasX-78,20);
                break;
        }
    }

    public void paintedUI(Graphics g) {
        // TODO Add any graphics UI elements


        switch (UIType) //swtich for different UITypes
        {
            case 1:
                g.drawLine(70,30,70,currCanvasY - 20);
                g.drawLine(currCanvasX - 10,30,currCanvasX - 10,currCanvasY - 20);
                g.drawLine(70,30,currCanvasX - 10,30);
                g.drawLine(70,50,currCanvasX - 10,50);
                for(int i = 0; i < q.getQueueLength();i++){
                    g.drawString(q.getQueuePos(i),75 ,45 + (i * 20));
                }
                // eg: g.drawString("Hello World", currCanvasX/2, 40);
                break;
        }
    }

    public void update(Graphics g) {
        // This can be changed to use a switch
        g.clearRect(0, 0, currCanvasX, currCanvasY);
        paint(g);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////

class Queue {

    String q[] = new String[200]; //max strings is 200 .... yeah its overkill a little
    int queueLength;

    public void join(String input){
        q[queueLength] = input;
        queueLength++;
    }

    public void next(){
        for(int i = 1; i < queueLength; i++){
            q[i - 1] = q[i];
            q[i] = null;
        }
        queueLength--;
    }

    public String getQueuePos(int pos){
        return q[pos];
    }

    public int getQueueLength(){
        return queueLength;
    }
}