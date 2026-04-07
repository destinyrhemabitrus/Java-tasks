//Quetion 3
import java.util.Scanner;

public class RectanglePerimeterComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter length of Rectangle: ");
	int length = input.nextInt();

	System.out.print("Enter Width of Rectangle: ");
	int width = input.nextInt();

	if (length == width){
				
		System.out.print("Invalid inputs");
			} else {
			
		int perimeter = 2 * (length + width);

		System.out.printf("Perimeter of Rectangle is: %d", perimeter);
			}

			}
}