package preCourseWork;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number:");
		int number = scan.nextInt();
		
		scan.close();
		
			if (number % 2 == 0 ) {
				System.out.println("Even");	
			}
			else
				System.out.println("Odd");
		}

}
