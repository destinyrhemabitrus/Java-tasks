import java.util.Scanner;
public class TaskOne{

    public static void main(String[] args){


    Scanner input = new Scanner(System.in);

    int[] scores = new int[10];
    int theScore;
    System.out.println("Enter 10 scores of your choice: ");
    for(int counter = 0; counter < 10; counter++ ){

        System.out.printf("Score %d%n", counter + 1);
        theScore = input.nextInt(); 
        scores[counter] = theScore;       


    }
    
        
    }

}
