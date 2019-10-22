package co.grandcircus;

/*
 * @author : Adam Graff
 */

import java.util.Scanner;

public class Week1Capstone {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String contQuest;
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();

		do {
			System.out.print("Enter a line to be translated: ");
			String userInput = scan.next();
			userInput = userInput.toLowerCase();
			System.out.println(generatePigLatin(userInput));
			System.out.println();
			System.out.print("Translate another line? (y/n)");
			System.out.println();
			contQuest = scan.next();
		} while (!contQuest.equalsIgnoreCase("N"));

		System.out.println();
		System.out.println("Goodbye!");
		
		scan.close();
	}

	public static String generatePigLatin(String userInput) {

		String lastPart;
		String firstPart;
		String finalTranslation = "";
		char firstLetter = userInput.charAt(0);

		if ((firstLetter == 'a') || (firstLetter == 'e') || (firstLetter == 'i') || (firstLetter == 'o')
				|| (firstLetter == 'u')) {
			 finalTranslation = userInput + "way";
		} else {
			for (int i = 0; i < userInput.length(); i++) {
				char whatEvs = userInput.charAt(i);
				String fam = Character.toString(whatEvs);
				if (fam.matches("[aeiou]")) {
					lastPart = userInput.substring(i);
					firstPart = userInput.substring(0, i);

					finalTranslation = lastPart + firstPart + "ay";
					break;
				}
			}
		}
		return finalTranslation;

	}
}

