package step8;

public class Test {
	
	public static void main(String[] args) {
		
		
		//計算用の値を管理する変数の宣言と初期化
		int a = 10;
		int b = 5;
		
		
		int add = Addition.addition(a, b);
		int subtract = Subtraction.subtraction(a, b);
		int multi = Multiplication.multiplication(a, b);
		int div =Division.division(a, b);
		
		
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

