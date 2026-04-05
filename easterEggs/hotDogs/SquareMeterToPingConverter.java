//Quetion 5
import java.util.Scanner;

public class SquareMeterToPingConverter{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in square meter: ");
	int num = input.nextInt();

	double ping = num * 0.3025;

	System.out.printf("The value you entered in SquareMeters converts to %f ping", ping);

	}
}