package nl.hogeschoolrotterdam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    LoopingSum();
    }

    private static void LoopingSum() {
        // Een boolean waarde bevat 'waar' of 'niet waar' -> true & false
        // Boolean waardes worden gebruikt in voorwaardes
        boolean keepGoing = true;
        int sum = 0;

        // We willen doorgaan met het herhalen van onderstaande code zolang 'keepGoing' op 'true' staat
        while (keepGoing) {
            // We vragen de gebruiker om input
            System.out.println("Voer een getal in om op te tellen of type 'stop' om te stoppen");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            // Controleer of de gebruiker 'stop' heeft ingevuld
            if (input.equals("stop")) {
                // Verander de waarde van 'keepGoing' naar 'false' om de herhaling te stoppen
                keepGoing = false;
            } else {
                // Een try / catch stelt ons instaat om een bepaalde actie uit te voeren als er een
                // foutmelding ontstaat
                try {
                    // We proberen de input van de gebruiker om te zetten naar een integer =
                    // Als dit niet lukt, dan gaat de code door op regel 38
                    sum = Integer.parseInt(input);
                }
                catch (Exception e) {
                    // We vertellen de gebruiker dat de input incorrect is
                    System.out.println("That's not a valid integer value");
                }
            }
        }

        // Aan het einde moeten we nog wel het totaal laten zien
        System.out.println("Het totaal is: " + sum);
    }
}
