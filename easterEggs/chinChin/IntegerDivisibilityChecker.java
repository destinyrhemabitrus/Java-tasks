//Quetion 3
import java.util.Scanner;

public class IntegerDivisibilityChecker{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: ");
	int num = input.nextInt();

	int checkOne = num%2;
	int checkTwo = num%5;

	if (checkOne == 0){
		System.out.print("HiEven");
		} 
		
	if (checkTwo == 0){
		System.out.print("HiFive");
		} 
			}
}