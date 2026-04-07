//Quetion 3

import java.util.Scanner;

public class MultipleOfSecondIntergerComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter two numbers: ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();

	int check = num1%num2;
	
	if(check == 0){
		System.out.printf("%d is a Multiple of %d", num1, num2);
		} else {
		System.out.printf("%d is not a Multiple of %d", num1, num2);
	
			}

		}
}