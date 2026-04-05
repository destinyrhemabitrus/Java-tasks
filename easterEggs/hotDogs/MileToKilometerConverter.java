//Quetion 1
import java.util.Scanner;

public class MileToKilometerConverter{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int num = input.nextInt();

	double kilometer = num * 1.6;

	System.out.printf("The value you entered in miles converts to %f Kilometer", kilometer);

	}
}