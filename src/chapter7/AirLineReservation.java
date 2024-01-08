package chapter7;

import javax.swing.*;

public class AirLineReservation {
    public boolean[] getEmptyPlaneSeats() {
        return new boolean[10];
    }

    public boolean assignSeat(int section) {
        boolean[] planeSeats = getEmptyPlaneSeats();
        switch (section) {
            case 1 -> planeSeats[0] = true;
        }
        return planeSeats[0];
    }
    public static void main(String[] args) {
        AirLineReservation airLineReservation = new AirLineReservation();
        boolean[] planeSeats = airLineReservation.getEmptyPlaneSeats();
        int checkIn = 10;
        int firstClassCount = 0;
        int economyCount = 5;

        while (checkIn > 0) {
            int section = Integer.parseInt(JOptionPane.showInputDialog(null, "please type 1 for first class and 2 for economy reservations "));
            if (section== 1 && firstClassCount == 4 && economyCount==9){
                System.exit(2);
            }else if (section== 2 && firstClassCount == 4 && economyCount==9){
                System.exit(2);
            }
            else if (section == 1 && firstClassCount < 4) {
                planeSeats[firstClassCount] = true;
                JOptionPane.showMessageDialog(null, "==Boarding pass== your seat number is " + (firstClassCount+1));
                firstClassCount++;
                checkIn--;
            } else if (section == 2 && economyCount < 9) {
                planeSeats[economyCount] = true;
                JOptionPane.showMessageDialog(null, "==Boarding pass== your seat number is " + (economyCount+1));
                economyCount++;
                checkIn--;
            } else if (section == 1 && firstClassCount == 4 && economyCount < 9) {
                String switchSection = JOptionPane.showInputDialog("All first class seats are occupied, if you dont mind can we assign you a seat in the economy section enter yes to take reassign no to wait for next flight");
                if (switchSection.equalsIgnoreCase("yes")) {
                    planeSeats[economyCount] = true;
                    JOptionPane.showMessageDialog(null, "==Boarding pass== your seat number is " + (economyCount+1));
                    economyCount++;
                    checkIn--;
                } else if (switchSection.equalsIgnoreCase("no")) {
                    JOptionPane.showMessageDialog(null, "next flight leaves in 3 hours");
                } else if (section == 2 && firstClassCount < 4 && economyCount == 9) {
                    switchSection = JOptionPane.showInputDialog("All economy class seats are occupied, if you dont mind can we assign you a seat in the first class section enter yes to take reassign no to wait for next flight");
                    if (switchSection.equalsIgnoreCase("yes")) {
                        planeSeats[firstClassCount] = true;
                        JOptionPane.showMessageDialog(null, "==Boarding pass== your seat number is " + (firstClassCount+1));
                        firstClassCount++;
                        checkIn--;
                    } else if (switchSection.equalsIgnoreCase("no")) {
                        JOptionPane.showMessageDialog(null, "next flight leaves in 3 hours");
                    }

                }
            }
        }
    }
}