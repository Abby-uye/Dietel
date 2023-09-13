package Assignments;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner nokia = new Scanner(System.in);
        System.out.println("""
                1-> phone book
                2 _>message
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
            case 1 -> {
                System.out.println("Phonebook");
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
            case 2 -> {
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
                            case 9 -> System.out.println("Voice mailbox");
                            case 10 -> System.out.println("Service");
                        }
                    }
                }

            }
        }
    }

    }