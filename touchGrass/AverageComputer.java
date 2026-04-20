import java.util.Scanner;
public class AverageComputer{

    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int average;
        while(true){

            System.out.println("Enter Score and press -1 to end: ");
            int score = inputCollector.nextInt();
            
            if(score == -1){

                break;

            }
            
            count = count + 1;
            sum = sum + score;
    
        }        

        average = sum/count;
        System.out.println(average);
    }

}





