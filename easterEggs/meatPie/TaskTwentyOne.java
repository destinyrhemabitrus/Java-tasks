// A program that ask for base and height and prints area of triangle

import java.util.Scanner;
public class TaskTwentyOne{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.println("Enter base of triangle: ");
		int base = input.nextInt();

		System.out.println("Enter height of triangle: ");
		int height = input.nextInt();

		int area = (base * height)/2;

		System.out.printf("Area of triangle = %d", area);
		 
	}

}