//Quetion 30
import java.util.Scanner;

public class CurrentTimeCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Current hour(0 to 23): ");
	int hour = input.nextInt();
	
	if (hour <= 11){

		System.out.println("Good Morning");		

		} else if(hour <= 17) {
		
		System.out.println("Good Afternoon");		

			}

		 else if(hour <= 21) {
		
		System.out.println("Good Evening");		

			}

		 else if(hour <= 4) {
		
		System.out.print("Grade: D");		

			}

			}
}