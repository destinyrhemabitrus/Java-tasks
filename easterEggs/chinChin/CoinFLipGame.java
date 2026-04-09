//Quetion 5

import java.util.Scanner;
import java.security.SecureRandom;

public class CoinFLipGame{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	SecureRandom randomNumbers = new SecureRandom();

	System.out.print("Guess the coin flip — enter 1 for Head or 0 for Tail: ");
	int guess = input.nextInt();
		
	int coinFlip = randomNumbers.nextInt(2);	

	if(guess == coinFlip){ 
		System.out.print("Guess: Correct");
		} else {
		System.out.print("Guess: InCorrect");
	
		}
	}
		
}