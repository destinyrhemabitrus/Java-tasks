//Quetion 14
import java.util.Scanner;

public class BmiCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your weight in pounds ");
	int weight = input.nextInt();

	System.out.print("Enter your Height in Inches ");
	int height = input.nextInt();
	
	double weight_inKg = weight * 0.45359237;
	double height_inMeters = height * 0.0254;

	double bmi = weight_inKg/(height_inMeters * height_inMeters);
	
	System.out.printf("Your Body mass index (BMI) is: %f", bmi);

	}
}