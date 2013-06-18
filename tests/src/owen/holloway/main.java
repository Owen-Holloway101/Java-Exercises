package owen.holloway;

import owen.holloway.applets.*;

import java.awt.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class main {

    public static void main(String[] args){
        System.out.println("Running");
        System.out.println("main");

        Frame frame = new Frame("Applet test");

        ex16b ex16_applet = new ex16b();
        ex13 ex13_applet = new ex13();
        ex12a_rewrite ex12a_rewrite_applet = new ex12a_rewrite();
        ex12a ex12a_applet = new ex12a();

        System.out.println("1");

        frame.addWindowListener(new windowMonitor());
        frame.add(ex12a_applet);
        frame.setSize(500, 400);
        frame.setVisible(true);

        System.out.println("2");

        //ex12a_applet.init();
        //ex12a_applet.start();

        System.out.println("3");

    }

}
