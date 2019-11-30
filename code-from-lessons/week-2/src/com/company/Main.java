package com.company;

// Soms hebben we code nodig die niet in het standaard pakket van Java zit
// Met een import zorgen we ervoor dat we deze code kunnen gebruiken
// In dit geval zorgt de import ervoor dat we gebruik kunnen maken van de scanner
import java.util.Scanner;

// Hiermee krijgen we toegang tot JPane en JOptionPane
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // We willen beginnen met het verkrijgen van input
        // In Java hebben we hier een scanner voor nodig, deze maken we op de volgende manier
        Scanner scanner = new Scanner(System.in);

        // Om een stukje tekst te vragen van de gebruiker, beginnen we met het stellen van een vraag
        // Met print ipv van println zorgen we ervoor dat de cursus niet naar een nieuwe regel springt
        System.out.print("Uw naam: ");

        // Vervolgens gebruiken we de scanner om de input van de gebruiker op te slaan
        // Hiervoor gebruiker we de nextLine functie van de scanner; dit geeft altijd een string terug
        String name = scanner.nextLine();

        // Soms is het handig om de scanner tussendoor even te resetten
        // Resten informatie worden op deze manier verwijderd
        scanner = new Scanner(System.in);

        // Laten we beginnen met het maken van een integer die een leeftijd bevat
        // We kunnen hiervoor de scanner gebruiken, met de nextInt functie
        System.out.print("Uw leeftijd: ");
        int age = scanner.nextInt();

        // Vervolgens willen de ontwikkelingsstage van het individu gaan bepalen
        // Hiervoor beginnen we met een 'if' en zetten tussen haakjes een voorwaarde
        if (age > 20) {
            // Tip:
            // Door 'sout' te typen gevolgd door enter, krijg je direct System.out.println
            System.out.println(name + " is volwassen");
        }

        // 'Else if' wordt gebruikt om op nog een conditie te checken
        // Er wordt alleen gekeken naar onderstaande conditie als degene hierboven NIET klopt
        else if (age >= 18) {
            System.out.println(name + " is jong volwassen");
        }

        // Dit kunnen we zovaak doen als we willen
        else if (age >= 10) {
            System.out.println(name + " is een tiener");
        }

        // 'Else' is een opdracht die altijd aan het einde staat
        // De code bij 'else' wordt uitgevoerd op het moment dat alle andere condities niet kloppen
        else {
            // Met printf kunnen we een string aanmaken, om vervolgens waardes hieraan toe te voegen
            // Met %s wordt aangegeven dat er een string moet komen te staan
            // Daarnaast wordt %d gebruikt voor getallen en %f voor kommagetallen
            // De \n wordt gebruikt om de cursus op de volgende regel te zetten
            System.out.printf("%s is een kind\n", name);
        }

        // Vervolgens gaan we loops gebruiken om wat figuren op het scherm te tekenen
        // De eerste stap is het definieren van een hoogte voor een driehoek
        int heightTriangle  = age;

        // In dit geval maken we gebruik van een while loop om een driehoek op het scherm te printen
        // Ook een while werkt met een conditie
        while (heightTriangle > 0) {
            int lineLength = heightTriangle;

            // While loops kunnen we ook in while loops gebruiken
            while (lineLength > 0) {
                System.out.print("X");

                // We moeten de waarde waarop de conditie van de while loop is gebaseerd wel veranderen
                // Anders blijft de while loop voor eeuwig doorgaan
                lineLength = lineLength - 1;
            }

            // Deze println wordt enkel gebruikt om de cursus naar de volgende regel te krijgen
            System.out.println();

            // Get aanpassen van de waarde om naar de volgende regel te gaan
            heightTriangle = heightTriangle - 1;
        }

        // Een for-loop is een andere manier om code te herhalen
        // Bij een for-loop wordt er echter veel meer gedefinieerd naast de conditie
        // Dit zorgt ervoor dat we uiteindelijk minder regels code hebben
        // Op de achtergrond is het echter nog steeds een while loop
        for (int squareHeight = age; squareHeight > 0; squareHeight = squareHeight - 1) {
            for (int lineLength = age; lineLength > 0; lineLength = lineLength - 1) {
                System.out.print("X");
            }

            System.out.println();
        }

        /*
            OPTIONAL STUFF
         */

        // Met JOptionPane kunnen we informatie vragen aan de gebruiker doormiddel van een GUI (venster)
        String information = JOptionPane.showInputDialog(new JFrame(), "Vul wat tekst in");
        JOptionPane.showMessageDialog(new JFrame(), information);

        // Resetten voor de zekerheid
        scanner = new Scanner(System.in);

        // Soms zorgt het vragen van input voor een error; bijvoorbeeld het invullen van tekst bij nextInt
        // Dit kan worden opgevangen door try - catch
        // De code die bij try staat wordt uitgevoerd, als er een error is, gaat het programma door met de catch
        try {
            System.out.print("Geef een getal om te verdubbelen: ");
            int number = scanner.nextInt();
            System.out.printf("%d x 2 = %d", number, number * 2);
        } catch (Exception e) {
            System.out.println("Vul een heel getal in...");
        }
    }
}
