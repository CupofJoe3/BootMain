package bootcamplab;

public class Lab1C {

	public static void main(String[] args) {
		
	int k = 12;
	int n = 6;
	
	int number = 5;
	
	System.out.println(isFactor(k, n));
	System.out.println(isPerfect(number));
	System.out.println(isPrime(number));
	
	}
	// problem 5
	public static boolean isFactor(int k, int n) {
		boolean answer = true;
		
		if (k % n == 0) {
			answer = true;
		}
		else {
			answer = false;
		}
		return answer;
	}
	// problem 6
	public static boolean isPerfect(int number) {
		int i; 
		int sum = 0;
		boolean perfect = false;
		
		for (i = 1; i < number; i++) {
			if (isFactor(number, i))  {
				sum = sum + i;
			}
		}
			if (sum == number) {
				perfect = true;
			}
			else {
				perfect = false;
			}
			return perfect;
		}
	// problem 7
	public static boolean isPrime(int number) {
		boolean prime = true;
		int i;
		
		if (number == 0 || number == 1) {
			prime = false;
		}
		for (i = 2; i <= number/2; i++) {
			if (isFactor(number, i)) {
				prime = false;
			}
		}
		return prime;
	}
}
	


