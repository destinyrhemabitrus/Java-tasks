//Quetion 4.16
//Result

import java.util.Scanner;
public class LoopTryoutTest{

    public static void main(String[] args){
    
        int x = -2;
        int total = 0;
        while (x <= 10) {
            int y = x + 2;
            x++;
            total += y;
        System.out.printf("Y is: %d and total is %d\n", y, total);
        }

    }

}

//Y is equal to 12, total is 78
