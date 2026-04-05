//Quetion 10
import java.util.Scanner;

public class WaterEnergyCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Amount of water in Kg: ");
	int waterAmount_M = input.nextInt();
	
	System.out.print("Enter initial Temperature in degrees: ");
	int initialTemp = input.nextInt();

	System.out.print("Enter final Temperature in degrees: ");
	int finalTemp = input.nextInt();

	int energy_Q = waterAmount_M * (finalTemp - initialTemp) * 4184;
		
	System.out.printf("The Energy needed to heat the water from initial Temp to Final Temp is %dJoule (J)", energy_Q);

	}
}