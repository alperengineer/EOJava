package miniProjeAsalSayi;

public class miniProjeAsalSayilar {

	public static void main(String[] args) {
		int number = 17;
		int s=0;
		
		if(number == 1) {
			System.out.println("Say� asal de�ildir...");
			return;
		}
		if(number < 1) {
			System.out.println("Ge�ersiz say� giri�i...");
		}
		
		for (int i = number; i >=1; i--) {
			if(number % i == 0) {
				s++;
			}
		}		
		
		if(s==2) {
			System.out.println("Say� asald�r...");
		}
		else if (s>2) {
			System.out.println("Say� asal de�ildir...");
		}
		
	}
}