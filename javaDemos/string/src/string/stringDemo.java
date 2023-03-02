package string;

public class stringDemo {

	public static void main(String[] args) {
		 String mesaj = "Bugün hava güzel";
		 
		 System.out.println(mesaj);
		 System.out.println("Eleman sayýsý: "+mesaj.length());
		 System.out.println("8. Eleman: "+mesaj.charAt(7));
		 System.out.println(mesaj.concat(". Haydi dýþarýya çýkalým "));
		 System.out.println(mesaj.startsWith("a"));
		 System.out.println(mesaj.endsWith("l"));
		 
		 char[] karakterler = new char[5];
		 mesaj.getChars(6, 10, karakterler, 0);
		 System.out.println(karakterler);
		 System.out.println(mesaj.indexOf('g'));
		 System.out.println(mesaj.lastIndexOf('g'));
		 
		 System.out.println(mesaj.replace('a',' '));
		 String newMessage = mesaj.replace(' ', '_');
		 System.out.println(newMessage);
		 
		 System.out.println(mesaj.substring(6));
		 System.out.println(mesaj.substring(6, 10));
		 
		 for(String kelime:mesaj.split(" ")) {
			 System.out.println(kelime);
		 }
		 
		 System.out.println(mesaj.toLowerCase());
		 System.out.println(mesaj.toUpperCase());
		 
		 String mesaj2 = "     Bugün hava güzel     ";
		 System.out.println(mesaj2);
		 System.out.println(mesaj2.trim());
	}
}
