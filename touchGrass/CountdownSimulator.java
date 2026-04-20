//Question 6
import java.util.Scanner;
public class CountdownSimulator{

    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = inputCollector.nextInt();

        int counter;
        counter = number;
        for(; counter >= 1; counter--){

            System.out.println(counter);

        }
        System.out.println("Blast off!");
            
    }

}





