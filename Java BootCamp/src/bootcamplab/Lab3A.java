package bootcamplab;

import java.util.Scanner;

public class Lab3A {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word that you would like to alter: ");
		String word = scan.next();
		word = word.toLowerCase();
		System.out.print("Enter the letter you would like removed: ");
		String letter = scan.next();
		
		
		char[] remove = letter.toCharArray();
		int testLength = remove.length;
		
		if (testLength > 1) {
			System.out.println("Restart. You entered more than one letter.");
			System.out.print("Enter the letter you would like removed: ");
			letter = scan.next();
		}
		else {
			removeLetter(word, letter);
		}
		
	}
	public static void removeLetter(String word, String letter) {
		letter = letter.toLowerCase();
		char[] remove = letter.toCharArray();
		char[] strtoArray = word.toCharArray();
		int wordLength = strtoArray.length;
		
		for (int dex = 0; dex < wordLength; dex++) {
			char current = strtoArray[dex];
			if (current != remove[0]) {
				strtoArray[dex] = current;
				System.out.print(current);
			}
			
		}
		
	}

}
