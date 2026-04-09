//Quetion 20
import java.util.Scanner;

public class IntergerReversal{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a 4 digit number: ");
	int num = input.nextInt();

	int wholeNum1 = num/10;
	int remainder1 = num%10;  //4	
	
	int wholeNum2 = wholeNum1/10;
	int remainder2 = wholeNum1%10; //3

	int wholeNum3 = wholeNum2/10; //1
	int remainder3 = wholeNum2%10; //2

	System.out.printf("Reversal: %d%d%d%d", remainder1,remainder2,remainder3, wholeNum3);

	}
}