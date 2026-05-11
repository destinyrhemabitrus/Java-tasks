import java.util.Scanner;
public class TaskThree{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int sum = 0;
        double average;
        System.out.printf("Enter 10 Scores:%n");

        while(counter <= 10){

            System.out.printf("Score %d:%n",counter);
            int score = input.nextInt();
            sum = sum + score;
            counter++;
        }     

        average = sum/10;

        System.out.printf("Sum = %d%n",sum);
        System.out.printf("Average = %f%n",average);
        

    }


}



    


