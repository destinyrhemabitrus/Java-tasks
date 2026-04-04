// A program that takes a number and prints the number divided by 3

import java.util.Scanner;
public class TaskTwentyEight{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int num = input.nextInt();
		
		int result = num/3;

		System.out.printf("The value you entered divided by 3 is %d: ", result);
		 
	}

}