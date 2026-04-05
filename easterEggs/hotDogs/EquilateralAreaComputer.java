//Quetion 2
import java.util.Scanner;

public class EquilateralAreaComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Length of Equilateral triangle: ");
	int length = input.nextInt();

	double area = Math.sqrt(3)/4 * length * length;

	System.out.printf("Area of Equilateral triangle is %f", area);
	
	}
}