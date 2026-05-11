//A function that takes in three numbers and gives the hightest of the number

public class HighestNumberFunction{

    public void highest(int number1, int number2, int number3){

       int largest = number1;

        if(number2 > largest){

            largest = number2;

        }

        if(number3 > largest){
            
            largest = number3;

        }
        
        System.out.printf("Highest is %d%n", largest);
    }



        public static void main(String[] args){

            HighestNumberFunction result = new HighestNumberFunction();
            result.highest(3,5,9);

        }
   

}
