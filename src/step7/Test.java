package step7;

public class Test {
	
	//たし算の関数
	public static int addition(int a, int b) {
		
		int sum = a + b;
		return sum;
		
	}
	
	//引き算の関数
	public static int subtraction(int a, int b) {
		
		int count = a - b;
		return count;
	}
	
	//掛け算の関数
	public static int multiplication(int a, int b) {
		
		int multiplication = a * b;
		return multiplication;
	}
	
	
	
	//割り算の関数
	public static int division(int a, int b) {
		
		if (b == 0) {
			throw new IllegalArgumentException("計算できません");
		}
		
		int division = a / b;
		return division;
	}
	

	
	
	public static void main(String[] args) {
		
		
		//計算用の値を管理する変数の宣言と初期化
		int a = 10;
		int b = 0;
		
		int add = addition(a, b);
		int subtract = subtraction(a, b);
		int multi = multiplication(a, b);
		int div = 0;
		try {
			div =division(a, b);
		} catch (Exception e) {
			System.out.println("割り算はできませんでした。：" + e.getMessage());
		}
		
		
		//足し算の計算結果
		System.out.println("a + b = " + add);
		
		//引き算の計算結果
		System.out.println("a - b = " + subtract);
		
		//掛け算の計算結果
		System.out.println("a * b = " + multi);
		
		//割り算の計算結果
		System.out.println("a / b = " + div);

		
		
		
		
		
		
	}
}

