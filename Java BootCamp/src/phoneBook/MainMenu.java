package phoneBook;

import java.io.*;
import java.util.*;

public class MainMenu {

	public static void main(String[] args) throws IOException {
		File file = new File("PhonebookOut.txt");
		FileWriter fw = new FileWriter(file);
		FileReader fr = new FileReader(file);
		PrintWriter pw = new PrintWriter(fw);
		Scanner scan = new Scanner(System.in);
		pw.println("HiHi");
		pw.close();
		
		while (true) {
			MenuFeatures.printMenu();
			String userInput = scan.next();
			if(MenuFeatures.isNumeric(userInput) == true) {
			int input = Integer.parseInt(userInput);
			if(input > 0 && input < 7) {
			switch(input) {
				case 1: System.out.println("1");
					break;
				case 2: 
					MenuFeatures.printMenu2();
					userInput = scan.next();
					if(MenuFeatures.isNumeric(userInput) == true) {
						input = Integer.parseInt(userInput);
						if(input > 0 && input < 7) {
							switch(input) {
							case 1: 
								break;
							case 2: 
								break;
							case 3: 
								break;
							case 4: 
								break;
							case 5: 
								break;
							default: break;
							}
						}
					}
					System.out.println("2");
					break;
				case 3: System.out.println("3");
					break;
				case 4: System.out.println("4");
					break;
				case 5: System.out.println("5");
					break;
				case 6: System.out.println("6");
					break;
				default: System.out.println("No choice was selected.");
			}
			}
			else {System.out.println("Error with your input.");}}
			else {System.out.println("Error with your input.");}
			System.out.println("Enter y to go back to Main Menu: ");
            String goAgain = scan.next();
            if (!goAgain.equals("y")) {
               break;
            } 
		}
	}
}
