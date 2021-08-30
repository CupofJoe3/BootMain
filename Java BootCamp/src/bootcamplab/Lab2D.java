package bootcamplab;

import java.util.Scanner;

public class Lab2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = scan.nextDouble();
		
		round(num);
		scan.close();
	}
	public static void round(double num) {
		int newnum = (int) Math.round(num);
		System.out.println(newnum);
	}

}
