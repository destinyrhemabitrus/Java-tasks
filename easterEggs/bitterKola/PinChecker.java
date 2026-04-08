//Quetion 8

import java.util.Scanner;

public class PinChecker{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your 4 digit PIN: ");
	int pin = input.nextInt();
	
	int pinOne = 1000;
	int pinTwo = 9999;


	if(pin == pinOne || pin == pinTwo){
		System.out.print("Valid Pin");
		} else {
		System.out.print("Invalid Pin");
		
		}
	}
}