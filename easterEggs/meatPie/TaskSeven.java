//A program that takes a number and print it's square


import java.util.Scanner;
public class TaskSeven{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = input.nextInt();

		int square = num * num;

		System.out.printf("The square of the number entered is %d", square);

	}

}