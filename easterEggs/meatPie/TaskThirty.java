// A program that ask for two numbers and print their sum and product

import java.util.Scanner;
public class TaskThirty{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.println("Enter First number: ");
		int num1 = input.nextInt();

		System.out.println("Enter Second number: ");
		int num2 = input.nextInt();

		int sum = num1 + num2;
		int product = num1 * num2;

		System.out.printf("The sum and product of the first and second number are: %d and %d respectively", sum, product);
		 
	}

}