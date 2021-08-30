package bootcamplab;

import java.util.Scanner;

public class Lab3D {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		
		dupBack(word);
	}

	public static void dupBack(String word) {
		word = word.toLowerCase();
		String dups = "";
		char[] strtoArray = word.toCharArray();
		
		
		for(int i = 0; i < word.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(j != i && word.charAt(i) == strtoArray[j]) {
					dups += word.charAt(i);
					dups += word.charAt(j);
					strtoArray[i] = ' ';
					strtoArray[j] = ' ';
				}
			}
		}
		String result = new String(strtoArray);
		result = result.replace(" ", "");
		result += dups;
		System.out.println("Your new word is: " + result);
	}
}
	



