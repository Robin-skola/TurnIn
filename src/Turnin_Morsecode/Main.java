package Turnin_Morsecode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseLogic morseLogic = new MorseLogic();
        Scanner scanChecker = new Scanner(System.in);

        while (true) {
            System.out.println("Välj en Siffra:");
            System.out.println("1. Omvandla text till morsekod");
            System.out.println("2. Omvandla morsekod till text");
            System.out.println("3. Avsluta");

            int menuChoice;
            try {
                menuChoice = Integer.parseInt(scanChecker.nextLine());
            } catch (NumberFormatException exception1) {
                System.out.println("Error 404: Vänligen ange en siffra mellan 1-3");
                continue;
            }
//  MENU options
            switch (menuChoice) {
                case 1:
                    System.out.print("Ange text: ");
                    String text = scanChecker.nextLine();
                    System.out.println("Morsekod: " + morseLogic.textToMorse(text));
                    break;

                case 2:
                    System.out.print("Ange morsekod: ");
                    String morse = scanChecker.nextLine();

                    try {
                        System.out.println("Text: " + morseLogic.morseToText(morse));
                    } catch (IllegalArgumentException exception2) {
                        System.out.println(exception2.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Programmet avslutas.");
                    scanChecker.close();
                    return;

                default:
                    System.out.println("Error: Välj Mellan 1-3");
            }
        }
    }
}