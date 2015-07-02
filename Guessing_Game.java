package GUI;

import java.util.Scanner;

public class Guessing_Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int secret_no = 5;
		int input;
		
		System.out.println("The Worst Number Guessing Game Ever!");
		System.out.print("\nI'M THKING OF A NBR FROM 1-10.  TRY 2 GESS!  ");
	
		input=in.nextInt();	
	    if(input == secret_no)
	    {   
		   System.out.println("\nLOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + secret_no+ "!");
	    }
	   else
	   {   
		   System.out.println("\nSorry! Wrong answer");
	   }
	}
}
