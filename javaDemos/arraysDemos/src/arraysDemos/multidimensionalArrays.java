package arraysDemos;

public class multidimensionalArrays {
	public static void main (String[]args) {
		String[][] sehirler = new String [3][3];
		
		sehirler [0][0] = "Ýstanbul";
		sehirler [0][1] = "Bursa";
		sehirler [0][2] = "Yalova";
		sehirler [1][0] = "Denizli";
		sehirler [1][1] = "Aydýn";
		sehirler [1][2] = "Ýzmir";
		sehirler [2][0] = "Antalya";
		sehirler [2][1] = "Mersin";
		sehirler [2][2] = "Isparta";
	
		for (int i = 0; i < sehirler.length; i++) {
			System.out.println((i+1)+". Bölge\n---------------");
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("\n");
		}
		
	}

}
