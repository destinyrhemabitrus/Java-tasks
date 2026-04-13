import java.util.Scanner;

public class Nokia3310{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    boolean keepRunning = true;
    do{

    System.out.printf("1.Phone book%n2.Messages%n0.Exit%n");
    int choice = input.nextInt();

    switch(choice){

    case 1:
    System.out.printf("PHONE BOOK:%n1.Search%n2.Add name%n3.Edit%n0.Back%n");

    //Phonebook submenu switch
    int submenuChoicePhone = input.nextInt();

    switch(submenuChoicePhone){

        case 1:
        System.out.printf("SEARCH_%nsearch for contact here..");
        break;

        case 2:
        System.out.printf("ADD NAME_%n%nadd name here..");
        break;

        case 3:
        System.out.printf("EDIT_%n%nedit contact here..");
        break;

        case 0:
        break;

        default:
        System.out.printf("Invalid selection");
        break;
    }

    break;


    case 2:
    System.out.printf("MESSAGES:%n1.Inbox%n2.Outbox%n0.Back%n");

    //Messages submenu switch
    int submenuChoiceMessages= input.nextInt();

    switch(submenuChoiceMessages){

        case 1:
        System.out.printf("INBOX_%nfind your inboxes here..");
        break;

        case 2:
        System.out.printf("OUTBOX_%nfind your outboxes here..");
        break;

        case 0:
        break;

        default:
        System.out.printf("Invalid selection");
        break;
    }

    break;

    case 0:
    keepRunning = false;
    break;

    
    default:
    System.out.println("Enter a valid input");
    break;

    }
    

    }while(keepRunning == true);

   

}


}











