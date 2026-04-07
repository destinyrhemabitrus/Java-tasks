//Quetion 15
import java.util.Scanner;

public class IntergerToIndividualIntergerSum{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	int wholeNum1 = num/10;
	int remainder1 = num%10;	
	
	int wholeNum2 = wholeNum1/10;
	int remainder2 = wholeNum1%10;

	int sum = wholeNum2 + remainder2 + remainder1;

	System.out.printf("Integer %d sum is: %d", num, sum);

	}
}