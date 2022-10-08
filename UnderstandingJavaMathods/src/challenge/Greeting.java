package challenge;

import java.util.Calendar;

public class Greeting {
	
	public static void sayGreeting() {
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minutes = now.get(Calendar.MINUTE);
		
		if( hour < 12) {
			System.out.println(hour + ":" + minutes + "h -> Bom dia!");
		}else if (hour >= 12 && hour < 18) {
			System.out.println(hour + ":" + minutes + "h -> Boa tarde!");
		}else {
			System.out.println(hour + ":" + minutes + "h -> Boa noite");
		}
	}
}
