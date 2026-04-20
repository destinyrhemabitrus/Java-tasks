//Question 2
import java.util.Scanner;
public class KeypadCorrespondingValueComputer{

    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner(System.in);
        
       
            System.out.println("Enter an uppercase or lowercase letter: ");
            String letter = inputCollector.nextLine().charAt(0);

            if(letter == "a" || letter == "b" || letter == "c"){

                System.out.println("1");
            
            }
             else {

                System.out.println("Invalid input");                              

            }
            
 
    }

}





