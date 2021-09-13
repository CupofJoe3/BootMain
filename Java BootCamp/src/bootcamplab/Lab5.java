package bootcamplab;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a corresponding number for each method.\n"
				+ "1 for countA.\n"
				+ "2 for removeSpaces.\n"
				+ "3 for findDup.\n"
				+ "4 for reverse.\n"
				+ "Enter here: ");
		int method = input.nextInt();

		switch (method) {
		case 1: System.out.println(countA());
		break;
	
		case 2: System.out.println(removeSpaces());
		break;
	
		case 3: findDup();
		break;
	
		case 4: System.out.println(reverse());
		break;
		
		default: System.out.println("Invalid method.");
		break;
	}
	}
	public static int countA() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word or phrase: ");
		String input = scan.nextLine();
		char [] word = input.toCharArray();
		int count = 0;
		for(int i = 0; i < word.length; i++) {
			if (word[i] == 'a') {
				count++;
			}
		}
		
		return count;
		
	}
	public static String removeSpaces() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String noSpaces = "";
		String input = scan.nextLine();
		char [] word = input.toCharArray();
		for(int i = 0; i < word.length; i++) {
			if (word[i] != ' ') {
				String current = Character.toString(word[i]);
				noSpaces += current;
				}
			}
	return noSpaces;	
}
	public static void findDup() {
		int count;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		String phrase = scan.nextLine();
		char [] charArray = phrase.toCharArray();
		for(int i = 0; i < charArray.length; i++) {  
            count = 1;  
            for(int j = i+1; j <charArray.length; j++) {  
                if(charArray[i] == charArray[j] && charArray[i] != ' ') {  
                    count++;  
                    charArray[j] = '0';  
                }  
            }  
            if(count > 1 && charArray[i] != '0')  
                System.out.print(charArray[i]);  
        }  
		
	}
	public static String reverse() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String answer = "";
		String original = scan.nextLine();
		String strArray[] = original.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			answer += strArray[i] + " ";
		}
		return answer;
	}
}