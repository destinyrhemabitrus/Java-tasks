//Working on my real Nokia task

import java.util.Scanner;
public class Nokia3310{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        boolean runningMainMenu = true;
        
        do{

            System.out.printf("--MAIN MENU--%n%n1.Phone book%n2.Messages%n3.Chat%n4.Call register%n5.Tones%n6.Settings%n"
                        +   "7.Call divert%n8.Games%n9.Calculator%n10.Reminders%n11.Clock%n12.Profiles%n13.Sim services%n0.Exit%n%n");
            
            int main_menuChoice = inputCollector.nextInt();
            switch(main_menuChoice){

                case 1:

                boolean phone = true;

                do{

                    System.out.printf("--Phone book--%n1.Search%n2.Service Nos%n3.Add name%n4.Erase%n5.Edit%n6.Assign tone%n7.Send b'card%n"
                                +   "8.Options%n9.Speed dial%n10.Voice tags%n0.Back%n%n");

                    int chosenPhonebookOption = inputCollector.nextInt();
                
                    switch(chosenPhonebookOption){

                        case 1:
                        System.out.printf("--Search--%n0.Back%n%n");
                        break;


                        case 2:
                        System.out.printf("--Service Nos'--%n0.Back%n%n");
                        break;


                        case 3:
                        System.out.printf("--Add name--%n0.Back%n%n");
                        break;


                        case 4:
                        System.out.printf("--Erase'--%n0.Back%n%n");
                        break;


                        case 5:
                        System.out.printf("--Edit--%n0.Back%n%n");
                        break;

    
                        case 6:
                        System.out.printf("--Assign tone'--%n0.Back%n%n");
                        break;


                        case 7:
                        System.out.printf("--Send b'card'--%n0.Back%n%n");
                        break;


                        case 8:
    
                        boolean options = true;

                        do{

                            System.out.printf("--Options--%n1.Type of view%n2.Memory status%n0.Back%n%n");
                            int chosenOption = inputCollector.nextInt();  
    
                            switch(chosenOption){

                                case 1:
                                System.out.printf("--Type of view--%n0.Back%n%n");
                                break;


                                case 2:
                                System.out.printf("--Memory status--%n0.Back%n%n");
                                break;


                                case 0:
                                options = false;
                                break;


                                default:
                                System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                                break;


                            }

                        }while(options == true);
                    
                        //This takes you back to phone book submenu
                        break;


                        case 9:
                        System.out.printf("--Speed dial--%n0.Back%n%n");
                        break;


                        case 10:
                        System.out.printf("--Voice tags--%n0.Back%n%n");
                        break;


                        case 0:
                        phone = false;
                        break;


                        default:
                        System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                        break;

                    }

                    }while(phone == true);

                    //This breaks the phonebook to mainMenu
                    break;


                case 2:
                boolean messages = true;

                do{

                    System.out.printf("--Messages--%n1.Write messages%n2.Inbox%n3.Outbox%n4.Picture messages%n5.Templetes%n6.Smileys%n7.Message settings%n"
                                +   "8.Info service%n9.Voice mailbox number%n10.Service command editor%n0.Back%n%n");
                    int choosenMessage = inputCollector.nextInt();
        
                    switch(choosenMessage){

                        case 1:
                        System.out.printf("--Write messages--%n0.Back%n%n");
                        break;


                        case 2:
                        System.out.printf("--Inbox--%n0.Back%n%n");
                        break;
                    

                        case 3:
                        System.out.printf("--Outbox--%n0.Back%n%n");
                        break;

                        case 4:
                        System.out.printf("--Picture messsages--%n0.Back%n%n");
                        break;


                        case 5:
                        System.out.printf("--Templates--%n0.Back%n%n");
                        break;


                        case 6:
                        System.out.printf("--Smileys--%n0.Back%n%n");
                        break;


                        case 7:
                        boolean messageSettings = true;

                        do{

                            System.out.printf("--Message settings--%n1.Set 1%n2.Common%n0.Back%n%n");
                            int messageSettingsChoice =inputCollector.nextInt();

                            switch(messageSettingsChoice){

                                case 1:
                                System.out.printf("--Set 1--%n1.Message center number%n2.Message sent as%n3.Message validity%n%n");
                                break;


                                case 2:
                                System.out.printf("--Common--%n1.Deliver reports%n2.Reply via same centre%n3.Character support%n%n");
                                break;


                                case 0:
                                messageSettings = false;
                                break;


                                default:
                                System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                                break;

                            }

                        }while(messageSettings == true);

                        break;


                        case 0:
                        messages = false;
                        break;


                        default:
                        System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                        break;
                
                    }


                    }while(messages == true);

                    //This takes you back to phone book submenu
                    break;


                case 3:
                System.out.printf("--Chat--%n0.Back%n%n");
                break;


                case 4:
                boolean callRegister = true;

                do{

                    System.out.printf("--Call register--%n1.Missed calls%n2.Received calls%n3.Dialled calls%n4.Erase recent call lists%n5.Show call duration%n6.Show call costs%n7.Call costs settings%n"
                                +   "8.Prepared credit%n0.Back%n%n");
                    int callRegisterChoice = inputCollector.nextInt();

                    switch(callRegisterChoice){

                        case 1:
                        System.out.printf("--Missed calls--%n0.Back%n%n");
                        break;


                        case 2:
                        System.out.printf("--Received calls--%n0.Back%n%n");
                        break;


                        case 3:
                        System.out.printf("--Dialled numbers--%n0.Back%n%n");
                        break;


                        case 4:
                        System.out.printf("--Erase recent call lists--%n0.Back%n%n");
                        break;


                        case 5:
                        boolean showCallDuration = true;

                        do{

                            System.out.printf("--Show call duration--%n1.Last call duration%n2.All calls' duration%n3.Received calls' duration%n4.Dialled calls' duration%n5.Clear timers%n0.Back%n%n");
                            int showCallDurationChoice = inputCollector.nextInt();

                            switch(showCallDurationChoice){

                                case 1:
                                System.out.printf("--Last call duration--%n0.Back%n%n");
                                break;


                                case 2:
                                System.out.printf("--All calls' duration--%n0.Back%n%n");
                                break;


                                case 3:
                                System.out.printf("--Received calls' duration--%n0.Back%n%n");
                                break;


                                case 4:
                                System.out.printf("--Dialled calls' duration--%n0.Back%n%n");
                                break;


                                case 5:
                                System.out.printf("--Clear timers--%n0.Back%n%n");
                                break;


                                case 0:
                                showCallDuration = false;
                                break;


                                default:
                                System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                                break;

                            }

                        }while(showCallDuration == true);
                        
                        break;


                        case 6:
                        boolean showCallCost = true;

                        do{

                            System.out.printf("--Show call costs--%n1.1.Last call cost%n2.All call's cost%n3.Clear counters%n0.Back%n%n");
                            int showCallCostChoice = inputCollector.nextInt();  

                            switch(showCallCostChoice){

                                case 1:
                                System.out.printf("--Last call cost--%n0.Back%n%n");
                                break;


                                case 2:
                                System.out.printf("--All call's cost--%n0.Back%n%n");
                                break;


                                case 3:
                                System.out.printf("--Clear counters--%n0.Back%n%n");
                                break;


                                case 0:
                                showCallCost = false;
                                break;


                                default:
                                System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                                break;


                            }  
                        
                        }while(showCallCost == true);
                        
                        break;


                        case 7:
                        boolean callCostSettings = true;

                        do{

                            System.out.printf("--Call cost settings--%n1.Call cost limit%n2.Show costs in%n0.Back%n%n");
                            int callCostSettingsChoice = inputCollector.nextInt();

                            switch(callCostSettingsChoice){

                                case 1:
                                System.out.printf("--Call cost limit--%n0.Back%n%n");
                                break;


                                case 2:
                                System.out.printf("--Show costs in--%n0.Back%n%n");
                                break;


                                case 0:
                                callCostSettings = false;
                                break;


                                default:
                                System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                                break;


                            }

                        }while(callCostSettings == true);
                        
                        break;


                        case 8:
                        System.out.printf("--Prepaid credit--%n0.Back%n%n");
                        break;


                        case 0:
                        callRegister = false;
                        break;


                        default:
                        System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                        break;


                    }


                }while(callRegister == true);

                break;


                case 5:
                System.out.printf("--Tones--%n1.Ringing tone%n2.Ringing volume%n3.Incoming call alert%n4.Composer%n5.Message alert tone%n6.Keypad tones%n7.Warning and game tones%n"
                            +   "8.Vibrating alert%n9.Screen saver%n0.Back%n%n");
                break;


                case 6:
                System.out.printf("--Settings--%n1.Call settings%n2.Phone settings%n3.Security settings%n4.Restore factory settings%n0.Back%n%n");
                break;


                case 7:
                System.out.printf("--Call divert--%n0.Back%n%n");
                break;


                case 8:
                System.out.printf("--Games--%n0.Back%n%n");
                break;


                case 9:
                System.out.printf("--Calculator--%n0.Back%n%n");
                break;


                case 10:
                System.out.printf("--Reminders--%n0.Back%n%n");
                break;


                case 11:
                System.out.printf("--Clock--%n1.Alarm clock%n2.Clock settings%n3.Date setting%n4.Stopwatch%n5.Countdown timer%n6.Auto update of date and time%n0.Back%n%n");
                break;


                case 12:
                System.out.printf("--Profiles--%n0.Back%n%n");
                break;


                case 13:
                System.out.printf("--SIM services--%n0.Back%n%n");
                break;


                case 0:
                runningMainMenu = false;
                break;


                default:
                System.out.printf("Invalid selection, kindly enter a valid input%n%n");
                break;

            }

        }while(runningMainMenu == true);
        

    }


}
