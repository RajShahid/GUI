package GUI;

import java.util.Scanner;

public class TwentyQuetions {

	
	public static void main(String[] args) {
		
		String name;
		String ans;
		String a  = "Y";
		String b = "N";
		String animal = "animal";
		String vegetable = "vegetable";
		String mineral = "mineral";
		   
		Scanner in = new Scanner(System.in);
		System.out.println("Two Question ");
		System.out.println("Think of an object, and I'll try to guess it .");
		System.out.println("Question 1) Is it animal, vegetable, or mineral ?");
		name = in.next();
		System.out.println("Question 2) Is it bigger than a breadbox ?");
		System.out.println("Enter Y for yes and N for no");
	    ans = in.next();

	    if(ans.equals(a))
	    {
			   
			   if(name.equals(animal))
					   {
				          System.out.println("My guess is that you are thinking of a mouse.");
					   }
			   else if(name.equals(vegetable))
			   {	   
				   System.out.println("My guess is that you are thinking of a watermelon.");
			   }
               else if(name.equals(mineral))
               {		   
				   System.out.println("My guess is that you are thinking of a carnaro.");
			   }
	   }
	  else if(ans.equals(b))
		   {		   
           if(name.equals(animal))
              {   
				   System.out.println("My guess is that you are thinking of a squirrel.");
	    	  }
		   else if(name.equals(vegetable))
		      {
	   		    System.out.println("My guess is that you are thinking of a carrot.");
		      }
           else if(name.equals(mineral))
              {	   
			     System.out.println("My guess is that you are thinking of a paperclip.");
			  }
		   }
		   else
		   {
			   System.out.println("Invalid input!");
		   }
	}
}
