//Quetion 14
import java.util.Scanner;

public class CylinderAreaVolumeComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Radius of Cylinder: ");
	int radius = input.nextInt();

	System.out.print("Enter Height of Cylinder: ");
	int height = input.nextInt();

	double volume = Math.PI * radius * radius * height;
	double area = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);

	System.out.printf("Surface Area = %f%n", area);
	System.out.printf("Surface Volume = %f", volume);

			}
}