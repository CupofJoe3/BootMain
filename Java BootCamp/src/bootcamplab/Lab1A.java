package bootcamplab;

public class Lab1A {

	public static void main(String[] args) {
		int numberone = 5;
		int numbertwo = 10;
		int numberthree = 2;
		int total = numberone + numbertwo + numberthree;
		int largestnumber = max3(numberone, numbertwo, numberthree);
		int smallestnumber = min3(numberone, numbertwo, numberthree);
		int mediannumber = median3(total, smallestnumber, largestnumber);
		
		if (numberone == numbertwo || numbertwo == numberthree || numberone == numberthree) {
			System.out.println("Enter three integers that are not equal in value.");
		}
			else {System.out.println("The largest number is: " + largestnumber); System.out.println("The smallest number is: " + smallestnumber); System.out.println("The median number is: " + mediannumber);}
		}
	
	public static int max3( int numberone, int numbertwo, int numberthree) { 
		int largestnumber = 0;
		
		if ( numberone > numbertwo && numberone > numberthree) {
			largestnumber = numberone;
		}
		else if ( numbertwo > numberone && numbertwo > numberthree) {
			largestnumber = numbertwo;
		}
		else if ( numberthree > numbertwo && numberthree > numberone) {
			largestnumber = numberthree;
		}
		return largestnumber;
	}
	public static int min3( int numberone, int numbertwo, int numberthree) {
		int smallestnumber = 0;
	
		if ( numberone < numbertwo && numberone < numberthree) {
			smallestnumber = numberone;
		}
		else if ( numbertwo < numberone && numbertwo < numberthree) {
			smallestnumber = numbertwo;
		}
		else if ( numberthree < numbertwo && numberthree < numberone) {
			smallestnumber = numberthree;
		}
		return smallestnumber;
	}
	public static int median3( int total, int smallestnumber, int largestnumber ) {
		int mediannumber = total - (smallestnumber + largestnumber);
				
		return mediannumber;
	}
}
