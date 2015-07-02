package GUI;

import java.util.Scanner;

public class GenderGame {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	      
		String a = "y";
		String b = "n";
		String married;
		String female_gender = "female";
		String male_gender = "male";
		String gender;
		String first_name;
		String last_name;
		int age;
		
	   	System.out.print("What is your Gender Male or Female: ");
		gender = input.next();
		
		System.out.print("First name: ");
		first_name = input.next();
		
		System.out.print("Last name: ");
		last_name = input.next();
		
		System.out.print("Age: ");
		age = input.nextInt();
		
		if(gender.equals(female_gender) && age>=20)
		{	
			System.out.print("Are you married,"+first_name+"(Y or N)? ");
			married =input.next();

			if(married.equals(a)) 
			{
				 System.out.print("Then I shall call you Mrs. "+last_name);
			}
			else if(married.equals(b))
			{	 
				 System.out.print("Then I shall call you Ms. "+last_name);
			}
			}	
			else if(gender.equals(male_gender) && age>=20)
			{	 			 
				 System.out.println("Then I shall call you Mr. "+last_name);
			}		 
			else
			{		 
				 System.out.print("\nThen I shall call you "+first_name+" "+last_name+".");
		    }
	}
}
