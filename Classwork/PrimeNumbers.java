import java.util.Scanner;
public class PrimeNumbers{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a  number: ");
        int number = input.nextInt();

        int i = 2;
        int total = 0;
        while(number != 1){

            if(number%i == 0){

                total = total + i;

                number = number/i;
            } else{ 

                //number = number/i;
                
                i++;

            } 
           
            
            
            //i++;

        }
        System.out.println(total);

    }

}
