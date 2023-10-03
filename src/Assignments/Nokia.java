package Assignments;

import java.util.Scanner;

public class Nokia {
    static Scanner nokia = new Scanner(System.in);

    public static void main(String[] args) {
        phoneBook();
    }

    public static void phoneBook() {
        System.out.println("""
                1-> phone book
                2 ->message
                3->chat
                4->Message
                5->Tones
                6->settings
                7->calls divert
                8->Games
                9->Calculator
                10->Reminders
                11->Clock
                12->Profiles
                13->sim services""");
        int phoneUser = nokia.nextInt();
        switch (phoneUser) {
            case 1 -> phoneBooks();
            case 2 -> messages();
            case 3 -> System.out.println("Chat");
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> System.out.println("Call divert");
            case 8 -> System.out.println("games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminders");
            case 11 -> clock();
            case 12 -> System.out.println("Profiles");
            case  13 -> System.out.println("Sim Services");

        }
    }


    public static void phoneBooks() {
        System.out.println("""
                1->Search
                2->Service Nos.1
                3->Add name
                4->Erase
                5->Edit
                6->Assign tone
                7->Send b'card
                8->options
                9->Speed dials
                10->Voice tags""");
        int phonebook = nokia.nextInt();
        switch (phonebook) {
            case 1 -> System.out.println("search");
            case 2 -> System.out.println("Service");
            case 3 -> System.out.println("Add name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign tone");
            case 7 -> System.out.println("Send b'card");
            case 8 -> {
                System.out.println("options");
                System.out.println("""
                        1->Type of view
                        2->Memory status""");
                int option = nokia.nextInt();
                switch (option) {
                    case 1 -> System.out.println("Type pf view");
                    case 2 -> System.out.println("Memory status");
                }
            }

            case 9 -> System.out.println("Speed dails");
            case 10 -> System.out.println("Voice tags");
        }
    }

    public static void messages() {
        System.out.println("Messages");
        System.out.println("""
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture messages
                5 -> Templates
                6 -> Smileys
                7 -> Message settings
                8 -> Info service
                9 -> Voice mailbox number
                10 -> Service""");
        int message = nokia.nextInt();
        switch (message) {
            case 1 -> System.out.println("Write message");
            case 2 -> System.out.println("Inbox");
            case 3 -> System.out.println("Outbox");
            case 4 -> System.out.println("Picture messages");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> {
                System.out.println("Message settings");
                System.out.println("""
                        1 - > Set1
                        2 -> Common3""");
                int messageSettings = nokia.nextInt();
                switch (messageSettings) {
                    case 1 -> {
                        System.out.println("Set1");
                        System.out.println("""
                                1 -> Message center number
                                2 -> Message sent as
                                3 -> Character Message validity""");
                        int set1 = nokia.nextInt();
                        switch (set1) {
                            case 1 -> System.out.println("Message center number");
                            case 2 -> System.out.println("message sent as ");
                            case 3 -> System.out.println("Character message validity");
                        }
                    }
                    case 2 -> {
                        System.out.println("Common3");
                        System.out.println("""
                                1 -> Delivery report
                                2 -> Reply via same centre
                                3 -> Character support""");
                        int common3 = nokia.nextInt();
                        switch (common3) {
                            case 1 -> System.out.println("Delivery report");
                            case 2 -> System.out.println("reply via same centre");
                            case 3 -> System.out.println("Character support");
                        }
                    }
                    case 8 -> System.out.println("Info services");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }

            }
        }
    }

    public static void callRegister() {
        System.out.println("""
                1 -> Missed calls
                2 -> Recieved calls
                3 -> Dailed calls
                4 -> Erase recent call
                5 -> Show call duration
                6 -> Show call logs
                7 -> call cast settings 
                8 -> prepaid credit""");
        int register = nokia.nextInt();
        switch (register) {
            case 1 -> System.out.println("Missed call");
            case 2 -> System.out.println("Recieved call");
            case 3 -> System.out.println("Dailed calles");
            case 4 -> System.out.println("Erase recent call");
            case 5 -> {
                System.out.println("Show call duration");
                System.out.println("""
                        1 -> Last call duration
                        2 -> All calls duration
                        3 -> Recieved calls duration
                        4 -> Dailed calls duration
                        5 -> clear timers""");
                int recentCallList = nokia.nextInt();
                switch (recentCallList) {
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All calls duration");
                    case 3 -> System.out.println("Recieved calls duration");
                    case 4 -> System.out.println("Dailed calls duration");
                    case 5 -> System.out.println("Clear timers");

                }
            }
            case 6 -> {
                System.out.println("Show call cost");
                System.out.println("""
                        1 -> last call cost
                        2 -> All call cost
                        3 -> clear counters
                        """);
                int callCost = nokia.nextInt();
                switch (callCost) {
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All calls cost");
                    case 3 -> System.out.println("Clear counters");

                }
            }
            case 7 -> {
                System.out.println("Call cost settings");
                System.out.println("""
                        1 -> call cost limit
                        2 -> Show cost in""");
                int callCostSetting = nokia.nextInt();
                switch (callCostSetting) {
                    case 1 -> System.out.println("Call cost limit");
                    case 2 -> System.out.println("Show cost in");

                }
            }
            case 8 -> System.out.println("Prepaid credit");
        }
        }
   public static void tones(){
       System.out.println("""
               1 -> Ringing Tone
               2 -> Ringing volume
               3 -> incoming alerts
               4 -> composer
               5 -> message alert tones
               6 -> keyboard tones
               7 -> warming and game tones
               8 -> vibrating alert
               9 -> screen saver
               """);
       int tone = nokia.nextInt();
       switch (tone){
           case 1 -> System.out.println("Ringing Tone");
           case 2 -> System.out.println("Ringing Volume");
           case 3 -> System.out.println("Incoming alert");
           case 4 -> System.out.println("Composer");
           case 5 -> System.out.println("Message alert tones");
           case 6 -> System.out.println("Keyboard tones");
           case 7 -> System.out.println("warming and games tones");
           case 8 -> System.out.println("Vibrating alert");
           case 9 -> System.out.println("Screen saver");

       }

    }
   public static void settings(){
       System.out.println("""
               1 -> Call settings
               2 -> Phone settings
               3 ->Security settings
               4-> restore factory settings
               """);
       int settings = nokia.nextInt();
       switch (settings) {
           case 1 -> {
               System.out.println("call settings");
               System.out.println("""
                       1 -> Automatic redail
                       2 -> Speed dailing
                       3-> call waiting options
                       4 -> own number sending
                       5 -> Phone line in use 
                       6 -> Authomatic answer""");
               int callSettings = nokia.nextInt();
               switch (callSettings) {
                   case 1 -> System.out.println("Automatic ");
                   case 2 -> System.out.println("Speed dailing");
                   case 3 -> System.out.println("Call waiting options");
                   case 4 -> System.out.println("Own number sending");
                   case 5 -> System.out.println("Phone line in use");
                   case 6 -> System.out.println("Automatic answer");
               }

           }
           case 2 -> {
               System.out.println("Phone settings ");
               System.out.println("""
                       1 -> languge 
                       2 -> cell info display
                       3 -> Welcome note
                       4 -> Network selection
                       5 -> Lights
                       6 -> Confiirm sim service""");
               int phoneSetting = nokia.nextInt();
               switch (phoneSetting) {
                   case 1 -> System.out.println("Language");
                   case 2 -> System.out.println("Cell info display");
                   case 3 -> System.out.println("Welcome note");
                   case 4 -> System.out.println("Network Selection");
                   case 5 -> System.out.println("Lights");
                   case 6 -> System.out.println("Confirm sim service actions");

               }
           }
            case 3 -> {
                System.out.println("Security settings");
                System.out.println("""
                        1 -> Pin code request
                        2 -> Call barring service
                        3 -> fixed dialing
                        4 -> Closed user group
                        5 -> Phone Security
                        6 -> Change access codes""");
                int securitySettings = nokia.nextInt();
                switch (securitySettings){
                    case 1 -> System.out.println("Pin code request");
                    case 2 -> System.out.println("Call barring services");
                    case 3 -> System.out.println("Fixed dialing");
                    case 4 -> System.out.println("Closed user group");
                    case  5 -> System.out.println("Phone security");
                    case 6 -> System.out.println("Change access codes");

                }

            }
       case 4 -> System.out.println("Restore factory settings");
       }

    }
       public static void clock(){
           System.out.println("""
                   1 -> Alarm clock
                   2 -> Clock settings
                   3 -> Date settings
                   4 -> Stopwatch
                   5 -> Countdown timer
                   6 -> Auto update of date and time
                   """);
           int clockSetting = nokia.nextInt();
           switch (clockSetting){
               case 1 -> System.out.println("Alarm clock");
               case 2 -> System.out.println("Clock Setting");
               case 3 -> System.out.println("Date settings");
               case 4 -> System.out.println("Stopwatch");
               case 5 -> System.out.println("Countdown timer");
               case 6 -> System.out.println("Auto update of time and date");
           }
    }
}