package challengeQuestions;

import java.util.Scanner;

public class Aug27Challenge1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentance: ");
		String word = scan.nextLine();
		word = word.trim();
		lastWord(word);
		
	}
	public static void lastWord(String word) {
		String end = "";
		for(int i = 0; i < word.length(); i++) {
			String num = Integer.toString(i);
			char[] str = word.toCharArray();
			String current = Character.toString(word.charAt(i));
			if ((str[i] >= 'A' && str[i] <= 'Z') ||
				(str[i] >= 'a' && str[i] <= 'z') || 
				(str[i] == ' ')) {
				end += current;
			
			}
		}
		String lastWord = end.substring(end.lastIndexOf(" ") + 1);
		System.out.println("The last word is \"" + lastWord + "\" with length " + lastWord.length() + ".");
	}
}
