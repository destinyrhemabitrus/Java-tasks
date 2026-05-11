public class Structures{

//    Question 2
    public int sumDigits(int n){

        int sum = 0;
        int extracted = 0;    
        while(n != 0){
            extracted = n%10;
            n = n/10;
            sum = sum + extracted;
        }    

        return sum;
    }


//    Question 3

    public int reverse(int number){
        int extracted = 0;
        int result = 0;
        while(number != 0){
            extracted = number%10;
            number = number/10;
            result = result * 10;
            result =result + extracted;
    
        }
        return result;

    }

    
    public boolean isPalindrome(){

        return true;    

    }



}
