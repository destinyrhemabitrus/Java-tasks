// A program that takes a number and prints its remainder when divided by 2

import java.util.Scanner;
public class TaskNineteen{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int num = input.nextInt();
		
		int result = num%2;

		System.out.printf("The remainder when the entered number is divided by 2 is: %d", result);
		 
	}

}