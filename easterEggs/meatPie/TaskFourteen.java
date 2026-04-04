// A program that ask for three integers and print their average

import java.util.Scanner;
public class TaskFourteen{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers of your choice: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		int average = (num1 + num2 + num3)/3;

		System.out.printf("The average of the entered numbers is %d", average);
		 
	}

}