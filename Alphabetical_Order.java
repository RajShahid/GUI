package GUI;

import java.util.Scanner;

public class Alphabetical_Order {

		public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		String name1 ="Carswell";
		String name2 ="Jones";
		String name3 ="Smith";
		String name4 ="Young";
		
		System.out.print("What's your last name? ");
		String name=input.next();
		
		int first=name.compareTo(name1);
		int second =name.compareTo(name2);
		int third =name.compareTo(name3);
		int fourth =name.compareTo(name4);
		if(first<=0)
		{
		
			System.out.println("You don't have to wait long "+name);
		}
		else if(second<=0)
		{
		  System.out.println("that's not bad "+name);
	    }
		else if(third<=0)
		{
			System.out.println("looks like a bit of a wait "+name);
	    }
		else if(fourth<=0)
		 {
			  System.out.println("it's gonna be a while "+name);
	     }
		else if(fourth>0)
		{	
			 System.out.println("not going anywhere for a while? "+name);	
		}
	}

}
