package demos;

public class GrenzwertReihe {

	public static void main(String[] args) {
		
		double summe = 0.0;
		double vorigerWert = 0.0;
		double genauigkeit = 0.0001;
		
		for(int i = 1; ;i *= 2) {			
			summe += 1.0/i;
			if(summe - vorigerWert < genauigkeit) {
				break;
			}
			vorigerWert = summe;
		}
	
		System.out.println(summe);
		
	}

}
