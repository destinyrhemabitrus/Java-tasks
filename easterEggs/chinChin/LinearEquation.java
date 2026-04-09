//Quetion 21
import java.util.Scanner;

public class LinearEquation{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter Coefficient of a, b and c: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();

	if(a==0){
		System.out.print("Equation has no unique solution");
		} else {
		double x = (c-b)/a;
		System.out.printf("X = %f", x);
		}
	}
}