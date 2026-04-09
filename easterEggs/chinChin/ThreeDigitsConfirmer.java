//Quetion 23
import java.util.Scanner;

public class ThreeDigitsConfirmer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a 3 digit number: ");
	int digits = input.nextInt();

	if(digits>=100 && digits<=999){
		System.out.print("It is a three digit number");
	} else {
		System.out.print("It is not a three digit number");

		}

	

	}
}