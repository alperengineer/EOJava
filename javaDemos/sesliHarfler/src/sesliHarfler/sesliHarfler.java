package sesliHarfler;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 't';
		
		if (harf == 'e' || harf == 'E' || harf == 'i' || harf == '�' || harf == '�' || harf == '�' || harf == '�' || harf == '�') {
			System.out.println("Girilen "+harf+" harfi incedir...");
		}
		else if (harf == 'a' || harf == 'A' || harf == '�' || harf == 'I' || harf == 'o' || harf == 'O' || harf == 'u' || harf == 'U') {
			System.out.println("Girilen "+harf+" harfi kal�nd�r...");
		}
		else {
			System.out.println("Ge�ersiz karakter giri�i...");
		}
	}

}
