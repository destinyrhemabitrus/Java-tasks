// Write a program that ask for two numbers and print both

import java.util.Scanner;
public class TaskTwelve{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers of your choice: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("First number is: " + num1);
		System.out.println("Second number is: " + num2);
		 
	}

}