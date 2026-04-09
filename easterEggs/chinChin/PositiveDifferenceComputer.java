//Quetion 4

import java.util.Scanner;
import java.security.SecureRandom;

public class PositiveDifferenceComputer{

	public static void main(String[] args){
	
	SecureRandom randomNumbers = new SecureRandom();
		
	int selectionA = randomNumbers.nextInt(10);
	int selectionB = randomNumbers.nextInt(10);
	
	if(selectionA > selectionB){ 
		int difference = selectionA - selectionB;
		System.out.printf("Integer 1: %d%n",selectionA);
		System.out.printf("Integer 2: %d%n",selectionB);
		System.out.printf("Difference: %d",difference);
		} else {
		int difference = selectionB - selectionA;
		System.out.printf("Integer 1: %d%n",selectionA);
		System.out.printf("Integer 2: %d%n",selectionB);
		System.out.printf("Difference: %d",difference);
	
		}

	}
		
}