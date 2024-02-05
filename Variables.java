//Author: Aaron Capron
//

class Variables {
	
	public static void main(String[] args) {

		int temperature = 54;
		String forecast = "Partly Cloudy";

		System.out.println("Today's Weather: ");
		System.out.println("Temperature is " + temperature + " outside");
		System.out.println("It is " + forecast + " outside.");
		System.out.println();

		temperature = temperature + 4;
		forecast = "Partly Cloudy";

		System.out.println("Today's Weather:");
		System.out.println("Temperature is " + temperature + " outside.");
		System.out.println("It is " + forecast + " outside.");

	}
}