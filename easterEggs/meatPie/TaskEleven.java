// Write a program that takes a number and prints it's half

import java.util.Scanner;
public class TaskEleven{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		int divide = num/2;

		System.out.printf("The half of the entered number is %d", divide);
		 
	}

}