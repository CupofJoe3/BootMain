package bootcamplab;

public class Aug25Challenge {

	public static void main(String[] args) {
		String str = "fr9Ghrw3gtr5glIYo";
		String num = "";
		int len = str.length();
		numberCalc(str, num, len);
	}
		public static void numberCalc(String str, String num, int len) {
		char [] each = str.toCharArray();
		for(int i = 0; i < len; i++) {
			if ((each[i] >= '0') && (each[i] <= '9')) {
				num += each[i];
			}
		}
		int numOut = Integer.parseInt(num);
		System.out.println(numOut * len);
		
	}

}
