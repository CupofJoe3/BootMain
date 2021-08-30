package bootcamplab;

import java.util.Scanner;

public class Lab3B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.next();
		duplicate(word);
		
	}
	public static void duplicate(String word) {
		word = word.toLowerCase();
		String noDups = "";
		String dups = "";
		for(int i = 0; i < word.length(); i++) {
			String current = Character.toString(word.charAt(i));
			if (!noDups.contains(current)) {
				noDups += current;
			}	
		}
		System.out.println(noDups);
	}

}
