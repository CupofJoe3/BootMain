package preCourseWork;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Input a number grade: ");
		int grade = scan.nextInt();
				
		scan.close();
			
		if (grade <= 100 && grade >= 90 ) { 
			System.out.println("A");
			}
		
		else if (grade <= 89 && grade >= 80 ) { 
			System.out.println("B");
			}
		
		else if (grade <= 79 && grade >= 72 ) { 
			System.out.println("C");
			}
		
		else if (grade <= 71 && grade >= 64 ) { 
			System.out.println("D");
			}
		
		else if (grade <= 64 && grade >= 0 ) { 
			System.out.println("F");
			}
		else {
			System.out.println("Invalid Grade :( ");
		}
	}
}
