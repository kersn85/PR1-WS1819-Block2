package demos;

public class Weekdays {

	public static void main(String[] args) {
		
		String[] days = {"Mo","Di","Mi","Do","Fr","Sa","So"};
		
		System.out.println("Wochentage: "+days.length);
		
		for(int d = 0; d < days.length; d++) {
			System.out.println(days[d]);
		}
	}

}
