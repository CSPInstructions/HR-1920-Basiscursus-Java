package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = askQuestion("Wat is je naam?");

        if (name.equals("Wesley")) {
            System.out.println("Hoi");
        } else {
            System.out.println("Denk het niet...");
        }
    }

    // We maken een functie aan, dit heeft de volgende onderdelen
    // public static [returntype] [functienaam] ([parameters]) {
    //      [code]
    //      [returnwaarde]
    // }
    public static String askQuestion(String question) {
        System.out.println(question);

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        // De waarde achter de return opdrachten 'geven we terug' aan de code
        // Hierdoor kunnen we op regel 8 het resultaat van deze functie opslaan in een variabele
        return answer;
    }
}
















