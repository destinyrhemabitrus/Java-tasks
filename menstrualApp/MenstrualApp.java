import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class MenstrualApp{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        
        System.out.println("Hello, what is your name?");
        String name = inputCollector.nextLine();   

        System.out.println("\n" + "When was your last period?" + "\n" + "Kindly enter Date in specific format (yyyy-mm-dd)");
        int year = inputCollector.nextInt();  
        int month = inputCollector.nextInt();  
        int day = inputCollector.nextInt();  

        month = month -1;

        System.out.println("\n" + "How long does your flow last?");
        int flow = inputCollector.nextInt();  

        System.out.println("\n" + "How long does your cycle last?");
        int circleSpan = inputCollector.nextInt(); 
    
        cal.set(year,month,day);

        cal.add(Calendar.DAY_OF_MONTH, circleSpan);
        System.out.print("\n" + name + "!!!" + "\n" + "Your next Menstrual circle will be on: " + sdf.format(cal.getTime()) + "\n");

        cal.add(Calendar.DAY_OF_MONTH,flow);
        System.out.print("\n" + "Your Menstrual flow will last from the start of your next circle up on till: " + sdf.format(cal.getTime()) + "\n");

        cal.add(Calendar.DAY_OF_MONTH,1);
        System.out.print("\n" + "Your safe period starts from: " + sdf.format(cal.getTime()) + " untill the next circle start date" + "\n");

    }

}

