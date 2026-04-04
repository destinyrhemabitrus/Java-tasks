//A program that takes two numbers and prints their difference

import java.util.Scanner;
public class TaskFour{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter Second number: ");
		int num2 = input.nextInt();

		int diff = num1 - num2;

		System.out.printf("The difference of the first number and second number is %d", diff);

	}

}