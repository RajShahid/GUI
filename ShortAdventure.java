package GUI;

import java.util.Scanner;

public class ShortAdventure {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String kitchen = "kitchen";
		String refrigerator = "refrigerator";
		String cabinet = "cabinet";
		String upstairs = "upstairs";
		String bedroom = "bedroom";
		String bathroom = "bathroom";
		String no ="no";	
		String input;

		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");

		input = in.next();

		if(input.equals(kitchen))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side \nthere is, as you'd expect, a refrigerator.You may open the \"refrigerator\"\nor look in a \"cabinet\".?");

			input = in.next();
			if(input.equals(refrigerator))
			 {
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\nWould you like to eat some of the food? (\"yes\" or \"no\")?");
				input = in.next();
           
               if(input.equals(no))
                {  
            	   System.out.println("You die of starvation... eventually.\n Thanks for playing");
                }
               else
                {
            	   System.out.println("Thank u Good By");
                }
            }
			else if(input.equals(cabinet))
			 {
			 	System.out.println("Inside the Cabinet \n Would you like take something ? (\"yes\" or \"no\")?");
			 }
			input = in.next();  
            if(input.equals(no))
              {  
          	     System.out.println("Thank u Good by.");
              }
            else
              {
          	     System.out.println("Thank u Good By your adventure is ended");
              }
	    	}
    	else if(input.equals(upstairs))
				{
					System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n to go??");
					input = in.next();

					if(input.equals(bedroom))
					{
						System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n bed is unmade.  In the back of the room, the closet door is ajar.\n  Would you like to open the door? (\"yes\" or \"no\")?");
						input = in.next();

						if(input.equals(no))
						{
							System.out.println("Well, then I guess you'll never know what was in there. \n Thanks for playing");
						}
						else
						{
							 System.out.println("Thank u Good By your adventure is ended");
						}
					}
					else if(input.equals(bathroom))
					{
						System.out.println("Would you like to open the door? (\"yes\" or \"no\")?");
						input = in.next();
						if(input.equals(no))
						{
							System.out.println("Well, then I guess you'll never know what was in there. \n Thanks for playing");
						}
						else
						{
							 System.out.println("Thank u Good By your adventure is ended");
						}

					}
		    	}
		 }
	}
