// A program that takes a radius and print and print the area of a circle

import java.util.Scanner;
public class TaskTwentyTwo{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.println("Enter radius of circle: ");
		int radius = input.nextInt();

		double area = 3.142 * (radius * radius);

		System.out.printf("Area of circle is = %f", area);
		 
	}

}