//Quetion 18

import java.util.Scanner;

public class TensUnitComputer{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a two digit Number: ");
	int num = input.nextInt();
	
	int wholeNum = num/10;
	int remainder = num%10;

		
	if(wholeNum > remainder){

		System.out.print("Tens digits is greater than Unit's digit");

		} else if(wholeNum < remainder){

		System.out.print("Tens digits is Lesser than Unit's digit");

			} else {

		System.out.print("Tens digits is equal to Unit's digit");

				}

		}
}