package bootcamplab;

public class Lab1B {

	public static void main(String[] args) {
	
	boolean valueOne = false;
	boolean valueTwo = true;
	
	System.out.println(xor(valueOne, valueTwo));
	
	}
	public static boolean xor( boolean valueOne, boolean valueTwo) {
		boolean answer = valueOne ^ valueTwo;
		return answer;
		
	}
}
