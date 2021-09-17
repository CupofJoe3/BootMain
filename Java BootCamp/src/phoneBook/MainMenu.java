package phoneBook;

import java.util.*;

public class MainMenu {

	public static void main(String[] args) {
		String goAgain = "y";
		Scanner scan = new Scanner(System.in);
		Directory[] book = new Directory[2];
		String perm1 = "Mike Green, 124 WonderLand St, Houston, TX, 77777, 1234567891";
		Directory p1 = new Directory(perm1);
		String perm2 = "Chad John James, 1882 Avenue St, Dallas, TX, 77990, 1234567890";
		Directory p2 = new Directory(perm2);
		book[0] = p1;
		book[1] = p2;
		
		
		while (true) {
			MenuFeatures.printMenu();
			String userInput = scan.nextLine();
			if(MenuFeatures.isNumeric(userInput) == true) {
			int input = Integer.parseInt(userInput);
			if(input > 0 && input < 7) {
			switch(input) {
				//add entry
				case 1:
					System.out.println("Enter your entry as follows with commas eg(John E Doe, 324 Main St, St Charles, MO, 63303, 8475390126): ");
					Scanner data = new Scanner(System.in);
					String entry = data.nextLine();	
					if (MenuFeatures.entryCheck(entry) == true) {
						book = MenuFeatures.writeEntry(book, entry);
						
						System.out.println("Entry was added.");
					}
					else {System.out.println("Invalid entry or invalid Phone Number.");}
					break;
					
				//Search that then breaks into second menu to search by option
				case 2: 
					MenuFeatures.printMenu2();
					userInput = scan.nextLine();
					if(MenuFeatures.isNumeric(userInput) == true) {
						input = Integer.parseInt(userInput);
						if(input > 0 && input < 7) {
							switch(input) {
							case 1: MenuFeatures.secondMenuSearch(input, book);
								break;
							case 2: MenuFeatures.secondMenuSearch(input, book);
								break;
							case 3: MenuFeatures.secondMenuSearch(input, book);
								break;
							case 4: MenuFeatures.secondMenuSearch(input, book);
								break;
							case 5: MenuFeatures.secondMenuSearch(input, book);
								break;
							default: break;
							}
						}
					}
					break;
				//delete record
				case 3: MenuFeatures.viewBook(book);
					System.out.println("\nEnter the corresponding Entry number for the person to delete: ");
					//Scanner in = new Scanner(System.in);
					int remove = Integer.parseInt(scan.nextLine());
					if(remove <= book.length) {
						book = MenuFeatures.removePerson(book, remove);
						
					}
					else {System.out.println("\nInvalid Entry number.");}
					
					break;
				//update record by number
				case 4: MenuFeatures.viewBook(book);
					System.out.println("\nEnter the phone number you would like to update: ");
					String number = scan.nextLine();
					number = MenuFeatures.phoneFormat(number);
					
					
					break;
				
				case 5: MenuFeatures.viewBook(book);
				
					break;
				
				case 6: 
					break;
				default: System.out.println("No choice was selected.");
			}
			}
			else {System.out.println("Error with your input.");}}
			//else {System.out.println("Error with your input.");}
			System.out.println("\nEnter y to go back to Main Menu: ");
            goAgain = scan.nextLine();
            if (!goAgain.equals("y")) {
            break;
          	} 
		}
	}
}

