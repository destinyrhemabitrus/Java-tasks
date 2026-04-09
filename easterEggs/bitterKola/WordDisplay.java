
//Quetion 7
import java.util.Scanner;

public class WordDisplay{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	int testA = number%5;
	int testB = number%3;

	if(testA == 0){

	System.out.println("Buzz");

	} else if(testB == 0){

	System.out.println("Fizz");
	
	
	}else if(testA==0&&testB==0){

	System.out.println("FizzBuzz");

	} else {

	System.out.print(number);


	} 
	


	}
}
