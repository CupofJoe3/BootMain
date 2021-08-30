package bootcamplab;

import java.util.Scanner;

public class Lab2E {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 digits representing a year: ");
		int year = scan.nextInt();
		
		leapYear(year);
		scan.close();
		
	}
	public static void leapYear(int year) {
		boolean isLeap = true;
		if (year % 4 != 0) {
			isLeap = false;
		}
		if ((year % 4 == 0) && (year % 100 != 0)) {
			isLeap = true;
		}
		if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
			isLeap = true;
		}
		else {
			isLeap = false;
		}
	if (isLeap == true) {
		System.out.println(year + " is a leap year.");
	}
	else {
		System.out.println(year + " is not a leap year.");
	}
	}		
}

