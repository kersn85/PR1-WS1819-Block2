package demos;

public class Months {

	public static void main(String[] args) {
		
		String[] months = {"Jänner","Februar","März",
				"April","Mai","Juni","Juli",
				"August","September","Oktober","November",
				"Dezember"};
		
		for(int m = 0; m < months.length; m++) {
			System.out.println(months[m] + " ["+ (m+1) +"]");
		}

	}

}
