// A program that takes a number and print it's cube


import java.util.Scanner;
public class TaskEight{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = input.nextInt();

		int cube = num * num * num;

		System.out.printf("The cube of the number entered is %d", cube);

	}

}