
//Quetion 14
import java.util.Scanner;

public class VehicleSpeedStatus{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Speed in km per hour: ");
	int speed = input.nextInt();

	
	if(speed==0){

	System.out.print("Vehicle is: stationary");


	} else if(speed<=40){

	System.out.print("Vehicle is: Slow");


	} else if(speed<=80){

	System.out.print("Vehicle is: Moderate");



	} else if(speed<=120){

	System.out.print("Vehicle is: Fast");

	
	} else  {

	System.out.print("Vehicle is: Dangerously Fast");


	}


	}
}
