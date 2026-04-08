//Quetion 24

import java.util.Scanner;

public class AreaOfTriangleComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the height and base of Triangle: ");
	int base = input.nextInt();
	int height = input.nextInt();

	double area = (1/2.0) * base * height;
	
	System.out.printf("Area of triangele = %f", area);
	}
}