package frNumber;

public class frNumber {

	public static void main(String[] args) {
		int number1 = 14;
		int number2 = 96;
		int total1 = 0;
		int total2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if(number1 % i == 0) {
				total1 += i;
			}
		}
		
		for (int i = 1; i < number2; i++) {
			if(number2 % i == 0) {
				total2 += i;
			}
		}
		
		if(total1 == number2 && total2 == number1) {
			System.out.println("Girilen sayýlar mükemmel sayýlardýr...");
		}
		else {
			System.out.println("Girilen sayýlar mükemmel sayýlar deðildir...");
		}
	}

}