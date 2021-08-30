package bootcamplab;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab2A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the base length of a triangle: ");
		double base = scan.nextDouble();
		System.out.println("Enter the height of a triangle: ");
		double height = scan.nextDouble();
		
		triangle(base, height);
		scan.close();
		
	}
	public static void triangle(double base, double height) {
		NumberFormat formatter = new DecimalFormat ("#0.00");
		
		double area = (base * height) / 2;
		System.out.println("The Area of your triangle is: " + formatter.format(area));
		
	}

}
