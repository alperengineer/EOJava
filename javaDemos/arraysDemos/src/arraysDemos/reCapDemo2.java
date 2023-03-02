package arraysDemos;

public class reCapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1,2,1.3,4.3,5.6};
		double total = 0;
		double nMax = myList[0];
		
		for(double number:myList) {
			System.out.println(number);
			total += number;
			if(nMax<number) {
				nMax = number;
			}
		}
		
		
		
		System.out.println("Toplam: "+total);
		System.out.println("En büyük sayý: "+nMax);
		
		
	}

}
