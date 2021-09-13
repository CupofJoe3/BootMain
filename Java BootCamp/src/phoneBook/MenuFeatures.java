package phoneBook;

import java.util.Scanner;

public class MenuFeatures {
	public static void printMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to your PhoneBook, enter a number with the corresponding option.\n"
				+ "Enter 1 to add a new Person.\n"
				+ "Enter 2 to search your PhoneBook.\n"
				+ "Enter 3 to delete a Person.\n"
				+ "Enter 4 to update a Person by Phone Number.\n"
				+ "Enter 5 to show directory in ascending order.\n"
				+ "Enter 6 to exit the program.\n"
				+ "Enter here:");
	}
	public static boolean isNumeric(String userInput) {
	    if (userInput == null) {
	        return false;
	    }
	    try {
	        int d = Integer.parseInt(userInput);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	public static void printMenu2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number with the corresponding option.\n"
				+ "Enter 1 to search by first name.\n"
				+ "Enter 2 to search by last name.\n"
				+ "Enter 3 to search by full name.\n"
				+ "Enter 4 to search by number.\n"
				+ "Enter 5 to search by city or state.\n"
				+ "Enter here:");
	}
	
}
