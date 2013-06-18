package owen.holloway.applets;

import java.applet.Applet;
import java.awt.*;

public class ex2 extends Applet 
{
	//global declaration of int variables
	int n;		
	int m;
	int sum;
	int diff;
	int prod;
	int quot;
	int remainder;
	int sumDivDiff;
	int sumProdDiff;
	int nPlusDiff;
	int diffPlusN;
	int nDivSum;
	
	public void init() 
	{
    	int localSum;	   //local declaration of an int variable.
		n = 25;		      //initialise values of n and m.
		m = 5;
		localSum = n + m;	//These calculations could be carried out in paint() or in init.
		sum = localSum;	
		diff = n - m;	   //Because the variables have been declared globally, the values
		prod = n*m;	      //can be transferred between the methods paint() and init().
		quot = n/m;
		remainder = n%m;
		//Practical Exercise
		sumDivDiff = ( sum ) / ( diff );  //(n + m) / (n - m) 
		sumProdDiff = ( sum ) * ( diff ); //(n + m) * (n - m) 
		nPlusDiff = n + ( diff );     //n + n / m 
		diffPlusN = ( diff ) + n;     //n / m + n 
		nDivSum = n / ( sum );        //n / (m + n) 
	}
	public void paint (Graphics g)
	{
		g.drawString("The original values are " + n + " and " + m, 25, 25);
		g.drawString("The sum is " + sum, 25, 50);
		g.drawString("The difference is " + diff, 25, 75);
		g.drawString("The product is " + prod, 25, 100);
		g.drawString("The quotient is " + quot, 25, 125);
		g.drawString("The remainder is " + remainder, 25, 150);
		g.drawString("EXERCISE#1 " + sumDivDiff, 25, 175);
		g.drawString("EXERCISE#2 " + sumProdDiff, 25, 200);
		g.drawString("EXERCISE#3 " + nPlusDiff, 25, 225);
		g.drawString("EXERCISE#4 " + diffPlusN, 25, 250);
		g.drawString("EXERCISE#5 " + nDivSum, 25, 275);
	}
}
