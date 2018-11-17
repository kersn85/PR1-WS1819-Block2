package demos;

public class ForLoop {

	public static void main(String[] args) {
		
		int abort = 40;
		
		for(int i = 20; ;i += 5) {
			System.out.println(i);
			if(i >= abort) {
				System.out.println("Abbruch mittels break");
				break;
			}		
		}
		
		System.out.println("Schleife 1 beendet!");

		int skip = 65;
		
		for(int i = 20; i <= 90; i += 5) {
			if(i == skip) {
				System.out.println("Fortsetzung mit continue");
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Schleife 2 beendet!");
		
		System.out.println("Programm beendet!");

	}

}
