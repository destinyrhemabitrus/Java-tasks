//A program that ask for a user's favorite color and prints it


import java.util.Scanner;
public class TaskNine{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your favorite color: ");
		String color = input.nextLine();

		System.out.printf("Your favorite color is %s", color);
		 
	}

}