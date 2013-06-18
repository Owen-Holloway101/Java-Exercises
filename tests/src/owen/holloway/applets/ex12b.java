package owen.holloway.applets;//Owen Holloway GYC
//Uses scaling template 1.0

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex12b extends Applet implements ActionListener {

	Button startVote, endVote, nextVoter;

	Button bcand1, bcand2, bcand3, bcand4;
	String scand1, scand2, scand3, scand4;
	TextField tcand1, tcand2, tcand3, tcand4;
	int cand1v, cand2v, cand3v, cand4v;

	int voteRunning;
	int canvasX, canvasY, currCanvasX, currCanvasY;

	public void init() {

		this.setSize(200, 250);

		canvasX = getWidth() + 1;
		canvasY = getHeight() + 1;

		voteRunning = 0;

		scand1 = "cand1";
		scand1 = "cand2";
		scand1 = "cand3";
		scand1 = "cand4";

		cand1v = 0;
		cand2v = 0;
		cand3v = 0;
		cand4v = 0;

		bcand1 = new Button("cand1");
		bcand2 = new Button("cand2");
		bcand3 = new Button("cand3");
		bcand4 = new Button("cand4");

		startVote = new Button("startVote");
		endVote = new Button("endVote");
		nextVoter = new Button("nextVoter");

		tcand1 = new TextField(10);
		tcand2 = new TextField(10);
		tcand3 = new TextField(10);
		tcand4 = new TextField(10);

		add(bcand1);
		add(bcand2);
		add(bcand3);
		add(bcand4);

		add(tcand1);
		add(tcand2);
		add(tcand3);
		add(tcand4);

		add(startVote);
		add(endVote);
		add(nextVoter);

		setLayout(null);
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		currCanvasX = getWidth();
		currCanvasY = getHeight();

		if (canvasY == currCanvasY & canvasX == currCanvasX) {
		}

		else {
			System.out.println("change");
			removeObjects();
			UI(g);
			canvasX = currCanvasX;
			canvasY = currCanvasY;
		}
	}

	public void UI(Graphics g) {
		if (voteRunning == 0) {
			tcand1 = new TextField(10);
			tcand1.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 40,
					currCanvasX - 20, 30);
			add(tcand1);

			tcand2 = new TextField(10);
			tcand2.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 80,
					currCanvasX - 20, 30);
			add(tcand2);

			tcand3 = new TextField(10);
			tcand3.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 120,
					currCanvasX - 20, 30);
			add(tcand3);

			tcand4 = new TextField(10);
			tcand4.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 160,
					currCanvasX - 20, 30);
			add(tcand4);

			startVote = new Button("Start Vote");
			startVote.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 200,
					currCanvasX - 20, 30);
			add(startVote);
			startVote.addActionListener(this);
		}

		if (voteRunning == 1) {
			bcand1 = new Button(scand1);
			bcand1.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 40,
					currCanvasX - 20, 30);
			add(bcand1);
			bcand1.addActionListener(this);

			bcand2 = new Button(scand2);
			bcand2.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 80,
					currCanvasX - 20, 30);
			add(bcand2);
			bcand2.addActionListener(this);
			

			bcand3 = new Button(scand3);
			bcand3.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 120,
					currCanvasX - 20, 30);
			add(bcand3);
			bcand3.addActionListener(this);

			bcand4 = new Button(scand4);
			bcand4.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 160,
					currCanvasX - 20, 30);
			add(bcand4);
			bcand4.addActionListener(this);

			endVote = new Button("end vote");
			endVote.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 200,
					currCanvasX - 20, 30);
			add(endVote);
			endVote.addActionListener(this);
		}

		if (voteRunning == 2) {
			nextVoter = new Button("Next Voter");
			nextVoter.setBounds(currCanvasX / 2 - (currCanvasX - 20) / 2, 10,
					currCanvasX - 20, 30);
			add(nextVoter);
			nextVoter.addActionListener(this);
		}

		if (voteRunning == 3) {
			g.drawString("Candidate#1: " + scand1, 10, 50);
			g.drawString("Votes: " + cand1v, 10, 75);
			g.drawLine(10, 83, currCanvasX - 10, 83);
			
			g.drawString("Candidate#2: " + scand2, 10, 100);
			g.drawString("Votes: " + cand2v, 10, 125);
			g.drawLine(10, 133, currCanvasX - 10, 133);
			
			g.drawString("Candidate#3: " + scand3, 10, 150);
			g.drawString("Votes: " + cand3v, 10, 175);
			g.drawLine(10, 183, currCanvasX - 10, 183);
			
			g.drawString("Candidate#4: " + scand4, 10, 200);
			g.drawString("Votes: " + cand4v, 10, 225);
			g.drawLine(10, 233, currCanvasX - 10, 233);
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		// System.out.println("ActionEvent");
		if (e.getSource() == startVote) {
			scand1 = tcand1.getText();
			scand2 = tcand2.getText();
			scand3 = tcand3.getText();
			scand4 = tcand4.getText();

			voteRunning = 1;

			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;

			repaint();
		}

		if (e.getSource() == bcand1) {
			cand1v = cand1v + 1;
			voteRunning = 2;
			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;
			repaint();
		}

		if (e.getSource() == bcand2) {
			cand2v = cand2v + 1;
			voteRunning = 2;
			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;
			repaint();
		}

		if (e.getSource() == bcand3) {
			cand3v = cand3v + 1;
			voteRunning = 2;
			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;
			repaint();
		}

		if (e.getSource() == bcand4) {
			cand4v = cand4v + 1;
			voteRunning = 2;
			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;
			repaint();
		}

		if (e.getSource() == nextVoter) {
			voteRunning = 1;
			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;
			repaint();
		}

		if (e.getSource() == endVote) {
			voteRunning = 3;
			canvasX = getWidth() + 1;
			canvasY = getHeight() + 1;
			repaint();
		}
	}

	public void removeObjects() {

		remove(bcand1);
		remove(bcand2);
		remove(bcand3);
		remove(bcand4);

		remove(tcand1);
		remove(tcand2);
		remove(tcand3);
		remove(tcand4);

		remove(startVote);
		remove(endVote);
		remove(nextVoter);
	}

}