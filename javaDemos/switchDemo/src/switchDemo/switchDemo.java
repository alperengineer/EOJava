package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("Dersi ge�tiniz, �ok iyi");
			break;
		case 'B':
			System.out.println("Dersi ge�tiniz, iyi");
			break;
		case 'C':
			System.out.println("Dersi ge�tiniz, orta");
			break;
		case 'D':
			System.out.println("Dersi �artl� olarak ge�tiniz, dikkatli olun");
			break;
		case 'F':
			System.out.println("Dersten kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz karakter giri�i yap�lm��t�r");
		}
	}

}
