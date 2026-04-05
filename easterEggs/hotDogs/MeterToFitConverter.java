//Quetion 4
import java.util.Scanner;

public class MeterToFitConverter{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int num = input.nextInt();

	double feet = num * 3.2786;

	System.out.printf("The value you entered in Meters converts to %fFt (feet)", feet);

	}
}