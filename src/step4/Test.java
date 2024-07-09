package step4;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.print("1から100までの偶数の数字: ");
		
		//1から100までの数
		for (int i = 1; i <= 100; i++) {
			//偶数であれば出力
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		System.out.println();
		
		
		//奇数も出力してみた
		System.out.print("1から100までの奇数の数字: ");
		
		
		//1から100まで数
		for (int i = 1; i <= 100; i++) {
			//奇数を出力
			if (i % 2 == 1 ) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
	}

}
