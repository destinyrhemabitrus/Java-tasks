//Quetion 18
import java.util.Scanner;

public class InterestForNextMonth{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Account Balance: ");
	int accBalance = input.nextInt();

	System.out.print("Enter Interest rate per year: ");
	int interest_rate = input.nextInt();


	double interest = accBalance * (interest_rate/1200.0);
	
	System.out.printf("Interest rate for next month is: %f", interest);

	}
}