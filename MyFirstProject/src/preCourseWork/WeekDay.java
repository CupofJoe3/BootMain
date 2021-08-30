package preCourseWork;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a week day number starting with Sunday (1-7): ");
		int dayOfTheWeek = scan.nextInt();
				
		scan.close();
			
		if (dayOfTheWeek == 1 ) { 
			System.out.println("Sunday");
			}
		
		else if (dayOfTheWeek == 2 ) { 
			System.out.println("Monday");
			}
		
		else if (dayOfTheWeek == 3 ) { 
			System.out.println("Tuesday");
			}
		
		else if (dayOfTheWeek == 4 ) { 
			System.out.println("Wednesday");
			}
		
		else if (dayOfTheWeek == 5 ) { 
			System.out.println("Thursday");
			}
		
		else if (dayOfTheWeek == 6 ) { 
			System.out.println("Friday");
			}
		
		else if (dayOfTheWeek == 7 ) { 
			System.out.println("Saturday");
			}
		
		else { 
			System.out.println("Invalid number not between 1-7 ");
		}	
	}
}
