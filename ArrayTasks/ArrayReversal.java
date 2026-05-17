import java.util.Scanner;
public class ArrayReversal{

    public static void main(String[] args){

        Scanner number = new Scanner(System.in);
        int[] arr = new int[10];    
        for(int counter = 0; counter < arr.length; counter++){
            System.out.printf("number %d ", counter + 1);
            int taken_number = number.nextInt();
            arr[counter] = taken_number;  
        }

        int index = 0;
        for(int counter2 = (arr.length - 1); counter2 >= 0; counter2--){
            arr[index] = arr[counter2];
            //System.out.println(arr[index]);
            index++;

        }

        for(int counter3 = 0; counter3 < arr.length; counter3++){
           
            System.out.println(arr[counter3]);            

        }

        
    }

}



//           int index = 0;
//           for(int counter2 = 9; counter2 >= 0; counter2--){
//               System.out.println(counter2);
//               System.out.println(index);
//                index ++;           
//       
//            }
//


