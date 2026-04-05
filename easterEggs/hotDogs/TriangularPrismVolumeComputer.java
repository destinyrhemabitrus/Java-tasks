//Quetion 3
import java.util.Scanner;

public class TriangularPrismVolumeComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Length of sides of Equilateral triangle: ");
	int length_sides = input.nextInt();
	
	System.out.print("Enter Length triangular prism: ");
	int length_prism = input.nextInt();


	double area = Math.sqrt(3)/4 * length_sides * length_sides;
	double volume = area * length_prism;

	System.out.printf("Volume of triangle Prism is %f", volume);
	
	}
}