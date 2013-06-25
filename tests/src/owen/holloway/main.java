package owen.holloway;

import owen.holloway.applets.*;

import java.awt.*;

public class main {

    static Frame frame, frameApplet;
    public static boolean nextApplet;
    public static int applet = 0;

    public static void main(String[] args) {
        System.out.println("Running");
        System.out.println("main");

        main m = new main();
        nextApplet = false;

        m.startup();

        while (!nextApplet) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }

        //frame.remove(applet);
        frame.dispose();

        switch (applet) {
            case 0:
                m.ex1();
                break;

            case 1:
                m.ex2();
                break;

            case 2:
                m.ex3();
                break;

            case 3:
                m.ex4();
                break;

            case 4:
                m.ex5();
                break;

            case 5:
                m.ex6();
                break;

            case 6:
                m.ex7();
                break;

            case 7:
                m.ex8();
                break;

            case 8:
                m.ex9();
                break;

            case 9:
                m.ex10();
                break;

            case 10:
                m.ex10a();
                break;

            case 11:
                m.ex11();
                break;

            case 12:
                m.ex11a();
                break;

            case 13:
                m.ex11b();
                break;

            case 14:
                m.ex12();
                break;

            case 15:
                m.ex12a();
                break;

            case 17:
                m.ex12b();
                break;

            case 16:
                m.ex12a_rewrite();
                break;

            case 18:
                m.ex13();
                break;

            case 19:
                m.ex14();
                break;

            case 20:
                m.ex15();
                break;

            case 21:
               m.ex15a();
                break;

            case 22:
                //m.ex15b();
                break;

            case 23:
                m.ex16();
                break;

            case 24:
                m.ex16a();
                break;

            case 25:
                m.ex16b();
                break;
        }
    }

    public void ex1() {

        frameApplet = new Frame("ex1");

        ex1 applet = new ex1();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex2() {

        frameApplet = new Frame("ex2");

        ex2 applet = new ex2();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex3() {

        frameApplet = new Frame("ex3");

        ex3 applet = new ex3();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex4() {

        frameApplet = new Frame("ex4");

        ex4 applet = new ex4();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex5() {

        frameApplet = new Frame("ex5");

        ex5 applet = new ex5();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex6() {

        frameApplet = new Frame("ex6");

        ex6 applet = new ex6();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex7() {

        frameApplet = new Frame("ex7");

        ex7 applet = new ex7();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex8() {

        frameApplet = new Frame("ex8");

        ex8 applet = new ex8();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex9() {

        frameApplet = new Frame("ex9");

        ex9 applet = new ex9();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex10() {

        frameApplet = new Frame("ex10");

        ex10 applet = new ex10();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex10a() {

        frameApplet = new Frame("ex10a");

        ex10a applet = new ex10a();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex11() {

        frameApplet = new Frame("ex11");

        ex11 applet = new ex11();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex11a() {

        frameApplet = new Frame("ex11a");

        ex11a applet = new ex11a();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex11b() {

        frameApplet = new Frame("ex11b");

        ex11b applet = new ex11b();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex12() {

        frameApplet = new Frame("ex12");

        ex12 applet = new ex12();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex12a() {

        frameApplet = new Frame("ex12a");

        ex12a applet = new ex12a();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex12a_rewrite() {

        frameApplet = new Frame("ex12a");

        ex12a_rewrite applet = new ex12a_rewrite();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex12b() {

        frameApplet = new Frame("ex12b");

        ex12b applet = new ex12b();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex13() {

        frameApplet = new Frame("ex13");

        ex13 applet = new ex13();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex14() {

        frameApplet = new Frame("ex14");

        ex14 applet = new ex14();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex15() {

        frameApplet = new Frame("ex15");

        ex15 applet = new ex15();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex15a() {

        frameApplet = new Frame("ex15a");

        ex15a applet = new ex15a();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex16() {

        frameApplet = new Frame("ex16");

        ex16 applet = new ex16();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex16a() {

        frameApplet = new Frame("ex16a");

        ex16a applet = new ex16a();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void ex16b() {

        frameApplet = new Frame("ex16b");

        ex16b applet = new ex16b();

        applet.start();


        frameApplet.addWindowListener(new windowMonitor());
        frameApplet.add(applet);
        frameApplet.setSize(300, 300);
        frameApplet.setVisible(true);

        applet.init();
    }

    public void startup() {

        frame = new Frame("startup");

        startup applet = new startup();

        applet.start();


        frame.addWindowListener(new windowMonitor());
        frame.add(applet);
        frame.setSize(200, 570);
        frame.setVisible(true);

        applet.init();
    }


}
