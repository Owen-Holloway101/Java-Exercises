//Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ex12a_rewrite extends Applet implements ActionListener,
		KeyListener {

	Button No0, No1, No2, No3, No4, No5, No6, No7, No8, No9, add, sub, div,
			mul, squ, cube, squRoot, decimal, equ, clr;
	String buttonPressed;
	double currentNumber, previousNumber, decimalNumber, output;
	int operation, dec;

	public void init() {
		showStatus("init");
		System.out.println("init");

		this.setSize(180, 250);

		dec = 0;
		currentNumber = 0;
		decimalNumber = 0;

		// ##############################################

		No0 = new Button("0");
		No0.setBounds(50, 210, 40, 40);
		No0.setBackground(new Color(0, 100, 200));

		No1 = new Button("1");
		No1.setBounds(10, 90, 40, 40);
		No1.setBackground(new Color(0, 100, 200));

		No2 = new Button("2");
		No2.setBounds(50, 90, 40, 40);
		No2.setBackground(new Color(0, 100, 200));

		No3 = new Button("3");
		No3.setBounds(90, 90, 40, 40);
		No3.setBackground(new Color(0, 100, 200));

		No4 = new Button("4");
		No4.setBounds(10, 130, 40, 40);
		No4.setBackground(new Color(0, 100, 200));

		No5 = new Button("5");
		No5.setBounds(50, 130, 40, 40);
		No5.setBackground(new Color(0, 100, 200));

		No6 = new Button("6");
		No6.setBounds(90, 130, 40, 40);
		No6.setBackground(new Color(0, 100, 200));

		No7 = new Button("7");
		No7.setBounds(10, 170, 40, 40);
		No7.setBackground(new Color(0, 100, 200));

		No8 = new Button("8");
		No8.setBounds(50, 170, 40, 40);
		No8.setBackground(new Color(0, 100, 200));

		No9 = new Button("9");
		No9.setBounds(90, 170, 40, 40);
		No9.setBackground(new Color(0, 100, 200));

		// ##############################################

		add = new Button("+");
		add.setBounds(130, 90, 40, 40);
		add.setBackground(new Color(20, 250, 50));

		sub = new Button("-");
		sub.setBounds(130, 130, 40, 40);
		sub.setBackground(new Color(20, 250, 50));

		mul = new Button("x");
		mul.setBounds(130, 170, 40, 40);
		mul.setBackground(new Color(20, 250, 50));

		div = new Button("/");
		div.setBounds(130, 210, 40, 40);
		div.setBackground(new Color(20, 250, 50));

		squ = new Button("x²");
		squ.setBounds(50, 50, 40, 40);
		squ.setBackground(new Color(20, 120, 50));

		cube = new Button("x³");
		cube.setBounds(90, 50, 40, 40);
		cube.setBackground(new Color(20, 120, 50));

		squRoot = new Button("//"); /* √ */
		squRoot.setBounds(130, 50, 40, 40);
		squRoot.setBackground(new Color(20, 120, 50));

		// ##############################################

		equ = new Button("=");
		equ.setBounds(90, 210, 40, 40);
		equ.setBackground(new Color(20, 250, 50));

		decimal = new Button("//");
		decimal.setBounds(10, 210, 40, 40);
		decimal.setBackground(new Color(20, 250, 50));

		clr = new Button("Clr-All");
		clr.setBounds(10, 50, 40, 40);
		clr.setBackground(new Color(200, 50, 15));

		// ##############################################

		add(No1);
		add(No2);
		add(No3);
		add(No4);
		add(No5);
		add(No6);
		add(No7);
		add(No8);
		add(No9);
		add(No0);

		// ##############################################

		add(add);
		add(sub);
		add(mul);
		add(div);
		add(squ);
		add(cube);
		add(squRoot);

		// ##############################################

		add(equ);
		add(decimal);
		add(clr);

		// ##############################################

		No0.addActionListener(this);
		No1.addActionListener(this);
		No2.addActionListener(this);
		No3.addActionListener(this);
		No4.addActionListener(this);
		No5.addActionListener(this);
		No6.addActionListener(this);
		No7.addActionListener(this);
		No8.addActionListener(this);
		No9.addActionListener(this);

		// ##############################################

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		squ.addActionListener(this);
		cube.addActionListener(this);

		// ##############################################

		equ.addActionListener(this);
		decimal.addActionListener(this);
		clr.addActionListener(this);

		// ##############################################

		addKeyListener(this);

		setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		showStatus("ButtonPress");
		System.out.println("ButtonPress");

		// ##############################################

		if (e.getSource() == No0) {
			System.out.println("No0");
			if (dec == 0)
				currentNumber = currentNumber * 10;
			else if (dec == 1)
				decimalNumber = decimalNumber / 10;
			output = currentNumber;
		}

		if (e.getSource() == No1) {
			System.out.println("No1");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 1;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (1 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No2) {
			System.out.println("No2");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 2;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (2 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No3) {
			System.out.println("No3");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 3;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (3 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No4) {
			System.out.println("No4");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 4;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (4 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No5) {
			System.out.println("No5");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 5;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (5 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No6) {
			System.out.println("No6");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 6;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (6 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No7) {
			System.out.println("No7");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 7;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (7 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No8) {
			System.out.println("No8");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 8;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (8 / 10);
			output = currentNumber;
		}

		if (e.getSource() == No9) {
			System.out.println("No9");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 9;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (9 / 10);
			output = currentNumber;
		}

		// ##############################################

		if (e.getSource() == add) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			previousNumber = currentNumber;
			operation = 1;
			currentNumber = 0;
			System.out.println("add");
		}

		if (e.getSource() == sub) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			previousNumber = currentNumber;
			operation = 2;
			currentNumber = 0;
			System.out.println("sub");
		}

		if (e.getSource() == mul) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			previousNumber = currentNumber;
			operation = 3;
			currentNumber = 0;
			System.out.println("mul");
		}

		if (e.getSource() == div) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			previousNumber = currentNumber;
			operation = 4;
			currentNumber = 0;
			System.out.println("div");
		}

		if (e.getSource() == squ) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			currentNumber = currentNumber * currentNumber;
			output = currentNumber;
			System.out.println("squ");
		}

		if (e.getSource() == cube) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			currentNumber = currentNumber * currentNumber * currentNumber;
			output = currentNumber;
			System.out.println("squ");
		}

		// ##############################################

		if (e.getSource() == equ) {
			switch (operation) {
			case 1:
				output = currentNumber + previousNumber;
				// previousNumber = currentNumber;
				System.out.println("add");
				break;
			case 2:
				output = previousNumber - currentNumber;
				// previousNumber = currentNumber;
				System.out.println("sub");
				break;
			case 3:
				output = currentNumber * previousNumber;
				// previousNumber = currentNumber;
				System.out.println("mul");
				break;
			case 4:
				output = currentNumber / previousNumber;
				// previousNumber = currentNumber;
				System.out.println("div");
				break;
			}
			previousNumber = output;
			System.out.println("equals");
		}

		// ##############################################

		if (e.getSource() == decimal) {
			// TODO FIX IT
			// dec = 1;
			System.out.println("decimal");
		}

		if (e.getSource() == clr) {
			output = 0;
			currentNumber = 0;
			previousNumber = 0;
		}

		System.out.println("currentNumber: " + currentNumber);
		System.out.println("decimalNumber: " + decimalNumber);
		System.out.println("previousNumber: " + previousNumber);

		repaint();
	}

	public void paint(Graphics g) {
		showStatus("Paint");
		System.out.println("Paint");

		this.requestFocusInWindow();

		g.drawRect(10, 10, 160, 30);

		g.drawString(Double.toString(output), 15, 30);

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		System.out.println("Key Typed: " + c);

		// ##############################################

		if (e.getKeyChar() == '0') {
			System.out.println("No0");
			if (dec == 0)
				currentNumber = currentNumber * 10;
			else if (dec == 1)
				decimalNumber = decimalNumber / 10;
			output = currentNumber;
		}

		if (e.getKeyChar() == '1') {
			System.out.println("No1");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 1;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (1 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '2') {
			System.out.println("No2");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 2;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (2 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '3') {
			System.out.println("No3");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 3;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (3 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '4') {
			System.out.println("No4");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 4;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (4 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '5') {
			System.out.println("No5");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 5;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (5 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '6') {
			System.out.println("No6");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 6;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (6 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '7') {
			System.out.println("No7");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 7;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (7 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '8') {
			System.out.println("No8");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 8;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (8 / 10);
			output = currentNumber;
		}

		if (e.getKeyChar() == '9') {
			System.out.println("No9");
			if (dec == 0)
				currentNumber = (currentNumber * 10) + 9;
			else if (dec == 1)
				decimalNumber = (decimalNumber / 10) + (9 / 10);
			output = currentNumber;
		}

		// ##############################################

		if (e.getKeyChar() == '+') {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			operation = 1;
			previousNumber = currentNumber;
			currentNumber = 0;
			System.out.println("add");
		}

		if (e.getKeyChar() == '-') {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			operation = 2;
			previousNumber = currentNumber;
			currentNumber = 0;
			System.out.println("sub");
		}

		if (e.getKeyChar() == '*') {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			operation = 3;
			previousNumber = currentNumber;
			currentNumber = 0;
			System.out.println("mul");
		}

		if (e.getKeyChar() == '/') {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			operation = 4;
			previousNumber = currentNumber;
			currentNumber = 0;
			System.out.println("div");
		}

		if (e.getSource() == squ) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			currentNumber = currentNumber * currentNumber;
			output = currentNumber;
			System.out.println("squ");
		}

		if (e.getSource() == cube) {
			if (dec == 1)
				currentNumber = currentNumber + decimalNumber;
			currentNumber = currentNumber * currentNumber * currentNumber;
			output = currentNumber;
			System.out.println("squ");
		}

		// ##############################################

		if (e.getKeyChar() == '=') {
			switch (operation) {
			case 1:
				output = currentNumber + previousNumber;
				// previousNumber = currentNumber;
				System.out.println("add");
				break;
			case 2:
				output = currentNumber - previousNumber;
				// previousNumber = currentNumber;
				System.out.println("sub");
				break;
			case 3:
				output = currentNumber * previousNumber;
				// previousNumber = currentNumber;
				System.out.println("mul");
				break;
			case 4:
				output = currentNumber / previousNumber;
				// previousNumber = currentNumber;
				System.out.println("div");
				break;
			}
			previousNumber = output;
			currentNumber = previousNumber;
			System.out.println("equals");
		}

		// ##############################################

		if (e.getSource() == decimal) {
			// TODO FIX IT
			// dec = 1;
			System.out.println("decimal");
		}

		if (e.getKeyChar() == 'o') {
			output = 0;
			currentNumber = 0;
			previousNumber = 0;
		}

		System.out.println("currentNumber: " + currentNumber);
		System.out.println("decimalNumber: " + decimalNumber);
		System.out.println("previousNumber: " + previousNumber);

		repaint();
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}