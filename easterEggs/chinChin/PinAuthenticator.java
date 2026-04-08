//Quetion 26

import java.util.Scanner;

public class PinAuthenticator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your 4 digit PIN: ");
	int pin = input.nextInt();
	
	int setupPin = 1234;
	int balance =1000;

	if(pin==setupPin){
		System.out.printf("Balance: $%d", balance);
		} else {
		System.out.print("Incorrect PIN");
		
		}
	}
}