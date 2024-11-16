package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    // Inserisco dentro la classe il metodo main
    public static void main(String[] args) {

        // creare e inizializzare l’array contenente i nomi degli invitati
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        
        // chiedere all’utente come si chiama
        Scanner input = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nameUser = input.nextLine();

        // verificare che il nome sia presente nella lista
        // lasciarlo entrare o rispedirlo cortesemente da dove è venuto
        boolean isInvited = false;

        for(int i = 0; i < guestList.length; i++){
           
            if(nameUser.equals(guestList[i])){
                isInvited = true;
            } 
        };

        if(isInvited){
            System.out.println("Puoi entrare");

        }else{
            System.out.println("Torna da dove sei venuto");

        };




        input.close();

    }

}
