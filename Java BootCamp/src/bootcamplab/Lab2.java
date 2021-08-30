package bootcamplab;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle: ");
		
		double radius = scan.nextDouble();
		circle(radius);
		scan.close();
	}
	public static void circle(double radius) {
		NumberFormat formatter = new DecimalFormat("#0.00");

		double area = (Math.pow(radius, 2) * 3.14);
		double circumference = (2 * 3.14 * radius);
		System.out.println("The Area of your circle is: " + formatter.format(area));
		System.out.println("The Circumference of your circle is: " + formatter.format(circumference));	
	}

}
