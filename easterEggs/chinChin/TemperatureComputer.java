//Quetion 16

import java.util.Scanner;

public class TemperatureComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Temperature in Celsius: ");
	double temp = input.nextFloat();
	
	if (temp < 0){

		System.out.print("Temperature: Freezing");		

		} else if(temp <= 15) {
		
		System.out.print("Temperature: Cold");		

			}

		 else if(temp <= 25) {
		
		System.out.print("Temperature: Warm");		

			}

		 else  {
		
		System.out.print("Temperature: Hot");		

			}

		
	}
}