import java.util.Scanner;
public class EcommerceCheckoutApplication{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the customers name: ");
        String customer = input.nextLine();
        
        int decision = 1;
        while(decision != 0){

        System.out.println("What did the user buy: ");
        String product = input.nextLine();

        System.out.println("How many pieces: ");
        int quantity = input.nextInt();

        System.out.println("How much per unit: ");
        int price = input.nextInt();

        System.out.println("Add more items (Enter 1 to add more and  0 to end): ");
        decision = input.nextInt();
        System.out.println();
        
        }


    }

}
