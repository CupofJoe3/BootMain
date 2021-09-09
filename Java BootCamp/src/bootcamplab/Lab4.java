package bootcamplab;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a corresponding number for each method.\n"
				+ "1 for sumLimit.\n"
				+ "2 for squirrelPlay.\n"
				+ "3 for lotteryTicket.\n"
				+ "4 for countXX.\n"
				+ "5 for stringTimes.\n"
				+ "Enter here: ");
		int method = input.nextInt();
		switch (method) {
			case 1: System.out.println(sumLimit());
			break;
		
			case 2: System.out.println(squirrelPlay());
			break;
		
			case 3: System.out.println(lotteryTicket());
			break;
		
			case 4: System.out.println(countXX());
			break;
		
			case 5: System.out.println(stringTimes());
			break;
			
			default: System.out.println("Invalid method.");
			break;
		}
	}
	public static int sumLimit() {
		int answer;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int a = scan.nextInt();
		System.out.print("Enter an Integer: ");
		int b = scan.nextInt();
		if ((a + b) > 9) {
			answer = a;
		}
		else {
		answer = a + b;	
		}
		return answer;
		
	}
	public static boolean squirrelPlay() {
		boolean playTime = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter true or false for if it is summer: ");
		boolean isSummer = scan.nextBoolean();
		System.out.println("Enter the outside temperature: ");
		int temp = scan.nextInt();
		
		if (isSummer = true) {
			if (temp >= 60 && temp <= 100) {
				playTime = true;
			}
			else {playTime = false;}
		}
		else if (isSummer = false) {
			if (temp >= 60 && temp <= 90) {
				playTime = true;
			}
			else {playTime = false;}
		}
		return playTime;
	}
	public static int lotteryTicket() {

		int greenTicket = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int a = scan.nextInt();
		System.out.println("Enter an Integer: ");
		int b = scan.nextInt();
		System.out.println("Enter an Integer: ");
		int c = scan.nextInt();
		
		if (a == b || a == c) {
			sum++;
		}
		if (b == c) {
			sum++;
		}
		greenTicket = sum * 10;
		
		return greenTicket;
	}
	public static int countXX() {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a your phrase to find repeating xx: ");
		String phrase = scan.nextLine().toLowerCase();
		char[] letters = phrase.toCharArray();
		
		for(int i = 0; i < letters.length; i++) {
			if (i != (letters.length -1)) {
				if (letters[i] == 'x') {
					if (letters[i] == letters[i + 1]) {
						count ++;
				}
			}
		}
	}
		
		return count;
	}
	public static String stringTimes() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = scan.nextLine();
		System.out.println("Enter an Integer: ");
		int times = scan.nextInt();
		String endStatement = "";
		
		for(int i = 0; i != times; i++) {
			endStatement += word;
		}
		return endStatement;
	}
}
