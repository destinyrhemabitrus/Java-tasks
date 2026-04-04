// A program that ask for two numbers and swap them

import java.util.Scanner;
public class TaskTwentyFour{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.println("Enter first and second number: ");

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int [] storage = {num1, num2};

		System.out.printf("Swapping num1 and num2: %d, %d",storage[1],storage[0]);
		 
	}

}