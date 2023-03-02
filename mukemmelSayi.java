package mukemmelSayi;

public class mukemmelSayi {

	public static void main(String[] args) {
		int number = 6;
		int karsilastir = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				karsilastir += i;
			}
		}
		if(karsilastir == number) {
			System.out.println("Girilen "+number+" sayýsý mükemmel sayýdýr...");
		}
		else {
			System.out.println("Girilen "+number+" sayýsý mükemmel sayý deðildir...");
		}
	}

}
