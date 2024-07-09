package step9;

public class Test {
	
	public static void main(String[] args) {
		
		
		//計算用の値を管理する変数の宣言と初期化
		int a = 10;
		int b = 5;
		
		
		// 各クラスのインスタンスを作成
		Addition adder = new Addition(a, b);
		Subtraction substracotr = new Subtraction(a, b);
		Multiplication multiplicator = new Multiplication(a, b);
		Division divider = new Division(a, b);
		
		
		
//		//各演算をインスタンスメソッドとして呼び出し
		int addResult = adder.addnumber();
		int subtractResult = substracotr.subnumber();
		int multiplicateResult = multiplicator.multinumber();
		int divideResult = divider.divnumber();
		
		
		
		
		//足し算の計算結果
		System.out.println("a + b = " + addResult);
		System.out.println("a - b = " + subtractResult);
		System.out.println("a * b = " + multiplicateResult);
		System.out.println("a / b = " + divideResult);
		
		
		
	}
}

