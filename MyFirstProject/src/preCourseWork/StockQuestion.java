package preCourseWork;

public class StockQuestion {

	public static void main(String[] args) {
		// Stock Purchase & CD Calculator Question
		
		// Variables
		int savings = 25000;
		int stockPrice = 989;
		int numberOfShares = savings / stockPrice;
		int cost = (numberOfShares * stockPrice);
		int remainder = (savings - cost);

		// Print function
		System.out.println("Buy " + numberOfShares + " shares of stock");
		System.out.println("Invest $" + remainder + " in CD account");
		
	}

}
