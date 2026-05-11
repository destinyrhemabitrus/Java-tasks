import java.util.Scanner;
public class BackToSender{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("How many succesful delivery did you make today:");
        int succesfulDelivery = input.nextInt();
        
        int commission;
        int base_ammount = 5000;
        int ammount_perPercel;
        if(succesfulDelivery < 50){
            
            ammount_perPercel = 160;
            commission = (succesfulDelivery * ammount_perPercel) + base_ammount;
            
            System.out.println("Your wage for today is" + " " + commission);            

        } else if(succesfulDelivery <= 59){

            ammount_perPercel = 200;
            commission = (succesfulDelivery * ammount_perPercel) + base_ammount;
            
            System.out.println("Your wage for today is" + " " + commission);            


        }else if(succesfulDelivery <= 69){

            ammount_perPercel =250;
            commission = (succesfulDelivery * ammount_perPercel) + base_ammount;
            
            System.out.println("Your wage for today is" + " " + commission);            


        }else if(succesfulDelivery >= 50){

            ammount_perPercel = 500;
            commission = (succesfulDelivery * ammount_perPercel) + base_ammount;
            
            System.out.println("Your wage for today is" + " " + commission);            


        }


    }

}
