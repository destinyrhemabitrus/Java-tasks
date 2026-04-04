// A program that takes a number and prints the number minus 5

import java.util.Scanner;
public class TaskEighteen{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int num = input.nextInt();
		
		int result = num - 5;

		System.out.printf("The difference between the Entered number and 5 is %d: ", result);
		 
	}

}