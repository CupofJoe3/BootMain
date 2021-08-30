package bootcamplab;

public class Bonus1 {

	public static void main(String[] args) {

		String str = "Mr. John Smith    ";
	    char[] strToChar = str.toCharArray();
	    int trueLength = strToChar.length  - 4;
	    replaceSpaces(strToChar, trueLength);
	}

	public static char[] replaceSpaces(char[] strToChar, int trueLength) {
		
		for (int dex = 0; dex < trueLength; dex++) {
			char current = strToChar[dex];
			if (current != ' ') {
				System.out.print(current);
			} else {
				System.out.print("%20");
			}
		}
		
		return strToChar;
	  }
		
	

}
