package basics;

public class Numbers {

	public static void main(String[] args) {
		int numA = 5;
		int numB = 6;
		
		// Add together to get sum
		int sum = numA + numB;
		//System.out.println(sum);
		
		// Divide by 2
		System.out.println(sum / 2);
		
		// Solution 1: modify our divisor by double
		System.out.println(sum / 2.0);
		
		// Solution 2: "cast" our number to a double
		//double average = (numA + numB)/2;
		double average = ((double)(numA + numB))/2;
		System.out.println(average);
		
	}

}
