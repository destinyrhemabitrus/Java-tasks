//Quetion 4.26
//

import java.util.Scanner;
public class LoopTryoutTest{

    public static void main(String[] args){
    
       int row = 5;
        while (row >= 1) {
        int column = 5;
        while (column >= 1) {
        System.out.print(row % 2 == 0 ? "X" : "O");
            ++column;
        } // end while
        --row;
        System.out.println();
        }

    }

}

//it prints an infinite loop






























