//Quetion 1

import java.util.Scanner;
import java.security.SecureRandom;

public class RainbowColorDisplay{

	public static void main(String[] args){
	
	SecureRandom randomNumbers = new SecureRandom();
		
	int selection = randomNumbers.nextInt(7);
	int setup = 1 + selection;

	String[] colors = {"Violet", "Indigo", "Blue", "Green","Yellow", "Orange", "Red"};
	
	System.out.print(colors[setup]);
	}
		
}