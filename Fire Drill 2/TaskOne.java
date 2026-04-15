import java.util.Scanner;
public class TaskOne{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int sum = 0;
        System.out.printf("Enter 10 Scores:%n");

        while(counter <= 10){

            System.out.printf("Score %d:%n",counter);
            int score = input.nextInt();
            sum = sum + score;
            counter++;
        }     

        System.out.printf("Sum = %d",sum);
   

    }


}



    


