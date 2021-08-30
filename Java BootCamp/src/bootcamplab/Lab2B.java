package bootcamplab;

import java.util.Scanner;

public class Lab2B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		
		evenodd(num);
		addDecimal(num);
		scan.close();
	}
	public static void evenodd(int num) {
		if (num == 0) {
			System.out.println("Enter a nonZero number.");
		}
		else if (num % 2 == 0) {
			System.out.println("The number entered is Even.");
		}
		else {
			System.out.println("The number entered is Odd.");
		}
	
	}
	public static void addDecimal(int num) {
		double newNum = num;
		System.out.println("Integer with a decimal: " + newNum);
	}

}
