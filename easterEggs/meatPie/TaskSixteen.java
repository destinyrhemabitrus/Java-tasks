// A program that takes a number and prints the number multiplied by 5

import java.util.Scanner;
public class TaskSixteen{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int num = input.nextInt();
		
		int result = num * 5;

		System.out.printf("The Entered number multiplied by 5 is %d: ", result);
		 
	}

}