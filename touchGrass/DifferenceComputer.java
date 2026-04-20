//Question 4
import java.util.Scanner;
public class DifferenceComputer{

    public static void main(String[] args){
        
        int result = subtract(1,5);
        System.out.println(result);
          
    }

    public static int subtract(int numberOne, int numberTwo){

        if(numberOne > numberTwo){

            return numberOne - numberTwo;

        }else{

            return numberTwo - numberOne;


        }

    }

}



