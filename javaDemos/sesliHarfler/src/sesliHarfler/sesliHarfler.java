package sesliHarfler;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 't';
		
		if (harf == 'e' || harf == 'E' || harf == 'i' || harf == 'Ý' || harf == 'ö' || harf == 'Ö' || harf == 'ü' || harf == 'Ü') {
			System.out.println("Girilen "+harf+" harfi incedir...");
		}
		else if (harf == 'a' || harf == 'A' || harf == 'ý' || harf == 'I' || harf == 'o' || harf == 'O' || harf == 'u' || harf == 'U') {
			System.out.println("Girilen "+harf+" harfi kalýndýr...");
		}
		else {
			System.out.println("Geçersiz karakter giriþi...");
		}
	}

}
