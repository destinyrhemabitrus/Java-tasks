//Quetion 13
import java.util.Scanner;

public class MonthlySavingsCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("How much do you save Monthly : ");
	int principal = input.nextInt();

	double interest = principal * (3.75/100);
	double monthlyReturns = interest + principal;
	double monthTwo =  monthlyReturns * 2;
	double monthThree =  monthlyReturns * 3;
	double monthFour =  monthlyReturns * 4;
	double monthFive =  monthlyReturns * 5;
	double monthSix =  monthlyReturns * 6;	

	System.out.printf("Account value after Sixth Month is: %.1f%nBreakdown (Month 1 to 6):%nMonth 1: %.1f%nMonth 2: %.1f%nMonth 3: %.1f%nMonth 4: %.1f%nMonth 5: %.1f%nMonth 6: %.1f%n", monthSix, monthlyReturns, monthTwo, monthThree, monthFour, monthFive, monthSix);
	}
}