//Quetion 27
import java.util.Scanner;

public class DivisibilityChecker{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: ");
	int num = input.nextInt();

	int checkOne = num%2;
	int checkTwo = num%3;
	int checkThree = num%5;
	int checkFour = num%7;

	if (checkOne == 0){
		System.out.printf("%d is divisible by 2%n",num);
		} 
		else {
		System.out.printf("%d is not divisible by 2%n",num);
			}

	if (checkTwo == 0){
		System.out.printf("%d is divisible by 3%n",num);
		} 
		else {
		System.out.printf("%d is not divisible by 3%n",num);
			}

	if (checkThree == 0){
		System.out.printf("%d is divisible by 5%n",num);
		} 
		else {
		System.out.printf("%d is not divisible by 5%n",num);
			}

	if (checkFour == 0){
		System.out.printf("%d is divisible by 7%n",num);
		} 
		else {
		System.out.printf("%d is not divisible by 7",num);
			}

	}
}