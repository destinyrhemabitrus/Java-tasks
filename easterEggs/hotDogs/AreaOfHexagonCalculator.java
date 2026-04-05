//Quetion 16
import java.util.Scanner;

public class AreaOfHexagonCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Side of hexagon: ");
	int side = input.nextInt();

	double area = ((3 * Math.sqrt(3))/2) * side * side;
	
	System.out.printf("Area of Hexagon is: %f", area);

	}
}