//Question 8
import java.util.Scanner;
public class IntegerReversalComputer{

    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = inputCollector.nextInt();

            
        while(number != 0){

            int extracted = number % 10;
            number = number / 10;
            
            System.out.print(extracted);

        }

        System.out.println();
    }

}





