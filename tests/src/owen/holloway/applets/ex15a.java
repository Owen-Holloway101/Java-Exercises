package owen.holloway.applets;//Owen Holloway GYC

import java.applet.Applet;
import java.awt.*;

public class ex15a extends Applet {
	char board[][] = new char[8][8];

	public void init() {
		this.setSize(500, 500);
		board[0][0] = 'R'; board[1][0] = 'N'; board[2][0] = 'B'; board[3][0] = 'K'; board[4][0] = 'Q'; board[5][0] = 'B'; board[6][0] = 'N'; board[7][0] = 'R';
		board[0][1] = 'p'; board[1][1] = 'p'; board[2][1] = 'p'; board[3][1] = 'p'; board[4][1] = 'p'; board[5][1] = 'p'; board[6][1] = 'p'; board[7][1] = 'p';
		
		board[0][6] = 'p'; board[1][6] = 'p'; board[2][6] = 'p'; board[3][6] = 'p'; board[4][6] = 'p'; board[5][6] = 'p'; board[6][6] = 'p'; board[7][6] = 'p';
		board[0][7] = 'R'; board[1][7] = 'N'; board[2][7] = 'B'; board[3][7] = 'Q'; board[4][7] = 'K'; board[5][7] = 'B'; board[6][7] = 'N'; board[7][7] = 'R';
	}

	public void paint(Graphics g) {

		for (int i = 0; i < 9; i++) {
			g.drawLine(50, 50 + (i * 50), 450, 50 + (i * 50)); //draws horizontal lines
		}

		for (int i = 0; i < 9; i++) {
			g.drawLine(50 + (i * 50), 50, 50 + (i * 50), 450); //draws vertical lines
		}
		
		

		for (int iy = 0; iy < 8; iy++) {
			for (int ix = 0; ix < 8; ix++) {
				//System.out.println(ix + ":" + iy);   //diagnostics commented out 
				g.drawString(String.valueOf(board[ix][iy]), 70 + (ix * 50), //Draws pieces
						80 + (iy * 50));
			}
		}
	}
}
