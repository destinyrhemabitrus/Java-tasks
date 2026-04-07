//Quetion 3

import java.util.Scanner;

public class DiscountPriceCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter Price of item: ");
	int price = input.nextInt();

	System.out.println("Enter Discount for item: ");
	int discount = input.nextInt();

	
	double discounted_ = price * discount/100.00;
	double finalPrice = price - discounted_;

	System.out.printf("Final Price: %.2f", finalPrice);
	}
}