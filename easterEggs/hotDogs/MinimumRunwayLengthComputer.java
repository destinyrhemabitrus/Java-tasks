//Quetion 12
import java.util.Scanner;

public class MinimumRunwayLengthComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Acceleration (a) in m/s sqr: ");
	int a = input.nextInt();
	
	System.out.print("Enter take off speed (v) in m/s: ");
	int v = input.nextInt();

	double length = v * v / (2 * a);

	System.out.printf("The Minimum Runaway length needed is: %.2f", length);

	}
}