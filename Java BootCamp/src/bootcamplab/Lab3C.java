package bootcamplab;

import java.util.Scanner;

public class Lab3C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word or words: ");
		String word = scan.nextLine();
		char[] temp = word.toLowerCase().toCharArray();
		int length = temp.length;
		vcCount(temp, length, word);
		
	}
	public static void vcCount(char[] temp, int length, String word) {
		int vowelCount = 0;
		int consonantCount = 0;
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i < length; i++) {
			if ((temp[i] == vowels[0] ||
				 temp[i] == vowels[1] ||
				 temp[i] == vowels[2] ||
				 temp[i] == vowels[3] ||
				 temp[i] == vowels[4])) {
						vowelCount++;
					}
			else if (temp[i] == ' ') {
					}
			else { consonantCount++;}
				}
		System.out.println("There are " + vowelCount + " vowels and " + consonantCount + " consonants in \"" + word + "\'");
	}
}