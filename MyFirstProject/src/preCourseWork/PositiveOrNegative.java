package preCourseWork;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number:");
		int number = scan.nextInt();
		
		scan.close();
		
			if (number < 0) {
				System.out.println("Negative");	
			}
			else if (number > 0) {
				System.out.println("Positive");
			
			
		}
		System.out.println();
	}
}
