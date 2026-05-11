//Sum the users input when the counter is even
import java.util.Scanner;
public class TaskFour{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int sum = 0;
        System.out.printf("Enter 10 Scores:%n");

        while(counter <= 10){

            System.out.printf("Score %d:%n",counter);
            int score = input.nextInt();
            if(counter%2 == 0){
            sum = sum + score;
            }
            counter = counter + 1;
        }     

        
        System.out.printf("Sum = %d%n",sum);
        

    }


}



    


