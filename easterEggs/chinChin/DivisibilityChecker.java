//Quetion 12

import java.util.Scanner;

public class DivisibilityChecker{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
		
	int checkOne = number%4;	
	int checkTwo = number%5;	

	if(checkOne==0&&checkTwo==0){ 
		System.out.print("Number is divisible by 4 and 5");
		} else if(checkOne==0||checkTwo==0){
		System.out.print("Number is divisible by 4 or 5");
	
		}
	}
		
}