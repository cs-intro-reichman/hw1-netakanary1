// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String ampm = "";

		String time = "";
		if (hours <= 12) {
			time = Integer.toString(hours) + ":";
			ampm = "AM";
			if (hours == 12)
				ampm = "PM";
		} else {
			time = Integer.toString(hours - 12) + ":";
			ampm = "PM";
		}

		if (minutes < 10) {
			time = time + "0" + minutes;
		} else {
			time = time + minutes;
		}
		System.out.println(time + " " + ampm);

	}
}
