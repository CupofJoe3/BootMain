package preCourseWork;

public class MarathonQuestion {

	public static void main(String[] args) {
		// Marathon Race Time Question
		
		// Variables
		int raceTimeInSeconds = 7724;
		double raceMiles = 26.2;
		
		// Calculations
		int hours = (raceTimeInSeconds / 3600);
		int minutes = (raceTimeInSeconds%3600);
		int minutesRemainder = (minutes / 60);
		int secondsRemainder = (raceTimeInSeconds - ((minutesRemainder * 60) + (hours * 3600)));
		double pace = ((double)raceTimeInSeconds / 60) / raceMiles;
		
		// Print functions
		System.out.println(hours + "hrs:" + minutesRemainder + "mins:" + secondsRemainder + "secs");
		System.out.println("Average pace: " + String.format("%.3f", pace) + " minutes per mile");
		
	}

}
