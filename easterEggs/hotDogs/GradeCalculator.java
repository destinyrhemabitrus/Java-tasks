//Quetion 29
import java.util.Scanner;

public class GradeCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Score: ");
	double score = input.nextFloat();
	
	if (score >= 90){

		System.out.print("Grade: A");		

		} else if(score >= 80) {
		
		System.out.print("Grade: B");		

			}

		 else if(score >= 70) {
		
		System.out.print("Grade: C");		

			}

		 else if(score >= 60) {
		
		System.out.print("Grade: D");		

			}

		else{
		System.out.print("Grade: F");		

			}

	}
}