package exercise53;

import java.util.regex.Pattern;

public class Clock {

	public boolean isValidTime(String time) {
		String[] hourAndMin = time.split(":");
		int hour = Integer.parseInt((hourAndMin[0]));
		return hour >= 0 && hour <= 24;
	}

}
