//Quetion 24
import java.util.Scanner;

public class Dollar_RmbRateConverter{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Current Exchange rate: ");
	double rate = input.nextFloat();

	System.out.print("Enter amount to convert: ");
	double amount = input.nextFloat();

	System.out.println("Select 0 to convert from Dollar to RMB\nSelect 1 to convert from RMB to Dollar: ");
	double option = input.nextFloat();

	double dollar_toRmb = amount * rate;
	double rmb_toDollar = amount/rate;	

	if (option == 0){

		System.out.printf("$%f is equivalent to: Y%.2f", amount, dollar_toRmb);		

		} else if(option == 1) {
		
		System.out.printf("Y%f is equivalent to: $%.2f", amount, rmb_toDollar);		

			}

		else{
		System.out.print("Invalid option entered, kindly enter the correct option to continue..");		

			}

	}
}