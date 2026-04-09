//Quetion 28
import java.util.Scanner;

public class MonthName{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 1 to 12: ");
	int number = input.nextInt();

	String[] months = {"","January","February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	if(number>0&&number<13){

	System.out.printf("Month is %s", months[number]);	

		} else{
	System.out.print("Invalid input");	
	

}



	}
}