package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("Dersi geçtiniz, çok iyi");
			break;
		case 'B':
			System.out.println("Dersi geçtiniz, iyi");
			break;
		case 'C':
			System.out.println("Dersi geçtiniz, orta");
			break;
		case 'D':
			System.out.println("Dersi þartlý olarak geçtiniz, dikkatli olun");
			break;
		case 'F':
			System.out.println("Dersten kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz karakter giriþi yapýlmýþtýr");
		}
	}

}
