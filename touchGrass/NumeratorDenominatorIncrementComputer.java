//Question 11
import java.util.Scanner;
public class NumeratorDenominatorIncrementComputer{

    public static void main(String[] args){
        
        double total = 0;
        double counter;
        for(counter = 1; counter <=101; counter+=2){

            double result = counter/(counter + 2);
            total = total + result;

            System.out.println(total);

        }
    }

}





