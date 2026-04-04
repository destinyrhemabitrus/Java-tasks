// A program that takes a number and prints the number plus 10

import java.util.Scanner;
public class TaskSeventeen{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int num = input.nextInt();
		
		int result = num + 10;

		System.out.printf("The sum of the Entered number and 10 is %d: ", result);
		 
	}

}