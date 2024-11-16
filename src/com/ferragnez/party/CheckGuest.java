package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    // Inserisco dentro la classe il metodo main
    public static void main(String[] args) {

        // creare e inizializzare l’array contenente i nomi degli invitati
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nameUser = input.nextLine();
        System.out.println(nameUser);


        input.close();

    }

}
