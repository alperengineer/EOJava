package arraysDemos;

public class arraysDemos {
	public static void main(String[] args) {

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Alperen";
		ogrenciler[1] = "Gülnihal";
		ogrenciler[2] = "Emine";
		ogrenciler[3] =	"Hilal";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println((i+1)+". öðrencinin adý: "+ogrenciler[i]);
		}
		System.out.println("**************");
		
		
		// for(deðiþkenin veri tipi  takma ad : dizi adý)
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
