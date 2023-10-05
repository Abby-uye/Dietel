package Assignments;

import java.util.Scanner;

public class Nokia {
    static Scanner nokia = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("""
               press 1-> To access phone book
               press 2 -> To access message
               Press 3-> To access chat
               press 4-> To access call register
               Press 5->To access tones
               Press 6-> To access settings
               Press 7-> To divert calls
               Press 8-> To access games
               press 9->To access calculator
               Press 10->To access reminders
               Press 11->To access clock
               Press 12->To access profiles
               Press 13-> To access sim services
                """);
        int phoneUser = nokia.nextInt();
        switch (phoneUser) {
            case 1 -> phoneBook();
            case 2 -> messages();
            case 3 -> System.out.println("Chat");
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> System.out.println("Call diverted");
            case 8 -> System.out.println("games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminders");
            case 11 -> clock();
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("Sim Services");
            default -> mainMenu();

        }
    }


    public static void phoneBook() {
        System.out.println("""
              Press  1 -> To search phonebook
              Press  2 -> To access Service Nos.1
              Press  3 -> To add name
              Press  4 -> To erase contact
              Press  5 -> To edit contact
              Press  6 -> To assign tone to contact
              Press  7 -> To send b'card
              Press  8 -> To access options
              press  9 -> To access speed dials
              press  10 -> To access Voice tags
              press 11 -> to go back to main menu""");
        int phonebook = nokia.nextInt();
        switch (phonebook) {
            case 1 -> System.out.println("search");
            case 2 -> System.out.println("Service");
            case 3 -> System.out.println("contact name");
            case 4 -> System.out.println("contact erased");
            case 5 -> System.out.println("Edited contact");
            case 6 -> System.out.println(" Tone has been assigned to this contact");
            case 7 -> System.out.println(" b'card sent");
            case 8 -> options();
            case 9 -> System.out.println("Speed dails");
            case 10 -> System.out.println("Voice tags");
            case 11 -> mainMenu();
            default -> phoneBook();
        }
    }

    public static void messages() {
        System.out.println("Messages");
        System.out.println("""
              press  1 -> To write messages
              press  2 -> To access inbox
              press  3 -> To access outbox
              press  4 -> To set picture messages
              press  5 -> To access templates
              press  6 -> To access smileys
              press  7 -> To access message settings
              press  8 -> To access info service
              press  9 -> To access voice mailbox number
              press  10 -> To access service
              press  11 -> To go back to main menu""");
        int message = nokia.nextInt();
        switch (message) {
            case 1 -> System.out.println(" message body");
            case 2 -> System.out.println("Message inbox");
            case 3 -> System.out.println("Message outbox");
            case 4 -> System.out.println("Picture message");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> messageSettings();
            case 8 -> System.out.println("Info services");
            case 9 -> System.out.println("Voice mailbox number");
            case 10 -> System.out.println("Service command editor");
            case 11 -> mainMenu();
            default -> messages();


        }
    }

    public static void callRegister() {
        System.out.println("""
            press    1 -> To access missed calls log
            press    2 -> To access received calls log
            press    3 -> To access dialed calls log
            press    4 -> To erase recent calls log
            press    5 -> To see call duration
            press    6 -> To see call logs
            press    7 -> To access call cast settings 
            press    8 -> To access prepaid credit
            press    9 -> To go back to main menu""");
        int register = nokia.nextInt();
        switch (register) {
            case 1 -> System.out.println("Missed calls");
            case 2 -> System.out.println("Received calls");
            case 3 -> System.out.println("Dialed calls");
            case 4 -> System.out.println(" recent call log erased");
            case 5 -> recentCalls();
            case 6 -> callCost();
            case 7 -> callCostSettings();
            case 8 -> System.out.println("Prepaid credit");
            case 9 -> mainMenu();
            default -> callRegister();
        }
    }
        public static void tones () {
            System.out.println("""
                press    1 -> TO set ringing Tone
                press    2 -> To adjust ringing volume
                press    3 -> To set incoming alerts
                press    4 -> To set composer tones
                press    5 -> To set message alert tones
                press    6 -> To set keyboard tones
                press    7 -> To set warning and game tones
                press    8 -> To set vibrating alert
                press    9 -> To set screen saver
                    """);
            int tone = nokia.nextInt();
            switch (tone) {
                case 1 -> System.out.println("Ringing tone has been set to");
                case 2 -> System.out.println("Ringing volume increased");
                case 3 -> System.out.println("Incoming alert tone has been ");
                case 4 -> System.out.println("Composer tone has been set to");
                case 5 -> System.out.println("Message alert tones has been set to ");
                case 6 -> System.out.println("Keyboard tones has been set to");
                case 7 -> System.out.println("warning and games tones has been set to ");
                case 8 -> System.out.println("Vibrating alert has been set to");
                case 9 -> System.out.println("Screen saver has been set to");
                case 10 -> mainMenu();
                default -> tones();

            }

        }
        public static void settings () {
            System.out.println("""
                 press   1 -> Call settings
                 press   2 -> Phone settings
                 press   3 ->Security settings
                 press   4 -> restore factory settings
                    """);
            int settings = nokia.nextInt();
            switch (settings) {
                case 1 -> callSettings();
                case 2 -> phoneSettings();
                case 3 -> securitySettings();
                case 4 -> System.out.println(" factory settings restored");
            }

        }
        public static void clock () {
            System.out.println("""
                 press   1 -> To set Alarm 
                 press   2 -> To set Clock 
                 press   3 -> To set Date 
                 press   4 -> To set Stopwatch
                 press   5 -> To start Countdown timer
                 press   6 -> To auto update of date and time
                 press   7 -> To go back to main menu
                    """);
            int clockSetting = nokia.nextInt();
            switch (clockSetting) {
                case 1 -> System.out.println("Alarm clock has been set to");
                case 2 -> System.out.println("Clock has been set ");
                case 3 -> System.out.println("Date has been set");
                case 4 -> System.out.println("Stopwatch started");
                case 5 -> System.out.println("Countdown timer started");
                case 6 -> System.out.println("Auto update of time and date");
                case 7 -> mainMenu();
                default -> clock();
            }
        }

        public static void recentCalls(){
            System.out.println("""
                press    1 -> To know your last call duration
                press    2 -> To know all calls duration
                press    3 -> To know received calls duration
                press    4 -> To know dialed calls duration
                press    5 -> To clear timers
                press    6 -> To go back to main menu""");
            int recentCallList = nokia.nextInt();
            switch (recentCallList) {
                case 1 -> System.out.println("Last call duration is");
                case 2 -> System.out.println("All calls duration is");
                case 3 -> System.out.println("Received calls duration is");
                case 4 -> System.out.println("Dialed calls duration is ");
                case 5 -> System.out.println("Call timers cleared");
                case 6 -> recentCalls();
                default -> recentCalls();

            }
        }


        public static void callCost() {
            System.out.println("Show call cost");
            System.out.println("""
                 press   1 -> To know your last call cost
                press    2 -> To know all call cost
                press    3 -> To clear counters
                press    4 -> To go back to main menu
                    """);
            int callCost = nokia.nextInt();
            switch (callCost) {
                case 1 -> System.out.println("Last call duration is");
                case 2 -> System.out.println("All calls cost is ");
                case 3 -> System.out.println("Counters cleared");
                case 4 -> mainMenu();
                default -> callCost();
            }
        }
    public static void callCostSettings() {
        System.out.println("Call cost settings");
        System.out.println("""
             press   1 -> To set call cost limit
             press   2 -> To know cost in call
             press   3 -> To go back to main menu""");
        int callCostSetting = nokia.nextInt();
        switch (callCostSetting) {
            case 1 -> System.out.println("Call cost limit has been set to");
            case 2 -> System.out.println("cost in in call is");
            case 3 -> mainMenu();
            default -> callCostSettings();

        }

    }
    public static void callSettings() {
        System.out.println("call settings");
        System.out.println("""
            press    1 ->For  Automatic rediall
            press    2 ->For  Speed dialing
            press    3-> For call waiting options
            press    4 ->For own number sending
            press    5 ->For  Phone line in use 
            press    6 ->For  Automatic answer
            press    7 -> To go back to main menu""");
        int callSettings = nokia.nextInt();
        switch (callSettings) {
            case 1 -> System.out.println("Automatic redial");
            case 2 -> System.out.println("Speed dial");
            case 3 -> System.out.println("Call waiting options are ");
            case 4 -> System.out.println("Own number sent");
            case 5 -> System.out.println("Phone line in use is ");
            case 6 -> System.out.println("Automatic answer");
            case 7 -> mainMenu();
            default -> callSettings();
        }

    }
    public static void phoneSettings() {
        System.out.println("Phone settings ");
        System.out.println("""
            press    1 -> TO set languge 
            press    2 -> For cell info display
            press    3 -> To set Welcome note
            press    4 -> To select Network 
            press    5 -> To set Lights
            press    6 -> To Confirm sim service
            press    7 -> To go go back to main menu""");
        int phoneSetting = nokia.nextInt();
        switch (phoneSetting) {
            case 1 -> System.out.println("Language has been set ");
            case 2 -> System.out.println("Cell info display");
            case 3 -> System.out.println("Welcome note");
            case 4 -> System.out.println("Selected network");
            case 5 -> System.out.println("Lights");
            case 6 -> System.out.println("Confirmed sim service actions");
            case 7 -> mainMenu();
            default -> phoneSettings();

        }
    }

public static void securitySettings() {
    System.out.println("Security settings");
    System.out.println("""
        press   1 -> For Pin code request
        press    2 -> For Call barring service
        press    3 -> For set fixed dialing
        press    4 -> To set closed user group
        press    5 -> To set Phone Security
        press    6 -> To change access codes
        press    7 -> To go back to main menu""");
    int securitySettings = nokia.nextInt();
    switch (securitySettings) {
        case 1 -> System.out.println("Pin code requested");
        case 2 -> System.out.println("Call barring services");
        case 3 -> System.out.println("Fixed dialing set");
        case 4 -> System.out.println("Closed user group has been set to");
        case 5 -> System.out.println("Phone security");
        case 6 -> System.out.println("Access code has been changed to");
        case 7 -> mainMenu();
        default -> securitySettings();

    }
}
public static void options(){
System.out.println("options");
                System.out.println("""
                    press    1 ->To set type of view
                    press    2 ->To know memory status
                    press    3 -> To go back to main menu""");
    int option = nokia.nextInt();
                switch (option) {
        case 1 -> System.out.println("Type of view has been set to");
        case 2 -> System.out.println("Memory status is");
        case 3 -> mainMenu();
        default -> options();

    }
}
public static void messageSettings() {
    System.out.println("Message settings");
    System.out.println("""
        press    1 - > Set1
        press    2 -> Common3
        press    3 To go back to main menu""");
    int messageSettings = nokia.nextInt();
    switch (messageSettings) {
        case 1 -> set1();
        case 2 -> common3();
        case 3 -> mainMenu();
        default -> messageSettings();

    }
}
public static void set1(){
System.out.println("Set1");
                        System.out.println("""
                            press    1 -> For message center number
                            press    2 -> For message sent as
                            press    3 -> For character Message validity
                            Press    4 -> To go back main menu""");
    int set1 = nokia.nextInt();
                        switch (set1) {
        case 1 -> System.out.println("Message center number is");
        case 2 -> System.out.println("message sent as ");
        case 3 -> System.out.println("Character message validity");
        case 4 ->mainMenu();
        default -> set1();
    }
}
public static void common3(){
        System.out.println("Common3");
        System.out.println("""
                            press    1 -> For Delivery report
                            press    2 -> To Reply via same centre
                            press    3 -> For Character support
                            press    4 -> To go back to main menu""");
        int common3 = nokia.nextInt();
        switch (common3) {
            case 1 -> System.out.println("Delivery report");
            case 2 -> System.out.println("replied via same centre");
            case 3 -> System.out.println("Character support");
            case 4 -> mainMenu();
            default -> common3();
        }

    }
}