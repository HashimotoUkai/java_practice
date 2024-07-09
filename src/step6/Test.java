package step6;

public class Test {
	
	public static int addition(int a, int b) {
		
		int sum = a + b;
		
		return sum;
		
	}

	public static void main(String[] args) {
		
		
		//計算用の値を管理する変数の宣言と初期化
		int a = 5;
		int b = 10;
		
		int answer = addition(a, b);
		
		System.out.println("a + b = " + answer);
		
	}
}

