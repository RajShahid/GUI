package GUI;

import java.util.Scanner;

public class Age_Message {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("Your name: ");
	    String name=input.next();
		System.out.print("Your age: ");
		int age=input.nextInt();
		  
		  if(age<16)
		  {  
			  System.out.println("\nYou can't drive."+name);
		  }
		  if(age>=16 && age<=17)
		  {
			  System.out.println("\nYou can drive but can't vote."+name);  
		  }
		  if(age>=18 && age<=24)
		  {  
			  System.out.println("\nYou can vote but can't rent a car."+name);		  
		  }
		  if(age>=25)
		  {  
			  System.out.println("\nYou can do pretty much anything."+name);  
		  }	
	}
}
