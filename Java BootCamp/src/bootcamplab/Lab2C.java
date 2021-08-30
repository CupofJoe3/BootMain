package bootcamplab;

import java.util.Scanner;

public class Lab2C {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = scan.next().charAt(0);
		letterValue(letter);
		scan.close();
	}
	public static void letterValue(char letter) {
		if ((letter >= 'a' && letter <= 'z' ) || (letter >= 'A' && letter <= 'Z')) {
		//int value = Character.getNumericValue(letter);
		int value = (int) letter;
		System.out.println("The letter " + letter + " has a value of " + value + ".");
		}
		else {
			System.out.println("Try again. Please enter a letter.");
		}
	}
}	
