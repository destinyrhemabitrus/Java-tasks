// A program that ask for length and width and prints area

import java.util.Scanner;
public class TaskTwenty{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.println("Enter length of rectangle: ");
		int length = input.nextInt();

		System.out.println("Enter width of rectangle: ");
		int width = input.nextInt();

		int area = length * width;

		System.out.printf("Area = %d", area);
		 
	}

}