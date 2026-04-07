//Quetion 17

import java.util.Scanner;

public class HypotenuseComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter two sides of Right triangle: ");
	int side1 = input.nextInt();
	int side2 = input.nextInt();
	
	double hypotenuse = Math.sqrt((side1 * side1) + side2 * side2);

	System.out.printf("Hypotenuse = %f", hypotenuse);
	}
}