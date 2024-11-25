import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanningText = new Scanner(System.in); // Tar emot texten i konsolen.
        LogicThings theLoopLogic = new LogicThings(); // Skapa en instans av LogicThings

        System.out.println("Skriv in text. Skriv 'stop' för att avsluta.");/* // Skriver ut hur programmet
        ska användas.
        */

        // Loop som gör metoden och ifall if är true så break
        while (true) {
            String input = scanningText.nextLine();


            if (theLoopLogic.processBreak(input)) {
                break;
            }
        }

        // Skriv ut resultaten
        System.out.println("Antal rader " + theLoopLogic.getHowManyLines());
        System.out.println("Antal tecken " + theLoopLogic.getHowManyCharacters());
        System.out.println("Antal ord: " + theLoopLogic.getHowManyWords());
        System.out.println("Det längsta ordet: " + theLoopLogic.getLongestWord());

        scanningText.close();
    }
}