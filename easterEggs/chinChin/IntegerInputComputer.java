//Quetion 13
import java.util.Scanner;

public class IntegerInputComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first Integer: ");
	int m = input.nextInt();

	System.out.print("Enter Second Integer: ");
	int n = input.nextInt();

	if (n == 0){
				
		System.out.print("Second integer should not be Zero");
			} else {
			
		double divide = m/n;

		System.out.printf("Result: %.2f", divide);
			}

			}
}