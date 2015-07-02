package GUI;

import java.util.Scanner;

public class BMI_Catogories {

	
	public static void main(String[] args) {
       
		int height_in_inches;
		int weight_in_pounds;
		double inches_to_meter;
		double pound_to_kg;
		double square;
		double bmi;
		double round_bmi;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Your height in inches:  ");
		height_in_inches = in.nextInt();
		
		System.out.print("Your weight in pounds:  ");
		weight_in_pounds = in.nextInt();
		
		inches_to_meter = height_in_inches * 0.02540;
		pound_to_kg = weight_in_pounds * ( 1 / 2.2 );
		square = inches_to_meter * inches_to_meter;
		bmi = pound_to_kg / square;
		round_bmi = Math.round(bmi * 100.0)/100.0;
		System.out.println("");
		
		if(bmi<15.0)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: Very severely underweight ");
		}
		else if(bmi>=15.0 && bmi<=16.0)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: severely underweight ");
		}
		else if(bmi>=16.1 && bmi<=18.4)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: underweight ");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: normal weight ");
		}
		else if(bmi>=25.0 && bmi<=29.9)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: overweight ");
		}
		else if(bmi>=30.0 && bmi<=34.9)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: moderately obese ");
		}
		else if(bmi>=35.0 && bmi<=39.9)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: severely obese ");
		}
		else if(bmi>=40.0)
		{	
			System.out.println("Your BMI is "+round_bmi);
			System.out.println("BMI Category: very severely obese ");
		}
	}
}
