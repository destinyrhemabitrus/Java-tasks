
//Quetion 6
import java.util.Scanner;

public class IntegerReader{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter two numbers: ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();

	if(num1>=0&&num2>=0){

	int sum = num1 + num2;
	System.out.printf("Sum = %d", sum);

	} else if(num1<0&&num2<0){

	int product = num1 * num2;
	System.out.printf("Product = %d", product);
	
	
	}else{

	int difference = num1 - num2;
	System.out.printf("Difference = %d", difference);

	} 
	


	}
}
