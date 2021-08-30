package preCourseWork;

public class TipRecommender {

	public static void main(String[] args) {
		
		double tab = 33.57;
		String service = "Great";
		computeTip(tab, service);
		
		
		
	}
	private static void computeTip(double tab , String service) {	
	double tipAmount = 0;
	// If statements for service quality
	if (service == "Great") {
		tipAmount = (tab * .26);
		System.out.println((String.format("%.4f", tipAmount)));
	}
	else if (service == "Good") {
		tipAmount = (tab * .22);
		System.out.println((String.format("%.4f", tipAmount)));
	}
	else if (service == "Poor") {
		tipAmount = (tab * .16);
		System.out.println((String.format("%.4f", tipAmount)));
	}
	}
}
