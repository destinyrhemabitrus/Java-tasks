import java.util.Scanner;
public class pizzaWahala{

    Scanner input = new Scanner(System.in);

    public int commision(int pizzaType, int guests){

        //System.out.println("What type of Pizza do you want\n(1.Sapa size 2.Small Money 3.Big boys 4.odogwu):");
        int typeOfPizza = pizzaType;        

        //System.out.println("How many guest's are you catherine for:");
        int numberOfGuests = guests;  
        int message = 1;
        int remainder;
        int willBuy;
        int amountToPay;
        int unitPrice;
        if(typeOfPizza == 1){

            int sapa_size = 4;
            unitPrice = 2500; 
            
            willBuy = numberOfGuests/sapa_size;
            remainder = numberOfGuests%sapa_size;
            amountToPay = unitPrice * willBuy;
            
            if(remainder != 0){

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.printf("After all guests are served 1 slice per individual you'll be left with %d slice%n", remainder);
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);
//
                  message =  willBuy + remainder + amountToPay;
                  return message;                  

            } else{

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.println("After all guests are served 1 slice per individual you'll be left with 0 slice");
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);            
//            
                  message =  willBuy + remainder + amountToPay;
                  return message;                  


            }
            

        } else if(typeOfPizza == 2){


            int small_money = 6;
            unitPrice = 2900; 
            
            willBuy = numberOfGuests/small_money;
            remainder = numberOfGuests%small_money;
            amountToPay = unitPrice * willBuy;
            
            if(remainder != 0){

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.printf("After all guests are served 1 slice per individual you'll be left with %d slice%n", remainder);
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);
//
                  message =  willBuy + remainder + amountToPay;
                  return message;                  

            } else{

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.println("After all guests are served 1 slice per individual you'll be left with 0 slice");
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);            
//            
                  message =  willBuy + remainder + amountToPay;
                  return message;                  

            }



        } else if(typeOfPizza == 3){


            int big_boys = 8;
            unitPrice = 4000; 
            
            willBuy = numberOfGuests/big_boys;
            remainder = numberOfGuests%big_boys;
            amountToPay = unitPrice * willBuy;
            
            if(remainder != 0){

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.printf("After all guests are served 1 slice per individual you'll be left with %d slice%n", remainder);
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);
//
                  message =  willBuy + remainder + amountToPay;
                  return message;                  

            } else{

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.println("After all guests are served 1 slice per individual you'll be left with 0 slice");
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);            
//            
                  message =  willBuy + remainder + amountToPay;
                  return message;                  

            }



        } else if(typeOfPizza == 4){


            int odogwu = 12;
            unitPrice = 5200; 
            
            willBuy = numberOfGuests/odogwu;
            remainder = numberOfGuests%odogwu;
            amountToPay = unitPrice * willBuy;
            
            if(remainder != 0){

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.printf("After all guests are served 1 slice per individual you'll be left with %d slice%n", remainder);
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);
//
                  message =  willBuy + remainder + amountToPay;
                  return message;                  

            } else{

//                System.out.printf("You will buy %d Boxes of Pizza%n", willBuy);
//                System.out.println("After all guests are served 1 slice per individual you'll be left with 0 slice");
//                System.out.printf("You will be paying %d for the %d slice%n",amountToPay,willBuy);            
//
                  message =  willBuy + remainder + amountToPay;
                  return message;                  
            
            }

        
        }
                  return message;                  



    }

         public static void main(String[] args){

            pizzaWahala trial = new pizzaWahala();
            System.out.println(trial.commision(1,20));

        }


}
