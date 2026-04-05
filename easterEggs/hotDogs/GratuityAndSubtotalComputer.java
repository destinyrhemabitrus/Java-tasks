//Quetion 6
import java.util.Scanner;

public class GratuityAndSubtotalComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Subtotal: ");
	int amount = input.nextInt();

	System.out.print("Enter Gratuity: ");
	int charge = input.nextInt();

	double gratuity = amount * (charge/100.0);
	double total = gratuity + amount;

	System.out.printf("Gratuity is $%.1f and total is $%.1f", gratuity, total);

	}
}