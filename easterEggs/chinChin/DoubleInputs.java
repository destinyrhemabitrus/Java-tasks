//Quetion 22
import java.util.Scanner;

public class DoubleInputs{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter two decimal numbers: ");
	double decimalOne = input.nextFloat();
	double decimalTwo = input.nextFloat();

	if (decimalOne > decimalTwo){
	System.out.printf("Larger value is: %f%n",decimalOne);
	System.out.printf("Smaller value is: %f%n",decimalTwo);
	double sum = decimalOne + decimalTwo;
	double difference = decimalOne - decimalTwo;
	double product = decimalOne * decimalTwo;
	double division = decimalOne / decimalTwo;
	System.out.printf("Sum: %f%n",sum);
	System.out.printf("Difference: %f%n",difference);
	System.out.printf("Product: %f%n",product);
	if(decimalTwo==0){
	System.out.println("Quotient: Division not possible");
			} else {
	System.out.printf("Quotient: %f%n",division);
		
		}

		} else {
	System.out.printf("Larger value is: %f%n",decimalTwo);
	System.out.printf("Smaller value is: %f%n",decimalOne);
	double sum = decimalOne + decimalTwo;
	double difference = decimalOne - decimalTwo;
	double product = decimalOne * decimalTwo;
	double division = decimalOne / decimalTwo;
	System.out.printf("Sum: %f%n",sum);
	System.out.printf("Difference: %f%n",difference);
	System.out.printf("Product: %f%n",product);
	if(decimalTwo==0){
	System.out.println("Quotient: Division not possible");
			} else {
	System.out.printf("Quotient: %f%n",division);
		
		}

			}

		}
}