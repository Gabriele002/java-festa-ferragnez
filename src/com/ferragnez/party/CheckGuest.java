package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] invited = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
                "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei",
                "Martina Maccherone", "Rachel Zeilic","Matteo Musella"};

        System.out.print("Whats your name? ");
        String nameInvited = scan.nextLine();
        boolean invitato = false;

        for (int i = 0; i < invited.length && !invitato ; i++) {
            if (nameInvited.equals(invited[i])) {
                invitato = true;

            }

            }
            if (invitato) {
                System.out.println("Presente nella lista");
            } else {
                System.out.println("Mi dispiace non sei stato invitato");
            }

        scan.close();

    }
}
