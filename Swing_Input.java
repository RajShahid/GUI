package GUI;

import javax.swing.*; 

public class Swing_Input {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name "); 
		String input = JOptionPane.showInputDialog("How old are you ");
		int age = Integer.parseInt(input);
				
		System.out.println("Hi, "+name);
		System.out.println("Next year you will be "+(age+1));
		System.exit(0);
	}

}
