// A program that ask for a name and age and print in a formatted way. i am "insert name" and i am "insert age" years old

import java.util.Scanner;
public class TaskTwentySix{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.println("What is your name: ");
		String name = input.nextLine();

		System.out.println("How old are you: ");
		int age = input.nextInt();

		System.out.printf("I am %s and i am %d years old", name, age);
		 
	}

}