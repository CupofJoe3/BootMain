package preCourseWork;

public class KioskChangeCalculator {

	public static void main(String[] args) {
	
		double payment = 18;
		double totalDue = 17.18;
		returnChange(payment, totalDue);
		
	}
	private static void returnChange(double payment, double totalDue) {
		// Defined variables
		int changeDue = (int) ((payment - totalDue) * 100);
		int quarter = 25;
		int dime = 10;
		int nickle = 5;
		int penny = 1;
		int changeRemainderQ = (changeDue%quarter);
		int changeRemainderD = (changeRemainderQ%dime);
		int changeRemainderN = (changeRemainderD%nickle);

		
		// If statements
		if (changeDue >= 25) {
			int quarterCount = (changeDue / quarter);
			System.out.println("Quarters: " + quarterCount);
		}
		else {
			System.out.println("Quarters: " + 0);
		}
		if (changeRemainderQ <= 25 && changeRemainderQ >= 10) {
			int dimeCount = (changeRemainderQ / dime);
			System.out.println("Dimes: " + dimeCount);
		}
		else {
			System.out.println("Dimes: " + 0);
		}
		if (changeRemainderD <= 10 && changeRemainderD >= 5) {
			int nickleCount = (changeRemainderD / nickle);
			System.out.println("Nickles: " + nickleCount);
		}
		else {
			System.out.println("Nickles: " + 0);
		}
		if (changeRemainderN <= 5 && changeRemainderN >= 0) {
			int pennyCount = (changeRemainderN / penny);
			System.out.println("Pennies: " + pennyCount);
		}
		else {
			System.out.println("Pennies: " + 0);
		}
		

	}
}
