package step3;

public class Test {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				int m = i * j;
				
				System.out.print(" ");
				
				if (10 > m) {
					System.out.print("");
				}
				System.out.print(m);
			}
			System.out.println();
		}
		
	}

}
