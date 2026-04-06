//Quetion 30
import java.util.Scanner;

public class SecondsConverter{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of Seconds: ");
	int seconds = input.nextInt();

	int hour = seconds/3600;
	int hourRemainder = seconds%3600;
	int minute = hourRemainder/60;
	int theSeconds = hourRemainder%60;

	
	System.out.printf("%d seconds = %d hour, %d minutes, %d seconds", seconds, hour, minute, theSeconds);

	}
}