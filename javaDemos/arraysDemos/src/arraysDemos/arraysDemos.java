package arraysDemos;

public class arraysDemos {
	public static void main(String[] args) {

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Alperen";
		ogrenciler[1] = "G�lnihal";
		ogrenciler[2] = "Emine";
		ogrenciler[3] =	"Hilal";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println((i+1)+". ��rencinin ad�: "+ogrenciler[i]);
		}
		System.out.println("**************");
		
		
		// for(de�i�kenin veri tipi  takma ad : dizi ad�)
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
