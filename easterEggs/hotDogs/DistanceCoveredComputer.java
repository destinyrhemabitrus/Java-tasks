//Quetion 9
import java.util.Scanner;

public class DistanceCoveredComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter initial velocity in Meteres: ");
	int u = input.nextInt();
	
	System.out.print("Enter time span in Seconds: ");
	int t = input.nextInt();

	System.out.print("Enter acceleration span in m/s sqr: ");
	int a = input.nextInt();

	double distance = u * t + ((a * t * t)/2);
	
	System.out.printf("The distance covered (s) is %f", distance);

	}
}