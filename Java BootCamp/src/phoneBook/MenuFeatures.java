package phoneBook;

import java.util.Arrays;
import java.util.Scanner;

public class MenuFeatures {
	public static void printMenu() {
		System.out.println("Welcome to your PhoneBook, enter a number with the corresponding option.\n"
				+ "Enter 1 to add a new Person.\n"
				+ "Enter 2 to search your PhoneBook.\n"
				+ "Enter 3 to delete a Person.\n"
				+ "Enter 4 to update a Person by Phone Number.\n"
				+ "Enter 5 to sort directory in ascending order.\n"
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
		System.out.println("\nEnter a number with the corresponding option.\n"
				+ "Enter 1 to search by first name.\n"
				+ "Enter 2 to search by last name.\n"
				+ "Enter 3 to search by full name.\n"
				+ "Enter 4 to search by number.\n"
				+ "Enter 5 to search by city.\n"
				+ "Enter here:");
	}
	public static boolean entryCheck(String entry) {
		String[] bits = entry.split(",");
		String lastOne = bits[bits.length-1];
		char [] phoneNumber = lastOne.trim().toCharArray();
		int phoneCount = 0;
		boolean result = false;
		char [] temp = entry.toCharArray();
		int commaCount = 0;
		for(int i = 0; i < entry.length(); i++) {
			if (temp[i] == ',') {
				commaCount++;
			}
		}
		if( phoneNumber.length == 10 && commaCount == 5) {
			result = true;	
			}
		return result;		
			
	}
	public static  Directory[] writeEntry(Directory[] book, String entry) {
		
		book = MenuFeatures.expandBook(book);
		book[book.length - 1] = new Directory(entry);
		return book;

	}
	public static Directory[] expandBook(Directory[] book) {
		Directory[] newBook = new Directory[book.length + 1];
		for(int i = 0; i < book.length; i++) {
			newBook[i] = book[i];
		}
		return newBook;
		
	}
	public static Directory[] removePerson(Directory[] book, int remove) {
		Directory[] temp = new Directory[book.length - 1];
		int index = remove - 1;
		
        for (int i = 0, k = 0; i < book.length; i++) {
            if (i == index) {
                continue;
                }
            temp[k++] = book[i];
        }
        return temp;
	}
	
	public static void viewBook(Directory[] book) {
		for(int i = 0; i < book.length; i++) {
			System.out.println("\nPhonebook Entry " + (i + 1) + ": \nFull Name: " + book[i].per.getFullName() 
								+ "\nFull Address: " + book[i].ad.getStreet() + ", " + book[i].ad.getCity() +", " + book[i].ad.getState() + ", " + book[i].ad.getZipCode() 
								+ "\nPhone Number: " + book[i].per.getpNumber());
		
		}
	}
	public static void secondMenuSearch(int input, Directory[] book) {
		Scanner in = new Scanner(System.in);
		if(input == 1) {
			System.out.println("\nEnter the First Name to search by: ");
			String sfName = in.nextLine();
			for(int i = 0; i < book.length; i++) {
			if (sfName.toLowerCase().contentEquals(book[i].per.getfName().toLowerCase())) {
			System.out.println("\nPhonebook Entry " + (i + 1) + ": \nFull Name: " + book[i].per.getFullName() 
							+ "\nFull Address: " + book[i].ad.getStreet() + ", " + book[i].ad.getCity() +", " + book[i].ad.getState() + ", " + book[i].ad.getZipCode() 
							+ "\nPhone Number: " + book[i].per.getpNumber());
				}
			}
			{System.out.println("\nEnd of search");}
		}
		else if (input == 2) {
			System.out.println("\nEnter the Last Name to search by: ");
			String slName = in.nextLine();
			for(int i = 0; i < book.length; i++) {
			if (slName.toLowerCase().contentEquals(book[i].per.getlName().toLowerCase())) {
			System.out.println("\nPhonebook Entry " + (i + 1) + ": \nFull Name: " + book[i].per.getFullName() 
							+ "\nFull Address: " + book[i].ad.getStreet() + ", " + book[i].ad.getCity() +", " + book[i].ad.getState() + ", " + book[i].ad.getZipCode() 
							+ "\nPhone Number: " + book[i].per.getpNumber());
				}
			}
			{System.out.println("\nEnd of search");}
		}
		else if (input == 3) {
			System.out.println("\nEnter the Full Name to search by: ");
			String sflName = in.nextLine();
			for(int i = 0; i < book.length; i++) {
			if (sflName.toLowerCase().contentEquals(book[i].per.getFullName().toLowerCase())) {
			System.out.println("\nPhonebook Entry " + (i + 1) + ": \nFull Name: " + book[i].per.getFullName() 
							+ "\nFull Address: " + book[i].ad.getStreet() + ", " + book[i].ad.getCity() +", " + book[i].ad.getState() + ", " + book[i].ad.getZipCode() 
							+ "\nPhone Number: " + book[i].per.getpNumber());
				}
			}
			{System.out.println("\nEnd of search");}
		}
		else if (input == 4) {
			System.out.println("\nEnter the Phone Number to search by: ");
			String number = in.nextLine();
			String n = phoneFormat(number);
			for(int i = 0; i < book.length; i++) {
			if (phoneFormat(n).toLowerCase().contentEquals(book[i].per.getpNumber().toLowerCase())) {
			System.out.println("\nPhonebook Entry " + (i + 1) + ": \nFull Name: " + book[i].per.getFullName() 
							+ "\nFull Address: " + book[i].ad.getStreet() + ", " + book[i].ad.getCity() +", " + book[i].ad.getState() + ", " + book[i].ad.getZipCode() 
							+ "\nPhone Number: " + book[i].per.getpNumber());
				}
			}
			{System.out.println("\nEnd of search");}
		}
		else if (input == 5) {
			System.out.println("\nEnter the City to search by: ");
			String city = in.nextLine();
			for(int i = 0; i < book.length; i++) {
			if (city.toLowerCase().contentEquals(book[i].per.getFullName().toLowerCase())) {
			System.out.println("\nPhonebook Entry " + (i + 1) + ": \nFull Name: " + book[i].per.getFullName() 
							+ "\nFull Address: " + book[i].ad.getStreet() + ", " + book[i].ad.getCity() +", " + book[i].ad.getState() + ", " + book[i].ad.getZipCode() 
							+ "\nPhone Number: " + book[i].per.getpNumber());
				}
			}
			{System.out.println("\nEnd of search");}
		}
	}
	public static String phoneFormat(String number) {
		String numberOnly = number.replaceAll("[^0-9]", "");
		String numFormat = String.valueOf(numberOnly).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
		return numFormat;
	}
	public static Directory[] sortBook(Directory[] book) {
		String[] names = new String[book.length];
		Directory[] bookTemp = new Directory[book.length];
		for(int i = 0; i < names.length; i++) {
			names[i] = book[i].per.getFullName();
		}
		Arrays.sort(names);
		
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names.length; j++) {
				if(names[i].contentEquals(book[j].per.getFullName())) {
					bookTemp[i] = book[j];
					break;
				}
			}
		}
		
		return bookTemp;
	}
}
