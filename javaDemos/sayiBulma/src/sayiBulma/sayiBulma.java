package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 7;
		
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Say? dizinin i?inde vard?r...");
		}
		else {
			System.out.println("Say? dizinin i?inde yoktur...");
		}
	}
}