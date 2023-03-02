package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		//for 
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
		//while
		int i=1;
		while(i==10) {
			System.out.println(i);
			i++;
		}
		
		//do-while
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}

}
