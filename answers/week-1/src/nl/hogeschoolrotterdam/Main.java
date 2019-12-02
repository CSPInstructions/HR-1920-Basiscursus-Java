package nl.hogeschoolrotterdam;

public class Main {

    public static void main(String[] args) {
        // Opdracht 1
        String oneName = "Wesley";
        System.out.println("Hallo, " + oneName + ", Welkom!");

        // Opdracht 2
        int twoFirstNumber = 5;
        int twoSecondNumber = 6;
        int twoAnswer = twoFirstNumber + twoSecondNumber;
        System.out.println(twoFirstNumber + " + " + twoSecondNumber + " = " + twoAnswer);

        // Opdracht 3
        int threeAge = 21;
        String threeName = "Jimmy";
        System.out.println(threeName + " is " + threeAge + " jaar oud");

        // Opdracht 4
        float fourDecimalNumber = 4.44f;
        float fourDouble = fourDecimalNumber * 2;
        System.out.println("Het dubbele van " + fourDecimalNumber + " is " + fourDouble);

        // Opdracht 5
        float fiveDecimalNumber = 5.55f;
        float fiveHalf = fiveDecimalNumber / 2;
        System.out.println("De helft van " + fiveDecimalNumber + " is " + fiveHalf);

        // Opdracht 6
        String sixFirstText = "Dit is een tekst";
        String sixSecondText = "Dit is een andere tekst";
        System.out.println(sixFirstText + sixSecondText);

        // Opdracht 7
        float sevenFirstNumber = 15f;
        float sevenSecondNumber = 84f;
        System.out.println("De som is: " + (sevenFirstNumber + sevenSecondNumber));
        System.out.println("Het verschil is: " + (sevenFirstNumber - sevenSecondNumber));
        System.out.println("Het product is: " + (sevenFirstNumber * sevenSecondNumber));
        System.out.println("Het quotiënt is: " + (sevenFirstNumber / sevenSecondNumber));

        // Opdracht 8
        int eightNumber = 6;
        String eightText = "Hallo";
        System.out.println(eightText.repeat(eightNumber));

        // Opdracht 9
        int nineFirstNumber = 24;
        int nineSecondNumber = 67;
        System.out.println(nineFirstNumber + "" + nineSecondNumber);

        // Opdracht 10
        String tenFirstName = "Wesley";
        String tenSecondName = "Jimmy";
        int tenCharacterCountDifference = tenFirstName.length() - tenSecondName.length();
        System.out.println(
            "Het verschil tussen " + tenFirstName + " en " + tenSecondName + " is " + tenCharacterCountDifference
        );
    }
}
